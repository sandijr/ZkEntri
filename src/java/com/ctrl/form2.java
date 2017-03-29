/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ctrl;

import java.util.HashMap;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.util.GenericForwardComposer;

/**
 *
 * @author user
 */
public class form2 extends GenericForwardComposer {

    private form1 frm;

    @Override
    public void doAfterCompose(Component comp) throws Exception {
        super.doAfterCompose(comp);
        setFrm((form1) execution.getArg().get("form"));

    }

    public void onClick$btnClose() {
        getFrm().getTxt1().setValue("sadas");
        getFrm().getWin().detach();
    }

    public void onClick$btnClose2() {
        form1 frma = (form1) execution.getDesktop().getAttribute("frmses");
        frma.getTxt1().setValue("sadas");
        frma.getWin().detach();
    }

    /**
     * @return the frm
     */
    public form1 getFrm() {
        return frm;
    }

    /**
     * @param frm the frm to set
     */
    public void setFrm(form1 frm) {
        this.frm = frm;
    }

}
