/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.koneksi;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
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

    public String getSHA1(String text)
            throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MessageDigest md;
        md = MessageDigest.getInstance("SHA-1");
        byte[] sha1hash = new byte[40];
        md.update(text.getBytes("iso-8859-1"), 0, text.length());
        sha1hash = md.digest();
        return convertToHex(sha1hash);
    }

    private String convertToHex(byte[] data) {
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < data.length; i++) {
            int halfbyte = (data[i] >>> 4) & 0x0F;
            int two_halfs = 0;
            do {
                if ((0 <= halfbyte) && (halfbyte <= 9)) {
                    buf.append((char) ('0' + halfbyte));
                } else {
                    buf.append((char) ('a' + (halfbyte - 10)));
                }
                halfbyte = data[i] & 0x0F;
            } while (two_halfs++ < 1);
        }
        return buf.toString();
    }
}
