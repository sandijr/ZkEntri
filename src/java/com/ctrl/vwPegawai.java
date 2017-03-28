/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ctrl;

import com.dao.PegawaiDao;
import com.impl.PegawaiImpl;
import com.koneksi.DaoFactory;
import com.model.Pegawai;
import java.util.List;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Button;
import org.zkoss.zul.Listbox;
import org.zkoss.zul.Listcell;
import org.zkoss.zul.Listitem;
import org.zkoss.zul.Messagebox;
import org.zkoss.zul.Textbox;
import org.zkoss.zk.ui.event.Event;

/**
 *
 * @author user
 */
public class vwPegawai extends GenericForwardComposer {

    private Textbox txtNama;
    private Button btnCari;
    private Listbox lstPeg;

    @Override
    public void doAfterCompose(Component comp) throws Exception {
        super.doAfterCompose(comp);

    }

    public void onClick$btnCari() {

        if (getTxtNama().getValue().length() < 3) {
            Messagebox.show("Minimal 3 huruf");
            return;
        }
        DaoFactory daofactory = (DaoFactory) session.getAttribute("daofactory");
        PegawaiDao pegdao = new PegawaiImpl();
        List<Pegawai> lstPegawai = pegdao.getPegawaiByNama(daofactory, getTxtNama().getValue());

        getLstPeg().getItems().clear();
        if (lstPegawai.size() == 0) {
            Messagebox.show("tidak ketemu");
            return;
        }
        for (Pegawai peg : lstPegawai) {
            Listitem lsitem = new Listitem();
            lsitem.setParent(getLstPeg());

            Listcell lscellnrk = new Listcell(peg.getNrk());
            lscellnrk.setParent(lsitem);

            Listcell lscellnama = new Listcell(peg.getNama());
            lscellnama.setParent(lsitem);
            
            Listcell lscellambilnrk = new Listcell();
            lscellambilnrk.appendChild(getButton(peg.getNrk(),peg.getNama()));
            lscellambilnrk.setParent(lsitem); 

        }
    }

    private Button getButton(final String nrk,final String nama) {

        Button rm = new Button();
        rm.setImage("/img/logo1.png");
        rm.addEventListener("onClick", new org.zkoss.zk.ui.event.EventListener<Event>() {
            public void onEvent(Event t) throws Exception {
                NewUser winnewuser = (NewUser)session.getAttribute("NewUser");
                winnewuser.getTxtNRK().setValue(nrk);
                winnewuser.getTxtNama().setValue(nama);
                winnewuser.getWinpeg().detach();
                
            }
        });
        return rm;
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
     * @return the btnCari
     */
    public Button getBtnCari() {
        return btnCari;
    }

    /**
     * @param btnCari the btnCari to set
     */
    public void setBtnCari(Button btnCari) {
        this.btnCari = btnCari;
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
}
