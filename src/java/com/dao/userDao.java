/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.model.UserTbls;
import java.sql.Connection;

/**
 *
 * @author user
 */
public interface userDao {

    public UserTbls getUser(Connection con, String pemakai);
}
