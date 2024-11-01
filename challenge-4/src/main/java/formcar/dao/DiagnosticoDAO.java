package formcar.dao;

import formcar.beans.Diagnostico;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class DiagnosticoDAO {

	    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("nome_da_unidade_de_persistencia");

	    public void inserir(Diagnostico diagnostico) {
	        EntityManager em = emf.createEntityManager();
	        em.getTransaction().begin();
	        em.persist(diagnostico);
	        em.getTransaction().commit();
	        em.close();
	    }

	    public Diagnostico selecionarPorId(int id) {
	        EntityManager em = emf.createEntityManager();
	        Diagnostico diagnostico = em.find(Diagnostico.class, id);
	        em.close();
	        return diagnostico;
	    }

	    public void atualizar(Diagnostico diagnostico) {
	        EntityManager em = emf.createEntityManager();
	        em.getTransaction().begin();
	        em.merge(diagnostico);
	        em.getTransaction().commit();
	        em.close();
	    }

	    public void deletar(int id) {
	        EntityManager em = emf.createEntityManager();
	        em.getTransaction().begin();
	        Diagnostico diagnostico = em.find(Diagnostico.class, id);
	        if (diagnostico != null) {
	            em.remove(diagnostico);
	        }
	        em.getTransaction().commit();
	        em.close();
	    }
	    
	    public List<Diagnostico> listarTodos() {
	        EntityManager em = emf.createEntityManager();
	        List<Diagnostico> diagnosticos = em.createQuery("FROM Diagnostico", Diagnostico.class).getResultList();
	        em.close();
	        return diagnosticos;
	    }
	}
