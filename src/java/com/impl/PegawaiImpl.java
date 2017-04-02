/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.impl;

import com.dao.PegawaiDao;
import com.koneksi.DaoFactory;
import com.koneksi.koneksi;
import com.model.DarahTbl;
import com.model.Pegawai;
import com.model.PenugasanTest;
import com.model.TestTbl;
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
public class PegawaiImpl implements PegawaiDao {

    public List<Pegawai> getPegawaiByNama(DaoFactory daoFactory, String nama) {
        ResultSet rs = null;
        PreparedStatement ps = null;
        List<Pegawai> ret = new ArrayList<Pegawai>();
        Connection con = null;
        try {

            con = daoFactory.getConnection();
            String query = "select a.NRK, a.NAMA, a.darah, b.nmdarah  from  PEGAWAI a, darah_tbl b"
                    + " WHERE UCASE(NAMA) LIKE ? "
                    + " and a.darah=b.darah ";

            ps = con.prepareStatement(query, ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
            ps.setString(1, "%" + nama.toUpperCase() + "%");
            rs = ps.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                    Pegawai peg = new Pegawai();
                    peg.setNrk(rs.getString("NRK"));
                    peg.setNama(rs.getString("NAMA"));

                    DarahTbl darah = new DarahTbl();
                    darah.setDarah(rs.getShort("DARAH"));
                    darah.setNmdarah(rs.getString("NMDARAH"));

                    peg.setDarah(darah);
                    ret.add(peg);
                }
            }

        } catch (SQLException e) {
        } finally {
            koneksi.safeClose(rs, ps, con);
        }
        return ret;
    }

    public Pegawai getPegawaiByNrk(DaoFactory daoFactory, String nrk) {
        ResultSet rs = null;
        PreparedStatement ps = null;
        Pegawai ret = null;
        Connection con = null;
        try {

            con = daoFactory.getConnection();
            String query = "select NRK, NAMA  from  PEGAWAI WHERE NRK = ?  ";

            ps = con.prepareStatement(query, ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
            ps.setString(1, nrk);
            rs = ps.executeQuery();
            if (rs != null) {
                ret = new Pegawai();
                while (rs.next()) {
                    ret.setNrk(rs.getString("NRK"));
                    ret.setNama(rs.getString("NAMA"));
                }

            }

        } catch (SQLException e) {
        } finally {
            koneksi.safeClose(rs, ps, con);
        }
        return ret;
    }

    public List<Pegawai> getPegawaiByTglLahir(DaoFactory daoFactory, Date tgllahiraa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<PenugasanTest> getTujuanPenugasan(DaoFactory daoFactory) {
        ResultSet rs = null;
        PreparedStatement ps = null;
        List<PenugasanTest> ret = new ArrayList<PenugasanTest>();
        Connection con = null;
        try {

            con = daoFactory.getConnection();
            String query = " SELECT DISTINCT UCASE(TUJUAN) AS TUJUAN  FROM PENUGASAN WHERE NRK='87110009'   ";
            ps = con.prepareStatement(query, ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
            rs = ps.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                    PenugasanTest peg = new PenugasanTest();
                    peg.setTujuan(rs.getString("TUJUAN"));
                    ret.add(peg);
                }
            }

        } catch (SQLException e) {
        } finally {
            koneksi.safeClose(rs, ps, con);
        }
        return ret;
    }

}
