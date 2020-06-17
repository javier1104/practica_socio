package com.develop.socios.datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Conexion {
    private static final String JDBC_URL = "jdbc:postgresql://localhost/sociosdb";
    private static final String JDBC_USER = "postgres";
    private static final String JDBC_PASSWORD = "root";


    public static Connection getConnection()throws SQLException{
        return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
    }

    public static void close(ResultSet rs){
        try {
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
    }

    public static void close(PreparedStatement ps){
        try {
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
    }

    public static void close(Connection cn){
        try {
            cn.close();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
    }
    
}