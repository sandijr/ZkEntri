/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ctrl;

import com.dao.PegawaiDao;
import com.dao.TransPayDao;
import com.dao.testTbldao;
import com.impl.PegawaiImpl;
import com.impl.TransPayImpl;
import com.impl.testTblImpl;
import com.koneksi.DaoFactory;
import com.koneksi.Konversi;
import com.model.PenugasanTest;
import com.model.TestTbl;
import com.model.VwTahunTranspay;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Button;
import org.zkoss.zul.Datebox;
import org.zkoss.zul.Hlayout;
import org.zkoss.zul.Label;
import org.zkoss.zul.Listbox;
import org.zkoss.zul.Listcell;
import org.zkoss.zul.Listitem;
import org.zkoss.zul.Messagebox;
import org.zkoss.zul.Radio;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.Toolbarbutton;
import org.zkoss.zul.Window;

/**
 *
 * @author user
 */
public class crud extends GenericForwardComposer {

    private Textbox txtNRK, txtSplit;
    private Textbox txtNama;
    private Textbox txtGaji;
    private Datebox dbTglLhr;
    private Radio rbL;
    private Radio rbP;
    private Button btnSimpan;
    private Listbox lstGaji;
    private Listbox lstTest;
    private Window winInfo;
    private Button btnPilih;
    private Label lblTujuan;

    @Override
    public void doAfterCompose(Component comp) throws Exception {
        super.doAfterCompose(comp);
        session.setAttribute("Path2", application.getRealPath(""));
        DaoFactory daofactory = (DaoFactory) session.getAttribute("daofactory");
        if (daofactory == null) {
            Executions.getCurrent().sendRedirect("loginuser.zul");
            return;
        }
        TransPayDao transPayDao = new TransPayImpl();
        List<VwTahunTranspay> tahunTranspay = transPayDao.getVwTahunTranspay(daofactory);

        getLstGaji().getItems().clear();
        if (tahunTranspay.size() > 0) {
            for (VwTahunTranspay item : tahunTranspay) {
                getLstGaji().appendItem(item.getTahun() + "", item.getTahun() + "");
            }
            getLstGaji().setSelectedIndex(0);
        } else {
            getLstGaji().getItems().clear();
        }
        tampildatum();
        //
        PegawaiDao peg = new PegawaiImpl();
        List<PenugasanTest> tugas = peg.getTujuanPenugasan(daofactory);
        String tujuans = "";
        int baris = 0;
        for (PenugasanTest pt : tugas) {
            if (baris == 0) {
                tujuans = pt.getTujuan();
            } else {
                tujuans = tujuans + "-" + pt.getTujuan();
            }
            baris++;
        }
        getLblTujuan().setValue(tujuans);
    }

    public void onClick$btnSplit() {
        String string = getTxtSplit().getValue();
        String[] parts = string.split("-");

        for (int i = 0; i < parts.length; i++) {
            Messagebox.show(parts[i]);
        }
    }

    public void tampildatum() {
        Konversi konv = new Konversi();
        DaoFactory daofactory = (DaoFactory) session.getAttribute("daofactory");
        testTbldao testtbldao = new testTblImpl();
        List<TestTbl> lstPegawai = testtbldao.getTestTblSemua(daofactory);

        getLstTest().getItems().clear();

        for (TestTbl test : lstPegawai) {
            Listitem lsitem = new Listitem();
            lsitem.setParent(getLstTest());

            Listcell lscellnrk = new Listcell(test.getNrk());
            lscellnrk.setParent(lsitem);

            Listcell lscellnama = new Listcell(test.getNama());
            lscellnama.setParent(lsitem);

            Listcell lscelltalahir = new Listcell(konv.DateToString(test.getTalhir()));
            lscelltalahir.setParent(lsitem);

            Listcell lscellnkp = new Listcell(konv.getFormatUang(String.valueOf(test.getNkpnformal())));
            lscellnkp.setStyle("text-align: right;");
            lscellnkp.setParent(lsitem);

            Listcell lscelleditnrk = new Listcell();
            lscelleditnrk.appendChild(getButtonEdit(test.getNrk()));
            lscelleditnrk.setParent(lsitem);

            Listcell lscellhapusnrk = new Listcell();
            lscellhapusnrk.appendChild(getButtonHapus(test.getNrk()));
            lscellhapusnrk.setParent(lsitem);

            Listcell lscellinfonrk = new Listcell();
            lscellinfonrk.appendChild(getInfo(test.getNrk()));
            lscellinfonrk.setParent(lsitem);

            Listcell lscellComponen = new Listcell();
            lscellComponen.appendChild(getComponen(test.getTalhir(), test.getNrk()));
            lscellComponen.setParent(lsitem);

            Listcell lscellTampilReportPDF = new Listcell();
            lscellTampilReportPDF.appendChild(getButtonReportPDF(test.getNrk()));
            lscellTampilReportPDF.setParent(lsitem);
            
            
            Listcell lscellTampilReportXLS = new Listcell();
            lscellTampilReportXLS.appendChild(getButtonReportXLS(test.getNrk()));
            lscellTampilReportXLS.setParent(lsitem);
        }
    }

