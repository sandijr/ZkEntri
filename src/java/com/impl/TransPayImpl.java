/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.impl;

import com.dao.TransPayDao;
import com.koneksi.DaoFactory;
import com.koneksi.koneksi;
import com.model.TestTbl;
import com.model.VwTahunTranspay;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class TransPayImpl implements TransPayDao {

    public List<VwTahunTranspay> getVwTahunTranspay(DaoFactory daoFactory) {
        ResultSet rs = null;
        PreparedStatement ps = null;
        List<VwTahunTranspay> ret = new ArrayList<VwTahunTranspay>();
        Connection con = null;
        try {
            con = daoFactory.getConnection();
            String query = "select TAHUN  from  vw_tahun_transpay ORDER BY TAHUN DESC ";

            ps = con.prepareStatement(query, ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);

            rs = ps.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                    VwTahunTranspay test = new VwTahunTranspay();
                    test.setTahun(rs.getInt("TAHUN"));
                    ret.add(test);
                }
            }

        } catch (SQLException e) {
        } finally {
            koneksi.safeClose(rs, ps, con);
        }
        return ret;
    }

}
