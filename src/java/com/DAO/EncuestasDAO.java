/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DAO;

/**
 *
 * @author juan
 */
import com.models.Encuesta;
import com.models.User;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class EncuestasDAO {

    private final EntityManagerFactory factory =  Persistence.createEntityManagerFactory("EncuestasPU");
    private final EntityManager em  = factory.createEntityManager();
   
    
    
    public EncuestasDAO(){
       
    }
    
    public List<Encuesta> obtencuestas(){
        try{
            //em.getTransaction().begin();
            Query query =  em 
                    .createQuery("SELECT en FROM Encuesta en where en.visible=1");
            
            List<Encuesta> results = (List<Encuesta>) query.getResultList();
            if (results.isEmpty()) {
               return null; 
            }
            //Encuesta encuesta = results.get(0);
            
            
            return results;
        }catch(Exception e){
                return null;
        }
       
        
    }
}
