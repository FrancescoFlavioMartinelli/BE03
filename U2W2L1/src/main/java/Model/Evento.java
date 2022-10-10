package Model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Evento {
	
	@Id
	@SequenceGenerator(name="evento_gen", sequenceName="evento_gen", allocationSize=1)
	@GeneratedValue(strategy= GenerationType.IDENTITY, generator="evento_gen")
	private long id;
	
	@Enumerated(EnumType.STRING)
	private TipoEvento tipoEvento;
	
	private String titolo;
	private LocalDate dataEvento;
	private String descrizione;
	private int numeroMassimoPartecipanti;

}
