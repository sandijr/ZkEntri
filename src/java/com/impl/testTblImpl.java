/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.impl;

import com.dao.testTbldao;
import com.koneksi.DaoFactory;
import com.koneksi.koneksi;
import com.model.TestTbl;
import com.model.UserTbls;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author user
 */
public class testTblImpl implements testTbldao {

    public TestTbl getTestTbl(DaoFactory daoFactory, String nrk) {
        ResultSet rs = null;
        PreparedStatement ps = null;
        TestTbl ret = null;
        Connection con = null;
        try {

            con = daoFactory.getConnection();
            String query = "select NRK, NAMA, JENKEL, TALHIR, NKPNFORMAL from  DATUM_TBL  WHERE NRK = ?  ";

            ps = con.prepareStatement(query, ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
            ps.setString(1, nrk);
            rs = ps.executeQuery();
            if (rs != null) {
                ret = new TestTbl();
                while (rs.next()) {
                    ret.setNrk(rs.getString("NRK"));
                    ret.setNama(rs.getString("NAMA"));
                    ret.setJenkel(rs.getShort("JENKEL"));
                    ret.setTalhir(rs.getDate("TALHIR"));
                    ret.setNkpnformal(rs.getBigDecimal("NKPNFORMAL"));
                }

            }

        } catch (SQLException e) {
        } finally {
            koneksi.safeClose(rs, ps, con);
        }
        return ret;
    }

    public List<TestTbl> getTestTblSemua(DaoFactory daoFactory) {
        ResultSet rs = null;
        PreparedStatement ps = null;
        List<TestTbl> ret = new ArrayList<TestTbl>();
        Connection con = null;
        try {

            con = daoFactory.getConnection();
            String query = "select NRK, NAMA, JENKEL, TALHIR, NKPNFORMAL from  DATUM_TBL  ";

            ps = con.prepareStatement(query, ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);

            rs = ps.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                    TestTbl test = new TestTbl();
                    test.setNrk(rs.getString("NRK"));
                    test.setNama(rs.getString("NAMA"));
                    test.setJenkel(rs.getShort("JENKEL"));
                    test.setTalhir(rs.getDate("TALHIR"));
                    test.setNkpnformal(rs.getBigDecimal("NKPNFORMAL"));
                    ret.add(test);
                }
            }

        } catch (SQLException e) {
        } finally {
            koneksi.safeClose(rs, ps, con);
        }
        return ret;
    }

    public List<TestTbl> getTestTblByNama(DaoFactory daoFactory, String nama) {
        ResultSet rs = null;
        PreparedStatement ps = null;
        List<TestTbl> ret = new ArrayList<TestTbl>();
        Connection con = null;
        try {

            con = daoFactory.getConnection();
            String query = "select NRK, NAMA, JENKEL, TALHIR, NKPNFORMAL from  DATUM_TBL WHERE UCASE(NAMA) LIKE ? ";

            ps = con.prepareStatement(query, ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
            ps.setString(1, "%" + nama.toUpperCase() + "%");
            rs = ps.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                    TestTbl test = new TestTbl();
                    test.setNrk(rs.getString("NRK"));
                    test.setNama(rs.getString("NAMA"));
                    test.setJenkel(rs.getShort("JENKEL"));
                    test.setTalhir(rs.getDate("TALHIR"));
                    test.setNkpnformal(rs.getBigDecimal("NKPNFORMAL"));
                    ret.add(test);
                }
            }

        } catch (SQLException e) {
        } finally {
            koneksi.safeClose(rs, ps, con);
        }
        return ret;
    }

    public void saveTestTbl(DaoFactory daoFactory, TestTbl testTbl) {
        Connection con = null;
        PreparedStatement ps = null;
        try {

            con = daoFactory.getConnection();
            String sql = " INSERT INTO DATUM_TBL (NRK, NAMA, JENKEL, TALHIR, NKPNFORMAL) "
                    + " VALUES (?,?,?,?,?) ";
            ps = con.prepareStatement(sql);
            ps.setString(1, testTbl.getNrk());
            ps.setString(2, testTbl.getNama());
            ps.setInt(3, testTbl.getJenkel());
            ps.setDate(4, new java.sql.Date(testTbl.getTalhir().getTime()));
            ps.setBigDecimal(5, testTbl.getNkpnformal());

            ps.executeUpdate();
            // con.close();

        } catch (Exception err) {
            err.getMessage().toString();
        } finally {
            koneksi.safeClose(null, ps, con);
        }
    }

    public void updateTestTbl(DaoFactory daoFactory, TestTbl testTbl) {
        PreparedStatement ps = null;
        Connection con = null;
        try {

            con = daoFactory.getConnection();
            String sql = " UPDATE DATUM_TBL "
                    + " SET NAMA=?, "
                    + " JENKEL=?, "
                    + " TALHIR=?, "
                    + " NKPNFORMAL=? "
                    + " WHERE NRK=? ";
            ps = con.prepareStatement(sql);
            ps.setString(1, testTbl.getNama());
            ps.setInt(2, testTbl.getJenkel());
            ps.setDate(3, new java.sql.Date(testTbl.getTalhir().getTime()));
            ps.setBigDecimal(4, testTbl.getNkpnformal());
            ps.setString(5, testTbl.getNrk());

            ps.executeUpdate();
            //con.close();

        } catch (Exception err) {
            err.getMessage().toString();
        } finally {
            koneksi.safeClose(null, ps, con);
        }
    }

    public void hapusTestTbl(DaoFactory daoFactory, String nrk) {
        PreparedStatement ps = null;
        Connection con = null;
        try {

            con = daoFactory.getConnection();
            String sql = " DELETE FROM DATUM_TBL "
                    + " WHERE NRK=? ";
            ps = con.prepareStatement(sql);
            ps.setString(1, nrk);

            ps.executeUpdate();
            //con.close();

        } catch (Exception err) {
            err.getMessage().toString();
        } finally {
            koneksi.safeClose(null, ps, con);
        }
    }

    public void updateTglLahirTestTbl(DaoFactory daoFactory, Date tgllhr, String nrk) {
        PreparedStatement ps = null;
        Connection con = null;
        try {

            con = daoFactory.getConnection();
            String sql = " UPDATE DATUM_TBL "
                    + " SET TALHIR=? "
                    + " WHERE NRK=? ";
            ps = con.prepareStatement(sql);
            ps.setDate(1, new java.sql.Date(tgllhr.getTime()));
            ps.setString(2, nrk);

            ps.executeUpdate();
            //con.close();

        } catch (Exception err) {
            err.getMessage().toString();
        } finally {
            koneksi.safeClose(null, ps, con);
        }
    }

}
