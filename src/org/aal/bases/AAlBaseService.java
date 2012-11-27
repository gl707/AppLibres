package org.aal.bases;

import java.io.Serializable;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
/**
 *
 * @author Jose Luis
 */
public class AAlBaseService extends AAlLog implements Serializable {
    /**
     * Variable.
    */
    private EntityManagerFactory entityManagerFactory;
    /**
     * Variable.
    */
    private EntityManager entitymanager;
    /**
     * Variable.
    */
    public AAlBaseService() {
        super();
        try {
            logger.debug("Inicia Creación Servicio Persistencia");
            entityManagerFactory = Persistence.createEntityManagerFactory(
                    AAlConstantes.PERSISTENT_UNIT);
            entitymanager = entityManagerFactory.createEntityManager();
            logger.debug("Finaliza el servicio de Persistencia"); }
        catch (Exception t) {
            logger.debug(AAlConstantes.ERROR_MSG
                    + t.toString() + " " + t.getMessage());
        }
    }
    /**
     *
     * @return Retorno.
     */
    public EntityManager getEm() {
        return entitymanager;
    }
    /**
     *
     * Retorno.
     */
    public void setEm(EntityManager entitymanager) {
        this.entitymanager = entitymanager;
    }
    /**
     *
     * @return Retorno.
     */
    public EntityManagerFactory getEntityManagerFactory() {
        return entityManagerFactory;
    }
    /**
     *
     * Retorno.
     */
    public void setEntityManagerFactory(EntityManagerFactory
            entityManagerFactory) {
        this.entityManagerFactory = entityManagerFactory;
    }
}
