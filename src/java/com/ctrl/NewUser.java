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
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Button;
import org.zkoss.zul.Messagebox;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.Window;

/**
 *
 * @author user
 */
public class NewUser extends GenericForwardComposer {

    private Textbox txtNRK;
    private Textbox txtUser;
    private Textbox txtPwd;
    private Textbox txtNama;
    private Button btnSimpan, btnTampilPeg;
    private Window winpeg;

    @Override
    public void doAfterCompose(Component comp) throws Exception {
        super.doAfterCompose(comp);
         session.setAttribute("NewUser", this);

    }

    public void onClick$btnTampilPeg() {
         if (getWinpeg()!= null) {
            getWinpeg().detach();   
        }
        HashMap hm = new HashMap<String, String>(); 
        setWinpeg((Window) Executions.createComponents("/vwpegawai.zul", null, hm));
        getWinpeg().setClosable(true);
        getWinpeg().doModal();
        
    }
    public void onClick$btnSimpan() {

        try {
            String nrk = getTxtNRK().getValue();
            String user = getTxtUser().getValue();
            String pwd = getTxtPwd().getValue();
            DaoFactory dao = DaoFactory.getInstance(Config.JDBC_DB2_URL, Config.JDBC_DB2_DRIVER, Config.JDBC_USER, Config.JDBC_PWD);

            UserTbls usertbl = new UserTbls();
            usertbl.setNrk(nrk);
            usertbl.setPemakai(user);

            koneksi kon = new koneksi();
            String pwdEncript = kon.getSHA1(pwd);
            usertbl.setPwd(pwdEncript);

            userDao userdao = new userImpl();
            userdao.saveUserTbl(dao, usertbl);
            Messagebox.show("User berhasil disimpan");

        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(NewUser.class.getName()).log(Level.SEVERE, null, ex);
            Messagebox.show("User gagal disimpan");
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(NewUser.class.getName()).log(Level.SEVERE, null, ex);
            Messagebox.show("User gagal disimpan");
        }
    }

    /**
     * @return the txtNRK
     */
    public Textbox getTxtNRK() {
        return txtNRK;
    }

    /**
     * @param txtNRK the txtNRK to set
     */
    public void setTxtNRK(Textbox txtNRK) {
        this.txtNRK = txtNRK;
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
     * @return the btnSimpan
     */
    public Button getBtnSimpan() {
        return btnSimpan;
    }

    /**
     * @param btnSimpan the btnSimpan to set
     */
    public void setBtnSimpan(Button btnSimpan) {
        this.btnSimpan = btnSimpan;
    }

    /**
     * @return the btnTampilPeg
     */
    public Button getBtnTampilPeg() {
        return btnTampilPeg;
    }

    /**
     * @param btnTampilPeg the btnTampilPeg to set
     */
    public void setBtnTampilPeg(Button btnTampilPeg) {
        this.btnTampilPeg = btnTampilPeg;
    }

    /**
     * @return the winpeg
     */
    public Window getWinpeg() {
        return winpeg;
    }

    /**
     * @param winpeg the winpeg to set
     */
    public void setWinpeg(Window winpeg) {
        this.winpeg = winpeg;
    }

    /**
     * @return the txtNama
     */
    public Textbox getTxtNama() {
        return txtNama;
    }

    /**
     * @param txtNama the txtNama to set
     */
    public void setTxtNama(Textbox txtNama) {
        this.txtNama = txtNama;
    }
}
