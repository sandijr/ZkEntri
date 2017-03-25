/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.koneksi.DaoFactory;
import com.model.TestTbl;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author user
 */
public interface testTbldao {

    //select
    TestTbl getTestTbl(DaoFactory daoFactory, String nrk);

    List<TestTbl> getTestTblSemua(DaoFactory daoFactory);

    List<TestTbl> getTestTblByNama(DaoFactory daoFactory, String nama);

    void saveTestTbl(DaoFactory daoFactory, TestTbl testTbl);

    void updateTestTbl(DaoFactory daoFactory, TestTbl testTbl);

    void hapusTestTbl(DaoFactory daoFactory, String nrk);
}