    private Hlayout getComponen(final Date tgl, final String nrk) {
        Hlayout rm = new Hlayout();
        final Datebox dt = new Datebox();
        final Label lbl = new Label(tgl + "");
        lbl.setParent(rm);
        dt.setValue(tgl);

        dt.setParent(rm);
        final Button btn = new Button();
        dt.setVisible(false);
        btn.setVisible(false);
        lbl.setVisible(true);
        btn.setImage("/img/logo1.png");
        btn.setParent(rm);
        btn.addEventListener("onClick", new org.zkoss.zk.ui.event.EventListener<Event>() {
            public void onEvent(Event t) throws Exception {
                DaoFactory daofactory = (DaoFactory) session.getAttribute("daofactory");
                testTbldao tbldao = new testTblImpl();
                tbldao.updateTglLahirTestTbl(daofactory, dt.getValue(), nrk);
                dt.setVisible(false);
                btn.setVisible(false);
                lbl.setVisible(true);
                lbl.setValue(dt.getValue() + "");
                tampildatum();
            }
        });
        lbl.addEventListener("onClick", new org.zkoss.zk.ui.event.EventListener<Event>() {
            public void onEvent(Event t) throws Exception {
                dt.setVisible(true);
                btn.setVisible(true);
                lbl.setVisible(false);
            }
        });
        return rm;
    }

    private Button getButtonEdit(final String nrk) {

        Button rm = new Button();
        rm.setImage("/img/logo1.png");
        rm.addEventListener("onClick", new org.zkoss.zk.ui.event.EventListener<Event>() {
            public void onEvent(Event t) throws Exception {
                DaoFactory daofactory = (DaoFactory) session.getAttribute("daofactory");
                testTbldao tbldao = new testTblImpl();
                TestTbl testtbl = tbldao.getTestTbl(daofactory, nrk);
                //
                getTxtNRK().setValue(nrk);
                getTxtNama().setValue(testtbl.getNama());

                if (testtbl.getJenkel() == Short.valueOf("1")) {
                    getRbL().setChecked(true);
                    getRbP().setChecked(false);
                } else {
                    getRbL().setChecked(false);
                    getRbP().setChecked(true);
                }
                getDbTglLhr().setValue(testtbl.getTalhir());
                //
                List lstgaji = getLstGaji().getItems();
                for (int i = 0; i < lstgaji.size(); i++) {
                    Listitem item = (Listitem) lstgaji.get(i);
                    String gaji = Integer.valueOf(testtbl.getNkpnformal().toString()).toString();
                    if (item.getValue().equals(gaji)) {
                        getLstGaji().setSelectedItem(item);
                        break;
                    }
                }
            }
        });
        return rm;
    }

    private Toolbarbutton getInfo(final String nrk) {
        Toolbarbutton rm = new Toolbarbutton();
        rm.setLabel("Informasi");
        rm.addEventListener("onClick", new org.zkoss.zk.ui.event.EventListener<Event>() {
            public void onEvent(Event t) throws Exception {
                if (getWinInfo() != null) {
                    getWinInfo().detach();
                }
                HashMap hm = new HashMap<String, String>();
                hm.put("nrk", nrk);
                setWinInfo((Window) Executions.createComponents("/vwtest.zul", null, hm));
                getWinInfo().setClosable(true);
                getWinInfo().doModal();
            }
        });
        return rm;
    }

    private Button getButtonReportPDF(final String nrk) {
        Button rm = new Button();
        rm.setImage("/img/logo1.png");
        rm.addEventListener("onClick", new org.zkoss.zk.ui.event.EventListener<Event>() {
            public void onEvent(Event t) throws Exception {
                Executions.getCurrent().sendRedirect("http://localhost:8084/ZK602ceApp6/tampilReport?nrk=" + nrk.trim() + "&jns=pdf", "_blank");

            }
        });
        return rm;
    }
    private Button getButtonReportXLS(final String nrk) {
        Button rm = new Button();
        rm.setImage("/img/logo1.png");
        rm.addEventListener("onClick", new org.zkoss.zk.ui.event.EventListener<Event>() {
            public void onEvent(Event t) throws Exception {
                Executions.getCurrent().sendRedirect("http://localhost:8084/ZK602ceApp6/tampilReport?nrk=" + nrk.trim() + "&jns=xls", "_blank");

            }
        });
        return rm;
    }

