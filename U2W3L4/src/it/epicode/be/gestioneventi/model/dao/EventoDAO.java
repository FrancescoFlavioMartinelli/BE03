package it.epicode.be.gestioneventi.model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import it.epicode.be.gestioneventi.model.Concerto;
import it.epicode.be.gestioneventi.model.Evento;
import it.epicode.be.gestioneventi.model.Genere;
import it.epicode.be.gestioneventi.model.Persona;
import it.epicode.be.gestioneventi.util.JpaUtil;

public class EventoDAO {
	private static final Logger logger = LoggerFactory.getLogger(EventoDAO.class);

	public void save(Evento object) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {

			EntityTransaction transaction = em.getTransaction();
			transaction.begin();

			em.persist(object);

			transaction.commit();
		} catch (Exception ex) {
			em.getTransaction().rollback();

			logger.error("Error saving object: " + object.getClass().getSimpleName(), ex);
			throw ex;

		} finally {
			em.close();
		}

	}

	public void refresh(Evento object) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {

			em.refresh(object);

		} finally {
			em.close();
		}

	}

	public Evento getById(Long id) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {

			return em.find(Evento.class, id);

		} finally {
			em.close();
		}

	}

	public void delete(Evento object) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {

			EntityTransaction transaction = em.getTransaction();
			transaction.begin();

			em.remove(object);

			transaction.commit();
		} catch (Exception ex) {
			em.getTransaction().rollback();
			logger.error("Error deleting object: " + object.getClass().getSimpleName(), ex);
			throw ex;

		} finally {
			em.close();
		}

	}
	
	
	public List<Concerto> getConcertiInStreaming(Boolean inStreaming) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			
			Query q = em.createNamedQuery("concertiInStreamingQuery");
			q.setParameter("str", inStreaming);
			return q.getResultList();
			
		} finally {
			em.close();
		}
	}

	public List<Concerto> getConcertiPerGenere(List<Genere> listaGeneri){
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			
			Query q = em.createQuery("SELECT c FROM Concerto c WHERE c.genere IN :g");
			q.setParameter("g", listaGeneri);
			
			return q.getResultList();
			
		} finally {
			em.close();
		}
	}
	
	public List<Evento> getPartiteVinteInCasa(){
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			Query q = em.createNamedQuery("partiteVinteInCasa");
			return q.getResultList();
		} finally {
			em.close();
		}
	}
	
	public List<Evento> getPartiteVinteInTrasferta(){
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			Query q = em.createNamedQuery("partiteVinteInTrasferta");
			return q.getResultList();
		} finally {
			em.close();
		}}
	
	public List<Evento> getPartitePareggiate(){
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			Query q = em.createNamedQuery("partitePareggiate");
			return q.getResultList();
		} finally {
			em.close();
		}
		}
	
	
	public List<Evento> getGareDiAtleticaPerVincitore(Persona vincitore){
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			Query q = em.createNamedQuery("gareDiAtleticaPerVincitore");
			q.setParameter("vincitore", vincitore);
			return q.getResultList();
		} finally {
			em.close();
		}}
	
	
	public List<Evento> getGareDiAtleticaPerPartecipante(Persona partecipante){
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			Query q = em.createNamedQuery("gareDiAtleticaPerPartecipante");
			q.setParameter("partecipante", partecipante);
			return q.getResultList();
		} finally {
			em.close();
		}
	}
	
	public List<Evento> getEventiSoldOut(){
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			Query q = em.createNamedQuery("eventiSoldOut");
			return q.getResultList();
		} finally {
			em.close();
		}
	}
	
	public List<Evento> getEventiPerInvitato(Persona invitato){
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			Query q = em.createNamedQuery("eventiPerInvitato");
			q.setParameter("invitato", invitato);
			return q.getResultList();
		} finally {
			em.close();
		}
	}




	

	
	

}
