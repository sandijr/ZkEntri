/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.koneksi;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author user
 */
public class Konversi {

    public String DateToString(Date dt) {
        String ret = null;
        DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        ret = df.format(dt);
        return ret;
    }

    public String getFormatUang(String src) {
        DecimalFormat formatdata = new DecimalFormat("###,###");
        String result = formatdata.format(Double.parseDouble(src));
        result = result.replace(".", "X");
        result = result.replace(",", "Y");
        result = result.replace("X", ",");
        result = result.replace("Y", ".");
        return result;
    }

}
