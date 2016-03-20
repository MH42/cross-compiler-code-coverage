package tc3.desktop;

import java.util.concurrent.CountDownLatch;


class DBWriterThread implements Runnable {
	private NodeIdentifierSet nodeIdentifierSet;
	private String testName;
	private String dbName;
	private String tableName;
	private CountDownLatch dbWriterCountDownLatch;
	
	public DBWriterThread(String dbName, String tableName, NodeIdentifierSet nodeIdentifierSet, String testName, CountDownLatch countDownLatch) {
		this.nodeIdentifierSet = nodeIdentifierSet;
		this.testName = testName;
		this.dbName = dbName;
		this.tableName = tableName;
		this.dbWriterCountDownLatch = countDownLatch;
	}

	public void run() {
		try {
			int i = 0;
			int limit = 10000;
			System.out.println("Size of the key set: "+nodeIdentifierSet.keySet().size());
			String[] splittedNodeIds = (String[]) nodeIdentifierSet.keySet().toArray(new String[1]);
			CountDownLatch preparedStmtCountDownLatch = new CountDownLatch(splittedNodeIds.length/limit+1);
			PreparedStatementThread preparedStatementThread = new PreparedStatementThread(dbName, tableName, preparedStmtCountDownLatch);
			for(int j = 0; j < splittedNodeIds.length; j++) {
				final Integer amount = (Integer) nodeIdentifierSet.get(splittedNodeIds[j]);
				preparedStatementThread.writeToDB(splittedNodeIds[j], testName, amount.intValue());
				i++;
				if(i >= limit) {
					preparedStatementThread.executeBatch();
					preparedStatementThread = new PreparedStatementThread(dbName, tableName, preparedStmtCountDownLatch);
					System.out.println("DBWriterThread: run(), executeBatch");
					i = 0;
				}
			}
			preparedStatementThread.executeBatch();
			System.out.println("DBWriterThread: run(), final executeBatch");  
			System.out.println("i "+i);
			preparedStmtCountDownLatch.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		finally {
			dbWriterCountDownLatch.countDown();
		}
	}
	
}
