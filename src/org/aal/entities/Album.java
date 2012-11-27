/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.aal.entities;
import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Jose Luis
 */
@Entity
//@NamedQueries({
    /*getAll*/
  //  @NamedQuery(name="Album.getAll",query="FROM Album"),
    //@NamedQuery(name="Album.getById",query="FROM Album WHERE id =:AlbumId")
//})
public class Album implements Serializable {
/**
 * Variables.
 */
    private static final long serialVersionUID = 1L;
    /**
 * Variables.
 */
    private String nombreAlbum;
    /**
 * Variables.
 */
    private String duracion;
    /**
 * Variables.
 */
    private String genero;
    /**
 * Variables.
 */
    private Date fechaLanzamiento;
    /**
 * Variables.
 */
    private Float precio;
    /**
 * Variables.
 */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    /**
 * Variables.
 */
    @ManyToOne
    @JoinColumn(name = "Artista", referencedColumnName = "ID")
    private Artista artista;

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public Date getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(Date fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreAlbum() {
        return nombreAlbum;
    }

    public void setNombreAlbum(String nombreAlbum) {
        this.nombreAlbum = nombreAlbum;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null
                ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Album)) {
            return false;
        }
        Album other = (Album) object;
        if ((this.id == null && other.id != null)
                || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.aal.entities.Compra[ id=" + id + " ]";
    }
}
