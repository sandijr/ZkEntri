/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ctrl;

import com.dao.testTbldao;
import com.impl.testTblImpl;
import com.koneksi.Config;
import com.koneksi.DaoFactory;
import com.model.TestTbl;
import java.sql.Connection;
import org.zkoss.zk.ui.Component;
import static org.zkoss.zk.ui.util.Clients.response;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Button;
import org.zkoss.zul.Datebox;
import org.zkoss.zul.Messagebox;
import org.zkoss.zul.Radio;
import org.zkoss.zul.Textbox;

/**
 *
 * @author user
 */
public class crud extends GenericForwardComposer {

    private Textbox txtNRK;
    private Textbox txtNama;
    private Textbox txtGaji;
    private Datebox dbTglLhr;
    private Radio rbL;
    private Radio rbP;
    private Button btnSimpan;

    @Override
    public void doAfterCompose(Component comp) throws Exception {
        super.doAfterCompose(comp);
    }

    public void onClick$btnSimpan() {
        //Messagebox.show(getTxtNRK().getValue());

        TestTbl ts1 = new TestTbl();
        ts1.setNrk(getTxtNRK().getValue());
        ts1.setNama(getTxtNama().getValue());
        ts1.setTalhir(getDbTglLhr().getValue());
        if (getRbL().isChecked()) {
            ts1.setJenkel(Short.valueOf("1"));
        } else if (getRbP().isChecked()) {
            ts1.setJenkel(Short.valueOf("2"));
        }
        ts1.setNkpnformal(Short.valueOf(getTxtGaji().getValue()));
        DaoFactory javabase = (DaoFactory) session.getAttribute("daofactory");

        testTbldao testdao = new testTblImpl();
        testdao.saveTestTbl(javabase, ts1);

        Messagebox.show("Sukses Simpan");
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

    /**
     * @return the txtGaji
     */
    public Textbox getTxtGaji() {
        return txtGaji;
    }

    /**
     * @param txtGaji the txtGaji to set
     */
    public void setTxtGaji(Textbox txtGaji) {
        this.txtGaji = txtGaji;
    }

    /**
     * @return the dbTglLhr
     */
    public Datebox getDbTglLhr() {
        return dbTglLhr;
    }

    /**
     * @param dbTglLhr the dbTglLhr to set
     */
    public void setDbTglLhr(Datebox dbTglLhr) {
        this.dbTglLhr = dbTglLhr;
    }

    /**
     * @return the rbL
     */
    public Radio getRbL() {
        return rbL;
    }

    /**
     * @param rbL the rbL to set
     */
    public void setRbL(Radio rbL) {
        this.rbL = rbL;
    }

    /**
     * @return the rbP
     */
    public Radio getRbP() {
        return rbP;
    }

    /**
     * @param rbP the rbP to set
     */
    public void setRbP(Radio rbP) {
        this.rbP = rbP;
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
}
