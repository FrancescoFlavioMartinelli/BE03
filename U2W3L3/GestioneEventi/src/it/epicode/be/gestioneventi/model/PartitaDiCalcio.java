package it.epicode.be.gestioneventi.model;

import javax.persistence.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class PartitaDiCalcio extends Evento {

	private String squadraCasa;
	private String squadraOspite;
	private String squadraVincente;
	private int golCasa;
	private int golOspite;
}
