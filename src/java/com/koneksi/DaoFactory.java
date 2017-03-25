package com.koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
public abstract class DaoFactory {
    public static DaoFactory getInstance(String url, String driverClassName, String username, String password) {
        DaoFactory instance;
        if (driverClassName != null) {
            try {
                Class.forName(driverClassName);
            } catch (ClassNotFoundException e) {
            }
            instance = new DriverManagerDAOFactory(url, username, password);
        } else {
            DataSource dataSource = null;
            try {
                dataSource = (DataSource) new InitialContext().lookup(url);
            } catch (NamingException e) {
            }
            if (username != null) {
                instance = new DataSourceWithLoginDAOFactory(dataSource, username, password);
            } else {
                instance = new DataSourceDAOFactory(dataSource);
            }
        }

        return instance;
    }
    public abstract Connection getConnection() throws SQLException;
}
class DriverManagerDAOFactory extends DaoFactory {
    private String url;
    private String username;
    private String password;
    DriverManagerDAOFactory(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }
    @Override
    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, username, password);
    }
}
class DataSourceDAOFactory extends DaoFactory {
    private DataSource dataSource;
    DataSourceDAOFactory(DataSource dataSource) {
        this.dataSource = dataSource;
    }
    @Override
    public Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }
}
class DataSourceWithLoginDAOFactory extends DaoFactory {
    private DataSource dataSource;
    private String username;
    private String password;
    DataSourceWithLoginDAOFactory(DataSource dataSource, String username, String password) {
        this.dataSource = dataSource;
        this.username = username;
        this.password = password;
    }
    @Override
    public Connection getConnection() throws SQLException {
        return dataSource.getConnection(username, password);
    }
}