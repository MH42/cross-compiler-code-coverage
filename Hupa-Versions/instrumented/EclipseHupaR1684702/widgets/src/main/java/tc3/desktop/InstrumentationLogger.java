package tc3.desktop;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.logging.Logger;
// Note: We use Java 1.4 compatible code
public class InstrumentationLogger implements Instrumentation {
	private String testCaseName = "UndefinedTestName"+new SimpleDateFormat("yy-MM-dd-hh:mm:ss").format(new Date());
	private String dbName = "gwt_test_case_selection";
	private String tableName = "test_logs";
	private int totalNumberOfTestCases;
//	private static final String __ = "__";
	// HUPA:
//	private static final String __ = "_____";
	private static final String cidSeparator = "__";
	ConcurrentHashMap nodeIdentifierSetMap = new ConcurrentHashMap(5, (float) 0.75);
	private Logger logger = Logger.getLogger(this.getClass().getName());

	public void startLogging(String testCaseName) {
		this.testCaseName = testCaseName;	
	}

	public void stopLogging() {
		System.out.println("stop test");
		try {
			writeBufferedDataToDB();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void setupDB() {
		new PreparedStatementThread().setupInitialDatabaseAndTable(dbName, tableName);
	}
	
	public void instrument(String nodeIdentifier) {
		NodeIdentifierSet nodeIdentifierSet = getNodeIdentifierSet();
		String[] splittedNodeIds = nodeIdentifier.split(cidSeparator);
		for(int i = 0; i < splittedNodeIds.length; i++) {
			boolean added = nodeIdentifierSet.add(splittedNodeIds[i]);
		}
	}
	
	private NodeIdentifierSet getNodeIdentifierSet() {
		NodeIdentifierSet nis = (NodeIdentifierSet) nodeIdentifierSetMap.get(testCaseName);
		if(nis == null) { 
			System.out.println("no such log file present => create new one");
			nis = new NodeIdentifierSet();
			nodeIdentifierSetMap.put(testCaseName, nis);
		}
		return nis;
	}
	
	private void writeBufferedDataToDB() throws InterruptedException {
		synchronized (nodeIdentifierSetMap) {
			testCaseName = "UndefinedTestName"+new SimpleDateFormat("yy-MM-dd-hh:mm:ss").format(new Date());
			final Set entries = nodeIdentifierSetMap.entrySet();
			final Iterator iterator = entries.iterator();
			CountDownLatch countDownLatch = new CountDownLatch(entries.size());
			while(iterator.hasNext()) {
				final Entry testCase = (Entry) iterator.next();
				System.out.println("testcase "+testCase.getKey());
				final DBWriterThread dbWriterThread = new DBWriterThread(dbName, tableName, (NodeIdentifierSet)testCase.getValue(), (String)testCase.getKey(), countDownLatch);
				logger.warning("number of cids "+((ConcurrentHashMap) testCase.getValue()).keySet().size());
				totalNumberOfTestCases += ((ConcurrentHashMap) testCase.getValue()).keySet().size();
				Thread t = new Thread(dbWriterThread);
				t.start();
				iterator.remove();
				System.out.println("Number of testcases after removing: "+nodeIdentifierSetMap.size());
			}
			logger.warning("Total number of cids: "+totalNumberOfTestCases);
			countDownLatch.await();
		}
	}
	
}
