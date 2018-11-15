/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BeansPackage;

import Entidad.Actores;
import java.util.Date;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

/**
 *
 * @author Nacho
 */
@Stateless
public class DataEJB {
    Actores aEJB;

    @PersistenceUnit
EntityManagerFactory emf;
public List findAll(){
 return
emf.createEntityManager().createNamedQuery
("Actores.findAll").getResultList();
}


@PersistenceUnit
EntityManagerFactory emfInsert;



public void insertActor(String nombre, String nacionalidad, Date f_nacimiento){
    Actores actor = new Actores();
    
    System.out.println("PARAMETRO " + nombre);
    
    actor.setNombre(nombre);
    actor.setNacionalidad(nacionalidad);
    actor.setFnacimiento(f_nacimiento);
   // actor.setFnacimiento(fNacimiento);
   
    System.out.println("OBJETO " + actor.getNombre());
    emfInsert.createEntityManager().persist(actor);
   
}//puto elias
@PersistenceUnit
EntityManagerFactory emfSearch;

public List findByNombre(String nombre) {
    
    return emfSearch.createEntityManager().createNamedQuery("Actores.findByNombre").setParameter("nombre", nombre).getResultList();
   
}

}
