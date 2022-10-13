package it.epicode.be.gestioneventi.model;

import javax.persistence.Entity;
import javax.persistence.NamedQuery;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@NamedQuery(name="partiteVinteInCasa", query="SELECT p FROM PartitaDiCalcio p WHERE p.squadraVincente = p.squadraCasa")
@NamedQuery(name="partiteVinteInTrasferta", query="SELECT p FROM PartitaDiCalcio p WHERE p.squadraVincente = p.squadraOspite")
@NamedQuery(name="partitePareggiate", query="SELECT p FROM PartitaCalcio p WHERE p.squadraVincente IS NULL")
public class PartitaDiCalcio extends Evento {

	private String squadraCasa;
	private String squadraOspite;
	private String squadraVincente;
	private int golCasa;
	private int golOspite;
}
