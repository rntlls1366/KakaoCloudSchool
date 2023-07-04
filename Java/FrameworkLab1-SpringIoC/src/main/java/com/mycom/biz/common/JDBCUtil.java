package com.mycom.biz.common;

import java.sql.*;

public class JDBCUtil {
    public static Connection getConnection() {
        final String driver = "org.mariadb.jdbc.Driver";
        final String DB_IP = "localhost";
        final String DB_PORT = "3306";
        final String DB_NAME = "test";
        final String DB_URL =
                "jdbc:mariadb://" + DB_IP + ":" + DB_PORT + "/" + DB_NAME;

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            Class.forName(driver);                
            conn = DriverManager.getConnection(DB_URL, "root", "");
                                          //아이디 패스워드 수정할 것 
            if (conn != null) {
                System.out.println("DB 접속 성공");
            }
            return conn;

        } catch (ClassNotFoundException e) {
            System.out.println("드라이버 로드 실패");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("DB 접속 실패");
            e.printStackTrace();
        }
        return null;
    }
    public static void close(PreparedStatement stmt, Connection conn) {
        close(null,stmt,conn);
    }
    public static void close(ResultSet rs, PreparedStatement stmt, Connection conn)
    {      try {if(rs != null)rs.close();
    } catch (Exception e) {e.printStackTrace();
    } finally { rs = null; }
        try {if(stmt != null) stmt.close();
        } catch (Exception e) {e.printStackTrace();
        } finally {stmt = null; }
        try {if(conn != null)conn.close();
        } catch (Exception e) {e.printStackTrace();
        } finally {conn = null; }
    }

    public static void main(String[] args) {
        getConnection();
    }
}