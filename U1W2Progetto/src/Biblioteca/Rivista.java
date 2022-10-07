package Biblioteca;

public class Rivista extends Items {
	
	Periodicita periodicita;
	
	public Rivista(long ISBN, String titolo, int anno, int pagine, Periodicita p) {
		super(ISBN, titolo, anno, pagine);
		this.periodicita = p;
	}
	@Override
	public String toString() {
		return "R," + super.toString() + ","+this.periodicita;
	}

}
