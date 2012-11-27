/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.aal.service;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import org.aal.bases.AAlBaseService;
import org.aal.entities.Album;
import org.aal.entities.Artista;
/**
 *
 * @author Jose Luis
 */
public class AlbumService extends AAlBaseService {
    /**
     * Constructor de la clase AlbumService.
     */
    public AlbumService() {
        super();
    }
    /*Métodos NamedQuery*/
    public List<Album> getAll() {
        EntityManager em = getEm();
        List<Album> albumList = em.createNamedQuery(
                "Album.getAll").getResultList();
        return albumList;
    }
    public Album getById(int id){
        EntityManager em = getEm();
        Album es = (Album) em.createQuery(
                "FROM Album where ID = " + id).getSingleResult();
        return es;
    }
    public List<Album> getByIdArtista(int idArtista){
        EntityManager em = getEm();
        List<Album> albumList = em.createQuery(
                "FROM Album where IDARTISTA = " + idArtista).getResultList();
        return albumList;
    }
    public List<Album> getAlbumByArtista(Artista artista, Album album){
        EntityManager em = getEm();
        List<Album> albumList = em.createQuery(
                "FROM Album, Artista where (Album.ID=:id) = "
                + "(Artista.IDARTISTA=:idArtista)").setParameter(
                "id", artista.getId()).setParameter(
                "idArtista", album.getId()).getResultList();
        return albumList;
    }
    public void updateAlbum (Album album) {
        EntityManager em = getEm();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.merge(album);
        em.flush();
        tx.commit();
    }
    public void delete2Album (Album album) {
        EntityManager em = getEm();
        em.createQuery("delete FROM Album where ID =" + album.getId());
    }
    public void deleteAlbum (Album album){
        EntityManager em = getEm();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.remove(album);
        tx.commit();
    }
    /*Método Para Persistir Album*/
     public void persistAlbum (Album album)   {
        EntityManager em = getEm();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(album);
        em.flush();
        tx.commit();
     }
}