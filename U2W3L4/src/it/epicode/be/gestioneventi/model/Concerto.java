package it.epicode.be.gestioneventi.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.NamedQuery;

import lombok.Data;

@Entity
@Data
@NamedQuery(name="concertiInStreamingQuery", query = "SELECT c FROM Concerto c WHERE c.inStreaming = :str")
public class Concerto extends Evento {
	
	
	@Enumerated(EnumType.STRING)
	private Genere genere;
	private Boolean inStreaming;
}
