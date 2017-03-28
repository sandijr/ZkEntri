/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ctrl;

import com.dao.testTbldao;
import com.impl.testTblImpl;
import com.koneksi.DaoFactory;
import com.model.TestTbl;
import java.util.List;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Listbox;
import org.zkoss.zul.Listcell;
import org.zkoss.zul.Listitem;

/**
 *
 * @author user
 */
public class vwtest extends GenericForwardComposer {

    private Listbox lstPeg;
    private String nrk;

    @Override
    public void doAfterCompose(Component comp) throws Exception {
        super.doAfterCompose(comp);
        setNrk((String) execution.getArg().get("nrk"));
        tampildatum();
    }

    public void tampildatum() {
        DaoFactory daofactory = (DaoFactory) session.getAttribute("daofactory");
        testTbldao testtbldao = new testTblImpl();

        List<TestTbl> lstPegawai = testtbldao.getTestTblByNama(daofactory, "A");

        getLstPeg().getItems().clear();

        for (TestTbl test : lstPegawai) {
            Listitem lsitem = new Listitem();
            lsitem.setParent(getLstPeg());

            Listcell lscellnrk = new Listcell(test.getNrk());
            lscellnrk.setParent(lsitem);

            Listcell lscellnama = new Listcell(test.getNama());
            lscellnama.setParent(lsitem);

        }
    }

    /**
     * @return the lstPeg
     */
    public Listbox getLstPeg() {
        return lstPeg;
    }

    /**
     * @param lstPeg the lstPeg to set
     */
    public void setLstPeg(Listbox lstPeg) {
        this.lstPeg = lstPeg;
    }

    /**
     * @return the nrk
     */
    public String getNrk() {
        return nrk;
    }

    /**
     * @param nrk the nrk to set
     */
    public void setNrk(String nrk) {
        this.nrk = nrk;
    }
}
