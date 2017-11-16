package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.*;

public class Myconnection {
    private static String USER = "root";
    private static String PASSWORD = "root";
    private static String DB_URL = "jdbc:mysql://localhost:3306/test";
    private static String DB_DRIVER = "com.mysql.jdbc.Driver";
//  private static String SQL = "";
    private static Connection connection = null;
    public static Connection getConnection(){

        try {
            Class.forName(DB_DRIVER);
            connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);
        } catch (Exception e) {
            System.out.println("连接失败");
            e.printStackTrace();
        }
        return connection;
    }
    public  static void closeConnection(Connection connection){

                    if(connection != null){
                        try {
                            connection.close(); //
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
    }