/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ctrl;

import com.dao.userDao;
import com.impl.userImpl;
import com.koneksi.Config;
import com.koneksi.DaoFactory;
import com.koneksi.koneksi;
import com.model.UserTbls;
import com.sun.xml.internal.ws.api.message.Message;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Button;
import org.zkoss.zul.Messagebox;
import org.zkoss.zul.Textbox;

/**
 *
 * @author user
 */
public class Login extends GenericForwardComposer {

    private Textbox txtUser;
    private Textbox txtPwd;
    private Button btnLogin;

    @Override
    public void doAfterCompose(Component comp) throws Exception {

        super.doAfterCompose(comp);

    }

    public void onClick$btnLogin() {
        String user = getTxtUser().getValue();
        String pwd = getTxtPwd().getValue();

        userDao userdao = new userImpl();
        Connection con = null;

        DaoFactory dao = DaoFactory.getInstance(Config.JDBC_DB2_URL, Config.JDBC_DB2_DRIVER, user, pwd);//Config.JDBC_URL
        try {
            con = koneksi.BuatKoneksiDB2(user, pwd);
            if (!con.isClosed()) {
                UserTbls usertbl = userdao.getUser(dao, user);
                if (usertbl != null) {
                    session.setAttribute("daofactory", dao);
                    Executions.getCurrent().sendRedirect("crud.zul");
                } else {
//           
                    session.setAttribute("daofactory", null);
                    session.invalidate();
                    Messagebox.show("Anda tidak berhak menggunakan Aplikasi ");
                }
            } else {
                session.setAttribute("daofactory", null);
                session.invalidate();
                Messagebox.show("Anda tidak berhak menggunakan Aplikasi ");
            }
            koneksi.safeClose(null, null, con);
        } catch (SQLException ex) {
            koneksi.safeClose(null, null, con);
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            session.setAttribute("daofactory", null);
            session.invalidate();
            Messagebox.show("Anda tidak berhak menggunakan Aplikasi ");
        }

    }

    /**
     * @return the txtUser
     */
    public Textbox getTxtUser() {
        return txtUser;
    }

    /**
     * @param txtUser the txtUser to set
     */
    public void setTxtUser(Textbox txtUser) {
        this.txtUser = txtUser;
    }

    /**
     * @return the txtPwd
     */
    public Textbox getTxtPwd() {
        return txtPwd;
    }

    /**
     * @param txtPwd the txtPwd to set
     */
    public void setTxtPwd(Textbox txtPwd) {
        this.txtPwd = txtPwd;
    }

    /**
     * @return the btnLogin
     */
    public Button getBtnLogin() {
        return btnLogin;
    }

    /**
     * @param btnLogin the btnLogin to set
     */
    public void setBtnLogin(Button btnLogin) {
        this.btnLogin = btnLogin;
    }

}
