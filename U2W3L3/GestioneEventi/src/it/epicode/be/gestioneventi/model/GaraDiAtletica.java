package it.epicode.be.gestioneventi.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class GaraDiAtletica extends Evento {

	@ManyToMany
	private Set<Persona> atleti;
	
	@ManyToOne
	private Persona vincitore;
	
}
