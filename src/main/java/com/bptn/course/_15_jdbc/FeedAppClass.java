package com.bptn.course._15_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FeedAppClass {
	
	private static final String userName = "postgres";
	private static final String password = "pg123";
	private static final String dbName = "feedApp";
	private static final String port = "5432";
	private static final String dbUrl = "localhost";
	
	
	public Connection createConnection() {
		  Connection conn = null;
		  try {
		      // These lines load the postgresql driver, then initialize it with the variables we defined above:
		    //Class.forName("org.postgresql.Driver");
		    conn = DriverManager
		      .getConnection("jdbc:postgresql://" + dbUrl + ":" + port + "/" + dbName,
		        userName, password);
		  } catch (Exception e) {
		    System.out.println(e.getClass().getName() + ": " + e.getMessage());
		    System.exit(0);
		  }
		  System.out.println("Opened database successfully");
		  return conn;
		}
	
	
	public void addUser(Connection conn, String firstName, String lastName, String username, String phone,String emailId, String password, boolean emailVerified) {
		try {
			PreparedStatement stmt = null;
			String sql = "INSERT INTO \"User\" (\"firstName\", \"lastName\", \"username\", \"phone\", \"emailId\", \"password\", \"emailVerified\", \"createdOn\") VALUES (?, ?, ?, ?, ?, ?, ?, CURRENT_TIMESTAMP)";
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, firstName); 
			stmt.setString(2, lastName); 
			stmt.setString(3, username); 
			stmt.setString(4, phone);
			stmt.setString(5, emailId);
			stmt.setString(6, password);
			stmt.setBoolean(7, emailVerified);
			int resultCount = stmt.executeUpdate();
			System.out.println(resultCount + " record(s) inserted");
		} catch (SQLException ex) {
        // handle exception
        System.out.println("Exception:" + ex.getMessage());
		}
	}
	
	
	  // Here, we define a function that will make use of the connection we've created above:
	public void getAllUsers(Connection conn) {
	  try {
	    Statement stmt = null;
	    stmt = conn.createStatement();
	      // This line creates our SQL statement to select all entries from the student table:
	    String sql = "SELECT * FROM \"User\"";
	      // This line executes the query in the line above, setting its results to a ResultSet object called rs:
	    ResultSet rs = stmt.executeQuery(sql);
	      // While there is data in the returned result set, we will print that line to the console:
	    while (rs.next()) {
	      // Retrieve by column name
	      System.out.print("User ID: " + rs.getInt("userId"));
	      System.out.print(", User Name: " + rs.getString("username"));
	      System.out.print(", User Email: " + rs.getString("emailId"));
	      System.out.println(", User Phone: " + rs.getString("phone"));
	    }
	      // Here, we close our connection:
	    stmt.close();
	  } catch (SQLException ex) {
	    // And of course, we handle exceptions in case our query is unsuccessful: 
	    System.out.println("Exception:" + ex.getMessage());
	  }
	}
	
	  // This code can be called upon to close our connections. To see it in use, check the Main.java file below:
	public boolean closeConnection(Connection conn) {
	  boolean flag = true;
	  try {
	    conn.close();
	  } catch (SQLException ex) {
	    flag = false;
	    // Handle exception, in case of any errors:
	    System.out.println("Exception:" + ex.getMessage());
	  }
	  return flag;
	}
	
}
