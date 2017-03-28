/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.koneksi.DaoFactory;
import com.model.Pegawai;
import java.util.Date;
import java.util.List;

/**
 *
 * @author user
 */
public interface PegawaiDao {

    //Methode Cari Nama
    List<Pegawai> getPegawaiByNama(DaoFactory daoFactory,String nama);

    Pegawai getPegawaiByNrk(DaoFactory daoFactory, String nrk);
    
    List<Pegawai> getPegawaiByTglLahir(DaoFactory daoFactory, Date tgllahiraa);
    

}
