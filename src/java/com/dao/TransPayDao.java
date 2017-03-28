/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.koneksi.DaoFactory;
import com.model.VwTahunTranspay;
import java.util.List;

/**
 *
 * @author user
 */
public interface TransPayDao {

    List<VwTahunTranspay> getVwTahunTranspay(DaoFactory daoFactory);
}
