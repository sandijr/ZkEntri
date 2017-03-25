/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author user
 */
public class koneksi {

    public static Connection BuatKoneksiDB2(String user, String pwd) throws SQLException {
        Connection con = null;
        try {
            Class.forName(Config.JDBC_DB2_DRIVER);
        } catch (java.lang.ClassNotFoundException e) {
            System.err.println(e.getMessage());
        }
        try {
            con = DriverManager.getConnection(Config.JDBC_DB2_URL, user, pwd);
        } catch (SQLException ex) {
        }
        return con;
    }
     public static void safeClose(ResultSet rs, Statement statement, Connection con) {
        try {
            if (statement != null) {
                statement.close();
            }
        } catch (SQLException ex) {
            // ignore this
        }
        try {
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException ex) {
            // ignore this
        }
        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException ex) {
            // ignore this
        }
    }
}
