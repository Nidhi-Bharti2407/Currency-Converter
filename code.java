package com.exchange;


import java.io.*;
import java.net.*;
import java.util.*;
import java.servlet.*;
import java.servlet.http.*;
import java.io.InputStream;
import java.net.*;
import com.google.gson.*;



class currencyConverter
{
private String lhs;
private String rhs;
private String error;
private String icc;
public currencyConverter(
{
}
public String getLhs()
{
return lhs;
}
public String getRhs()
{
return rhs;
}
}  
public class Convert extends HttpServlet { 
 /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
   protected void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
     String query = "";
     String amount = "";
     String currencyTo = "";
     String currencyFrom = "";
     String submit = "";
     String res = "";
     HttpSession session;
    
    
 

 
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  






