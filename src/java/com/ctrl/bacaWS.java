/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ctrl;

import com.bacaWS.Pertama.Pegawai;
import com.bacaWS.Pertama.ServicePertama;
import com.bacaWS.Pertama.ServicePertama_Service;
import java.util.List;

/**
 *
 * @author user
 */
public class bacaWS {

    public static void main(String[] args) {
        //    List<Pegawai> ret = null;
        ServicePertama_Service service = new ServicePertama_Service();//buka service
        ServicePertama port = service.getServicePertamaPort(); //buka port
        List<Pegawai> ret = port.cariPegawaiSesuaiNama("elang", "ADMIN1", "LogitecH"); //buka function
        
        for (Pegawai pegawai : ret){
            System.out.println(pegawai.getNama());
        }
//        return ret;
    }
}
