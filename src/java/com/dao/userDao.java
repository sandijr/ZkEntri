/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.koneksi.DaoFactory;
import com.model.UserTbls;

/**
 *
 * @author user
 */
public interface userDao {

    public UserTbls getUser(DaoFactory daoFactory, String pemakai);
}
