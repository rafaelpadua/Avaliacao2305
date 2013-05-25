/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.app.servlet;

import br.com.app.dao.ClienteDao;
import br.com.app.entidades.Cliente;
import java.io.IOException;
import java.util.List;
import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ivan Simionato
 */
public class ClienteController extends HttpServlet {

    @Inject
    private ClienteDao dao;
    
   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String logica = request.getParameter("logica");
        
        if ("salvar".equals(logica)) {
            try{
            Cliente cliente = new Cliente();
            cliente.setCpf(request.getParameter("cpf"));
            cliente.setNome(request.getParameter("nome"));
            cliente.setSobrenome(request.getParameter("sobrenome"));
            dao.salvar(cliente);
            request.setAttribute("sucesso", "Cliente cadastrado com sucesso!");
            RequestDispatcher dispacher = request.getRequestDispatcher("/sucesso.jsp");
            dispacher.forward(request, response);
            }catch(Exception ex){
                
            request.setAttribute("erro", ex);
            RequestDispatcher dispacher = request.getRequestDispatcher("/erro.jsp");
            dispacher.forward(request, response);
                
            }
        }
        
        if ("listar".equals(logica)) {
            
            List<Cliente> clientes = dao.listar();
            
            request.setAttribute("lista", clientes);
            RequestDispatcher dispacher = request.getRequestDispatcher("/ListarCliente.jsp");
            dispacher.forward(request, response);
            
        }
        
        if ("alteracao".equals(logica)) {
            List<Cliente> clientes = dao.listar();
            
            request.setAttribute("lista", clientes);
            RequestDispatcher dispacher = request.getRequestDispatcher("/AlteraCliente.jsp");
            dispacher.forward(request, response);
            
        }
        
        
        if ("alterar".equals(logica)) {
            String idf = request.getParameter("id");
            Integer id = Integer.parseInt(idf);
            Cliente clienti = dao.recuperaCliente(id);
            request.setAttribute("clienti", clienti);
            RequestDispatcher dispacher = request.getRequestDispatcher("/AlteraCliente.jsp");
            dispacher.forward(request, response);
        }
        
        if ("update".equals(logica)) {
            String idf = request.getParameter("idcliente");
            Integer id = Integer.parseInt(idf);
            Cliente cliente = new Cliente();
            cliente.setCpf(request.getParameter("cpf"));
            cliente.setIdcliente(id);
            cliente.setNome(request.getParameter("nome"));
            cliente.setSobrenome(request.getParameter("sobrenome"));
            dao.alterar(cliente);
            request.setAttribute("sucesso", "Cliente alterado com sucesso!");
            RequestDispatcher dispacher = request.getRequestDispatcher("/sucesso.jsp");
            dispacher.forward(request, response);
        }
        
        if ("apagar".equals(logica)) {
            List<Cliente> clientes = dao.listar();    
            request.setAttribute("lista", clientes);
            RequestDispatcher dispacher = request.getRequestDispatcher("/ApagarCliente.jsp");
            dispacher.forward(request, response);
        }
        
        if ("deletar".equals(logica)) {
            Integer id = Integer.parseInt(request.getParameter("id"));
            Cliente cliente = new Cliente();
            cliente.setIdcliente(id);
            dao.apagar(cliente);
            request.setAttribute("sucesso", "Cliente apagado com sucesso!");
            RequestDispatcher dispacher = request.getRequestDispatcher("/sucesso.jsp");
            dispacher.forward(request, response);
        }
        
        
        
    
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
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
     * Handles the HTTP
     * <code>POST</code> method.
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
