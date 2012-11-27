/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.aal.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
/**
 *
 * @author Jose Luis
 */
@Entity
public class Artista implements Serializable {
    /**
 *
 * Variable.
 */
    private static final long serialVersionUID = 1L;
    /**
 *
 * Variable.
 */
    private String nombreArtista;
   /**
 *
 * Variable.
 */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    /**
 *
 * Variable.
 */
    @OneToMany(mappedBy = "artista", fetch = FetchType.EAGER, cascade =
            {CascadeType.REMOVE, CascadeType.MERGE, CascadeType.REFRESH })
    private List<Album> album;

    public List<Album> getAlbum() {
        return album;
    }

    public void setAlbum(List<Album> album) {
        this.album = album;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreArtista() {
        return nombreArtista;
    }

    public void setNombreArtista(String nombreArtista) {
        this.nombreArtista = nombreArtista;
    }
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null
                ?
                id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Artista)) {
            return false;
        }
        Artista other = (Artista) object;
        if ((this.id == null && other.id != null)
                || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.aal.entities.Cliente[ id=" + id + " ]";
    }
}
