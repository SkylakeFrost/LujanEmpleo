
package Controlador;

import Controlador.exceptions.NonexistentEntityException;

import Modelo.Programas;

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
public class ProgramasJpaController implements Serializable {

    public ProgramasJpaController() {
        this.emf = Persistence.createEntityManagerFactory("EmpleoTestPU");
    }
    private EntityManagerFactory emf = null;

    


   

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Programas programas) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(programas);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Programas programas) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            programas = em.merge(programas);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = programas.getIdProgramas();
                if (findProgramas(id) == null) {
                    throw new NonexistentEntityException("The programas with id " + id + " no longer exists.");
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
            Programas programas;
            try {
                programas = em.getReference(Programas.class, id);
                programas.getIdProgramas();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The programas with id " + id + " no longer exists.", enfe);
            }
            em.remove(programas);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Programas> findProgramasEntities() {
        return findProgramasEntities(true, -1, -1);
    }

    public List<Programas> findProgramasEntities(int maxResults, int firstResult) {
        return findProgramasEntities(false, maxResults, firstResult);
    }

    private List<Programas> findProgramasEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Programas.class));
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

    public Programas findProgramas(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Programas.class, id);
        } finally {
            em.close();
        }
    }

    public int getProgramasCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Programas> rt = cq.from(Programas.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
    public List<Programas> findCursosByData(Programas curso) {
        EntityManager em = getEntityManager();
        try {
            Query q = em.createQuery("Select nombre, descripcion FROM Programas u WHERE u.nombre LIKE :custNombre").
                    
                    setParameter("custNombre", curso.getNombre().trim().toUpperCase());
            return q.getResultList();
        } finally {
            em.close();
        }
    
}
    }
    
