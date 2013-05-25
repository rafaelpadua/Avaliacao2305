/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.app.dao;

import br.com.app.entidades.Cliente;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;

/**
 *
 * @author Ivan Simionato
 */
@RequestScoped
public class ClienteDao {
    
    @Inject
    private EntityManager manager;
    
    public void salvar(Cliente cliente){
        manager.getTransaction().begin();
        manager.merge(cliente);
        manager.getTransaction().commit();
    }
    
    public List<Cliente> listar(){
        return manager.createQuery("from Cliente").getResultList();
    }
    
     public void alterar(Cliente cliente){
        manager.getTransaction().begin();
        manager.merge(cliente);
        manager.getTransaction().commit();
    }
     
    public Cliente recuperaCliente(Integer id){
        Cliente cliente = new Cliente();
        manager.getTransaction().begin();
        cliente = manager.find(Cliente.class, id);
        manager.getTransaction().commit();
        return cliente; 
    }
    
    public void apagar(Cliente cliente){
       Cliente clienteApagar =  recuperaCliente(cliente.getIdcliente());
       manager.getTransaction().begin();
       manager.remove(clienteApagar);
       manager.getTransaction().commit();
    }
     
}
