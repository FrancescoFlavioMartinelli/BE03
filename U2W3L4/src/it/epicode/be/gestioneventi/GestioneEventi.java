package it.epicode.be.gestioneventi;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import it.epicode.be.gestioneventi.model.Concerto;
import it.epicode.be.gestioneventi.model.Evento;
import it.epicode.be.gestioneventi.model.Genere;
import it.epicode.be.gestioneventi.model.Location;
import it.epicode.be.gestioneventi.model.Partecipazione;
import it.epicode.be.gestioneventi.model.Persona;
import it.epicode.be.gestioneventi.model.Sesso;
import it.epicode.be.gestioneventi.model.StatoPartecipazione;
import it.epicode.be.gestioneventi.model.TipoEvento;
import it.epicode.be.gestioneventi.model.dao.EventoDAO;
import it.epicode.be.gestioneventi.model.dao.LocationDAO;
import it.epicode.be.gestioneventi.model.dao.PartecipazioneDAO;
import it.epicode.be.gestioneventi.model.dao.PersonaDAO;

public class GestioneEventi {

	public static void main(String[] args) {
		
		Location location = saveLocation();
		Evento evento = saveEvento(location);
		Persona persona = savePersona();
		
		Partecipazione partecipazione = savePartecipazione(evento,persona);

		saveConcerto(location, true);
		saveConcerto(location, false);
		saveConcerto(location, true);
		
		/////////
		EventoDAO eventoDAO = new EventoDAO();
		List<Concerto> concertiStreamingTrue = eventoDAO.getConcertiInStreaming(true);
		System.out.println("IN STREAMING");
		System.out.println(concertiStreamingTrue);
		
		List<Concerto> concertoClassica = eventoDAO.getConcertiPerGenere(List.of(Genere.CLASSICO));
		System.out.println("CLASSICA");
		System.out.println(concertoClassica);
		
		


	}
	
	
	private static void saveConcerto(Location l, Boolean inStr) {
		Concerto c = new Concerto();
		c.setDataEvento(new Date());
		c.setTitolo("Partita");
		c.setDescrizione("Finale di coppa");
		c.setNumeroMassimoPartecipanti(10);
		c.setTipoEvento(TipoEvento.PUBBLICO);
		c.setLocation(l);
		
		c.setGenere(Genere.CLASSICO);
		c.setInStreaming(inStr);
		
		EventoDAO eventoDAO = new EventoDAO();
		eventoDAO.save(c);
		
	}



	private static Partecipazione savePartecipazione(Evento evento, Persona persona) {
		Partecipazione part = new Partecipazione();
		part.setEvento(evento);
		part.setPersona(persona);
		part.setStato(StatoPartecipazione.CONFERMATA);
		
		PartecipazioneDAO partecipazioneDAO = new PartecipazioneDAO();
		partecipazioneDAO.save(part);
		return part;
	}

	private static Persona savePersona() {
		Persona per = new Persona();
		per.setNome("Mario");
		per.setCognome("Rossi");
		per.setEmail("m.rossi@google.com");
		per.setSesso(Sesso.MASCHIO);
		per.setDataDiNascita(new GregorianCalendar(1980,9, 23).getTime());
		PersonaDAO personaDAO = new PersonaDAO();
		personaDAO.save(per);
		return per;
	}

	private static Location saveLocation() {
		Location loc = new Location();
		loc.setCitta("Firenze");
		loc.setNome("Stadio Franchi");
		
		LocationDAO locationDAO = new LocationDAO();
		locationDAO.save(loc);
		return loc;
	}

	private static Evento saveEvento(Location loc) {
		Evento ev = new Evento();
		ev.setDataEvento(new Date());
		ev.setTitolo("Partita");
		ev.setDescrizione("Finale di coppa");
		ev.setNumeroMassimoPartecipanti(10);
		ev.setTipoEvento(TipoEvento.PUBBLICO);
		ev.setLocation(loc);
		
		EventoDAO evDao = new EventoDAO();
		evDao.save(ev);
		return ev;
	}

}