    private Button getButtonHapus(final String nrk) {
        Button rm = new Button();
        rm.setImage("/img/logo1.png");
        rm.addEventListener("onClick", new org.zkoss.zk.ui.event.EventListener<Event>() {
            public void onEvent(Event t) throws Exception {

                Messagebox.show("Apakah anda yakin akan menghapus NRK " + nrk,
                        "Konfirmasi", Messagebox.OK | Messagebox.CANCEL,
                        Messagebox.QUESTION,
                        new org.zkoss.zk.ui.event.EventListener() {
                            public void onEvent(Event e) {
                                if ("onOK".equals(e.getName())) {
                                    DaoFactory daofactory = (DaoFactory) session.getAttribute("daofactory");
                                    testTbldao tbldao = new testTblImpl();
                                    tbldao.hapusTestTbl(daofactory, nrk);
                                    tampildatum();
                                }
                            }
                        });
            }
        });
        return rm;
    }

    public void onClick$btnPilih() {
        Set items = getLstTest().getSelectedItems();

        if (items.isEmpty()) {
            Messagebox.show("Anda belum memilih");
        } else {
            List al = new ArrayList(items);
            for (Iterator it = al.iterator(); it.hasNext();) {
                Listitem li = (Listitem) it.next();

                Listcell lstnrk = (Listcell) li.getChildren().get(0);
                Messagebox.show(lstnrk.getLabel());
            }
        }
    }

    public void onClick$btnSimpan() {
        //Messagebox.show(getTxtNRK().getValue());
        if (getTxtNRK().getValue().trim().length() == 0) {
            Messagebox.show("NRK Belum diisi");
            return;
        } else if (getRbL().isChecked() == false && getRbP().isChecked() == false) {
            Messagebox.show("Jenis Kelamin belum diisi");
            return;
        }
        DaoFactory daofactory = (DaoFactory) session.getAttribute("daofactory");
        testTbldao testdao = new testTblImpl();
        TestTbl test1 = testdao.getTestTbl(daofactory, getTxtNRK().getValue());
        if (test1.getNrk() != null) {
            Messagebox.show("NRK sudah terdaftar");
            return;
        }
        TestTbl test2 = new TestTbl();
        test2.setNrk(getTxtNRK().getValue());
        test2.setNama(getTxtNama().getValue());
        test2.setTalhir(getDbTglLhr().getValue());
        if (getRbL().isChecked()) {
            test2.setJenkel(Short.valueOf("1"));
        } else if (getRbP().isChecked()) {
            test2.setJenkel(Short.valueOf("2"));
        }
        //test2.setNkpnformal(Short.valueOf(getLstGaji().getSelectedItem().getValue() + ""));
        test2.setNkpnformal(BigDecimal.ZERO);
        if (daofactory == null) {
            Executions.getCurrent().sendRedirect("loginuser.zul");
        } else {

            testdao.saveTestTbl(daofactory, test2);

            Messagebox.show("Sukses Simpan");
            tampildatum();
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

    /**
     * @return the lstGaji
     */
    public Listbox getLstGaji() {
        return lstGaji;
    }

    /**
     * @param lstGaji the lstGaji to set
     */
    public void setLstGaji(Listbox lstGaji) {
        this.lstGaji = lstGaji;
    }

    /**
     * @return the lstTest
     */
    public Listbox getLstTest() {
        return lstTest;
    }

    /**
     * @param lstTest the lstTest to set
     */
    public void setLstTest(Listbox lstTest) {
        this.lstTest = lstTest;
    }

    /**
     * @return the winInfo
     */
    public Window getWinInfo() {
        return winInfo;
    }

    /**
     * @param winInfo the winInfo to set
     */
    public void setWinInfo(Window winInfo) {
        this.winInfo = winInfo;
    }

    /**
     * @return the lblTujuan
     */
    public Label getLblTujuan() {
        return lblTujuan;
    }

    /**
     * @param lblTujuan the lblTujuan to set
     */
    public void setLblTujuan(Label lblTujuan) {
        this.lblTujuan = lblTujuan;
    }

    /**
     * @return the txtSplit
     */
    public Textbox getTxtSplit() {
        return txtSplit;
    }

    /**
     * @param txtSplit the txtSplit to set
     */
    public void setTxtSplit(Textbox txtSplit) {
        this.txtSplit = txtSplit;
    }
}
