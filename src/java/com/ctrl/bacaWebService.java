/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ctrl;

import com.baca.ws.Pegawai;
import com.baca.ws.ServicePertama;
import com.baca.ws.ServicePertama_Service;
import com.bacawskota.GlobalWeather;
import com.bacawskota.GlobalWeatherSoap;
import static java.lang.System.out;
import java.util.List;

/**
 *
 * @author user
 */
public class bacaWebService {

    public static void main(String[] args) {
        //
//        ContohWS_Service service = new ContohWS_Service();
//        ContohWS port = service.getContohWSPort();
//        List<Kota> results = port.getKotas("asdasd");
//
//        out.println("Result1 = " + results.get(0).getNmkota());
//        out.println("Result2 = " + results.get(1).getNmkota());

//        List<Pegawai> listpeg = bacaWSCariPegawai("andi");
//
//        for (com.baca.ws.Pegawai item : listpeg) {
//            System.out.println(item.getNama());
//        }
        sdgsdg();

    }

    public static List<Pegawai> bacaWSCariPegawai(String nama) {
        List<Pegawai> ret = null;
        ServicePertama_Service service = new ServicePertama_Service();//buka service
        ServicePertama port = service.getServicePertamaPort(); //buka port
        ret = port.cariPegawaiSesuaiNama(nama);//buka function
        return ret;

    }

    public static void sdgsdg() {
        GlobalWeather service = new GlobalWeather();
        GlobalWeatherSoap port = service.getGlobalWeatherSoap();
        String result = port.getCitiesByCountry("Indonesia");
        out.println("Result = " + result);
    }
}
