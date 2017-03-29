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
import org.zkoss.zul.Textbox;
import org.zkoss.zul.Window;

/**
 *
 * @author user
 */
public class form1 extends GenericForwardComposer {

    private Textbox txt1;
    private Window win;

    @Override
    public void doAfterCompose(Component comp) throws Exception {
        super.doAfterCompose(comp);

    }

    public void onClick$btnShow() {
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("form", this);
        if (getWin() != null) {
            getWin().detach();
        }
        setWin((Window) Executions.createComponents("/form2.zul", null, map));
        getWin().setClosable(true);
        getWin().doModal();
    }

    public void onClick$btnShow2() {
        execution.getDesktop().setAttribute("frmses", this);
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("form", this);
        if (getWin() != null) {
            getWin().detach();
        }
        setWin((Window) Executions.createComponents("/form2.zul", null, map));
        getWin().setClosable(true);
        getWin().doModal();
    }

    /**
     * @return the txt1
     */
    public Textbox getTxt1() {
        return txt1;
    }

    /**
     * @param txt1 the txt1 to set
     */
    public void setTxt1(Textbox txt1) {
        this.txt1 = txt1;
    }

    /**
     * @return the win
     */
    public Window getWin() {
        return win;
    }

    /**
     * @param win the win to set
     */
    public void setWin(Window win) {
        this.win = win;
    }
}
