package com.bptn.course._15_jdbc;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
      StudentAppClass jdbc = new StudentAppClass();
        Connection conn = jdbc.createConnection();
//        jdbc.getAllStudents(conn);
//        jdbc.getStudentById(conn, 16);
        jdbc.addStudent(conn, 8, "John", "john@hello.com", "162435611");
        jdbc.closeConnection(conn);
    }
}
