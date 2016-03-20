package tc3.desktop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.CountDownLatch;

class PreparedStatementThread implements Runnable {
	private PreparedStatement preparedStatement;
	private Connection connection;
	private CountDownLatch countDownLatch;
	
	public PreparedStatementThread(String dbName, String tableName, CountDownLatch countDownLatch) {
		this.countDownLatch = countDownLatch;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost/"+dbName+"?user=root&password=");
			preparedStatement = connection.prepareStatement("INSERT INTO "+dbName+"."+tableName+" VALUES (default, ?, ?, ?)");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public PreparedStatementThread() {
	}

	public PreparedStatement writeToDB(String splittedNodeId, String testName, int amount) {
		try {
			preparedStatement.setString(1, splittedNodeId);
			preparedStatement.setString(2, testName);
			preparedStatement.setInt(3, amount);
			preparedStatement.addBatch();
			return preparedStatement;
		} catch (SQLException e) {
			e.printStackTrace();
			return preparedStatement;
		}
	}
	
	public void executeBatch() {
		new Thread(this).start();
	}

	public void run() {
		try {
			preparedStatement.executeBatch();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(preparedStatement != null)
					preparedStatement.close();
				if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			countDownLatch.countDown();
		}
	}
	
	public void setupInitialDatabaseAndTable(String dbName, String tableName) {
		Statement s = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost/"+dbName+"?user=root&password=");
			createDatabase(dbName);
			createTable(dbName, tableName, "cid", "testname", "amount");
			String truncateTable = "TRUNCATE TABLE "+ tableName;
			s = connection.createStatement();
			s.executeUpdate(truncateTable);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
				try {
					if(s != null)
						s.close();
					if(connection != null)
						connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
	}
	
	private void createDatabase(String dbName) {
		Statement stmt = null;
		try {
			stmt = connection.createStatement();
			final int res = stmt.executeUpdate("CREATE DATABASE IF NOT EXISTS "+dbName+" DEFAULT CHARACTER SET latin1 COLLATE latin1_general_ci");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(stmt != null)
					stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	private void createTable(String dbName, String tableName, String cid, String testname, String amount) {
		Statement stmt = null;
		try {
			String createTable = "CREATE TABLE IF NOT EXISTS "+tableName+" ("
					+ "id INT(11) NOT NULL PRIMARY KEY AUTO_INCREMENT, " 
					+ "cid VARCHAR(512) NOT NULL, "
					+ "testname VARCHAR(256) NOT NULL, "
					+ "amount INT(11) NOT NULL "
					+ ")";
			stmt = connection.createStatement();
			stmt.executeUpdate(createTable);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(stmt != null)
					stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
}
