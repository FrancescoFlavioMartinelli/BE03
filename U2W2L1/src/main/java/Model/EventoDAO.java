package Model;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import utils.JpaUtils;

public class EventoDAO {

	public Evento findById(long id) {
		EntityManager em = JpaUtils.getEntityManagerFactory().createEntityManager();
		try {
			return em.find(Evento.class, id);
		} finally {
			em.close();
		}
	}
	public void refresh(Evento e) {
		EntityManager em = JpaUtils.getEntityManagerFactory().createEntityManager();
		try {
			em.refresh(e);
		} finally {
			em.close();
		}
	}
	
	public void save(Evento e) {
		EntityManager em = JpaUtils.getEntityManagerFactory().createEntityManager();
		EntityTransaction et = em.getTransaction();
		try {
			et.begin();
			
			em.persist(e);
			
			et.commit();

		} catch(Exception ex) {
			et.rollback();
		} finally {
			em.close();
		}
	}
	
	public void delete(Evento e) {
		EntityManager em = JpaUtils.getEntityManagerFactory().createEntityManager();
		EntityTransaction et = em.getTransaction();
		try {
			et.begin();
			
			em.remove(e);
			
			et.commit();

		} catch(Exception ex) {
			et.rollback();
		} finally {
			em.close();
		}
	}
}
