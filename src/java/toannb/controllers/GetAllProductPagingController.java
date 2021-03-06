/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toannb.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import toannb.dao.LapTopDAO;
import toannb.dto.LaptopDTOList;
import toannb.pagination.PagingGeneration;
import toannb.utils.XMLUtilities;

/**
 *
 * @author bachtoan
 */
public class GetAllProductPagingController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            //            String pageNum = request.getParameter("pageNum");
//            
            PagingGeneration paging = new PagingGeneration();
            int pagingCount = paging.PaginationCount();
            LaptopDTOList laptopList = new LaptopDTOList();

//            if(pageNum != null){
//                laptopList = paging.paginEachPage(pageNum);
//            }else{
//               laptopList = paging.paginEachPage("1");
//            }
            request.setAttribute("PAGINGCOUNT", Integer.toString(pagingCount));
//            response.reset();
//            XMLUtilities.marshallingToTransfer(laptopList, response.getOutputStream());

//            LapTopDAO laptopDAO = new LapTopDAO();
//
//            LaptopDTOList laptopList = laptopDAO.getAllLaptop();
//            response.reset();
//            XMLUtilities.marshallingToTransfer(laptopList, response.getOutputStream());

        } catch (Exception e) {
            Logger.getLogger(GetAllProductPagingController.class.getName()).log(Level.SEVERE, null, e);
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
