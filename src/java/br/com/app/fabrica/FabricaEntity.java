/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.app.fabrica;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Ivan Simionato
 */
public class FabricaEntity {
    
    @Produces
    @ApplicationScoped
    public EntityManagerFactory criarFactory(){
        return Persistence.createEntityManagerFactory("Avaliacao2305PU");
    }
    
    @Produces
    @RequestScoped
    public EntityManager criarManager(EntityManagerFactory factory){
        return factory.createEntityManager();
    }
    
    public void fecharFactory(@Disposes EntityManagerFactory factory){
        factory.close();
    }
    
    public void fecharManager(@Disposes EntityManager manager){
        manager.close();
    }
    
}
