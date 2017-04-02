/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlet;

import com.koneksi.DaoFactory;
import com.koneksi.koneksi;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporter;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.export.JRXlsExporter;
import net.sf.jasperreports.engine.util.JRLoader;

/**
 *
 * @author user
 */
public class tampilReport extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //response.setContentType("text/html;charset=UTF-8");
        //PrintWriter out = response.getWriter();
        Connection con = null;
        try {
            HttpSession session = request.getSession();

            DaoFactory daofactory = (DaoFactory) session.getAttribute("daofactory");
            String nrk = request.getParameter("nrk");
            String jns = request.getParameter("jns");
            String Path2 = (String) session.getAttribute("Path2");
            HashMap hm = new HashMap();
            hm.put("nrk", nrk);
            con = daofactory.getConnection();
            String sumber = Path2 + "./rpt/DATUM.jasper";

            File report_file = new File(sumber);
            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(report_file.getPath());
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, hm, con);
            ServletOutputStream servletOutputStream;
            servletOutputStream = response.getOutputStream();
            if (jns.equalsIgnoreCase("pdf")) {
                response.setContentType("application/pdf");
                response.setHeader("Content-Disposition", "inline; filename=\"Cetak.pdf\"");
                JasperExportManager.exportReportToPdfStream(jasperPrint, servletOutputStream);
            } else if (jns.equalsIgnoreCase("xls")) {
                response.setContentType("application/xls");
                response.setHeader("Content-Disposition", "attachment; filename=\"file.xls\"");
                JRExporter exporter = new JRXlsExporter();
                exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
                exporter.setParameter(JRExporterParameter.OUTPUT_STREAM, servletOutputStream);
                exporter.exportReport();
            }
            servletOutputStream.flush();
            servletOutputStream.close();

        } catch (JRException e) {
            String a = e.getMessage();
            System.out.println(a);
        } catch (SQLException ex) {
            Logger.getLogger(tampilReport.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            //out.close();
            koneksi.safeClose(null, null, con);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
