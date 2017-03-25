/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.impl;

import com.dao.userDao;
import com.koneksi.Config;
import com.koneksi.DaoFactory;
import com.koneksi.koneksi;
import com.model.UserTbls;
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
public class userImpl implements userDao {

    public UserTbls getUser(DaoFactory daoFactory, String pemakai) {

        ResultSet rs = null;
        PreparedStatement ps = null;
        UserTbls ret = null;
        Connection con = null;
        try {

            String query = " SELECT PEMAKAI, NRK, NRK AS NRK2 FROM USER_TBL WHERE UCASE(PEMAKAI)= ? ";
            con = daoFactory.getConnection();
            ps = con.prepareStatement(query, ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
            ps.setString(1, pemakai.toUpperCase());
            rs = ps.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                    ret = new UserTbls();

                    ret.setPemakai(rs.getString("PEMAKAI"));
                    ret.setNrk(rs.getString("NRK2"));

                }

            }

        } catch (SQLException e) {
        } finally {
            koneksi.safeClose(rs, ps, con);
        }
        return ret;
    }

}
