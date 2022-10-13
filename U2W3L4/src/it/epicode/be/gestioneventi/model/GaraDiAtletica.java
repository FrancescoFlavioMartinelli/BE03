package it.epicode.be.gestioneventi.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;

import lombok.Data;

@Entity
@Data
@NamedQuery(name="gareDiAtleticaPerVincitore", query="SELECT g FROM GaraDiAtletica g WHERE g.vincitore = :vincitore")
//SELECT * FROM GaraDiAtletica WHERE vincitore = idVincitore
//SELECT g FROM GaraDiAtletica g JOIN Persona p ON g.vincitore = p.id WHERE p.nome = "NOME"
@NamedQuery(name="gareDiAtleticaPerPartecipante", query="SELECT g FROM GaraDiAtletica WHERE :partecipante MEMBER OF g.atleti")
public class GaraDiAtletica extends Evento {

	@ManyToMany
	private Set<Persona> atleti;
	
	@ManyToOne
	private Persona vincitore;
	
}
