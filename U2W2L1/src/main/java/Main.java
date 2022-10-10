import java.time.LocalDate;
import java.util.Date;

import Model.Evento;
import Model.EventoDAO;
import Model.TipoEvento;

public class Main {

	static EventoDAO dao = new EventoDAO();
	
	public static void main(String[] args) {
		creaEventoTest();
		
	}
	
	private static void creaEventoTest() {
		Evento e = new Evento();
		e.setDataEvento(LocalDate.now());
		e.setDescrizione("testestest");
		e.setNumeroMassimoPartecipanti(100);
		e.setTipoEvento(TipoEvento.PRIVATO);
		e.setTitolo("TEST");
		
		dao.save(e); 
		
		
	}
	
}
