package com.bptn.course._15_jdbc;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
    	FeedAppClass jdbc = new FeedAppClass();
        Connection conn = jdbc.createConnection();
//        jdbc.addUser(conn, "John", "Doe", "johndoe123", "12345567", "john123@hello.com", "john123", false);
        jdbc.getAllUsers(conn);
        jdbc.closeConnection(conn);
    }
}
