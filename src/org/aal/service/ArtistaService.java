/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.aal.service;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import org.aal.bases.AAlBaseService;
import org.aal.entities.Artista;
/**
 *
 * @author Jose Luis
 */
public class ArtistaService extends AAlBaseService {
    /**
 *
 * Variable.
 */
    public ArtistaService() {
        super();
    }
     /*Métodos NamedQuery*/
    public List<Artista> getAll() {
        EntityManager em = getEm();
        List<Artista> artista = em.createQuery("FROM Artista").getResultList();
        return artista;
    }
    public Artista getById(int id){
        EntityManager em = getEm();
        Artista artista = (Artista) em.createQuery(
                "FROM Artista WHERE id = " + id).getSingleResult();
        return artista;
    }
    public Artista getByName(String nombreArtista) {
        EntityManager em = getEm();
        Artista artista = null;
        try {
         artista = (Artista) em.createQuery(
                 "FROM Artista WHERE NOMBREARTISTA='"
                 + nombreArtista + "'").getSingleResult();
        }
        catch (Throwable t) {
            logger.debug(t.getMessage());
        }
        return artista;
    }
    public void updateArtista (Artista artista) {
        EntityManager em = getEm();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.merge(artista);
        em.flush();
        tx.commit();
    }
    public void deleteArtistaOnCascade(Artista artista) {
        EntityManager em = getEm();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.remove(artista);
        tx.commit();
    }
    public void persistArtista (Artista artista) {
        EntityManager em = getEm();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(artista);
        em.flush();
        tx.commit();
    }
}
