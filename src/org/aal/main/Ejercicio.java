/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.aal.main;
import java.sql.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import org.aal.entities.Album;
import org.aal.entities.Artista;
import org.apache.log4j.Logger;
/**
 *
 * @author Jose Luis
 */
public class Ejercicio {

    /**
     * @param args the command line arguments
     */
    private static final Logger log = Logger.getLogger(Ejercicio.class);
/**
 *
 * VAriable.
 */
    public static void main(String[] args) {
        log.info("Iniciando Log");
        Artista artista = new Artista();
        artista.setNombreArtista("Caifanes");
        Album album = new Album();
        album.setNombreAlbum("El Diablito");
        album.setDuracion("23:00");
        album.setFechaLanzamiento(Date.valueOf("2012-02-03"));
        album.setPrecio(Float.valueOf("19.99"));
        album.setArtista(artista);
        Ejercicio ejercicio = new Ejercicio();
        ejercicio.persist(artista);
        ejercicio.persist(album);
    }
     public void persist (Object obj) {
        EntityManagerFactory emf =
                javax.persistence.Persistence.createEntityManagerFactory(
                "EjercicioRelacionesPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            em.persist(obj);
            em.getTransaction().commit();
        }
        catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        }
        finally {
            em.close();
        }
    }
}