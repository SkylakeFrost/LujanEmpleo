/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Controlador.exceptions.NonexistentEntityException;
import Modelo.Empresas;
import Modelo.Postulantes;
import Modelo.Usuarios;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author Ismael
 */
public class PostulantesJpaController implements Serializable {

    public PostulantesJpaController() {
        this.emf = Persistence.createEntityManagerFactory("EmpleoTestPU");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Postulantes postulantes) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(postulantes);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Postulantes postulantes) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            postulantes = em.merge(postulantes);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = postulantes.getIdPostulantes();
                if (findPostulantes(id) == null) {
                    throw new NonexistentEntityException("The postulantes with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Postulantes postulantes;
            try {
                postulantes = em.getReference(Postulantes.class, id);
                postulantes.getIdPostulantes();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The postulantes with id " + id + " no longer exists.", enfe);
            }
            em.remove(postulantes);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Postulantes> findPostulantesEntities() {
        return findPostulantesEntities(true, -1, -1);
    }

    public List<Postulantes> findPostulantesEntities(int maxResults, int firstResult) {
        return findPostulantesEntities(false, maxResults, firstResult);
    }

    private List<Postulantes> findPostulantesEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Postulantes.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Postulantes findPostulantes(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Postulantes.class, id);
        } finally {
            em.close();
        }
    }

    public int getPostulantesCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Postulantes> rt = cq.from(Postulantes.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    public List<Postulantes> findPostulanteByData(Postulantes postulante) {
        EntityManager em = getEntityManager();
        try {
            Query q = em.createQuery("Select nombre, apellido, edad, dni, movilidad, nivel_educativo, sexo, perfil, cuil,domicilio,telf_principal,telf_alternativo, email, disp_horaria, otra_info FROM Postulantes u WHERE u.dni LIKE :custDni").
                    
                    setParameter("custDni", postulante.getDni());
            return q.getResultList();
        } finally {
            em.close();
        }
    }
}
