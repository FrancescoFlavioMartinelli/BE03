package Biblioteca;

public class Libro extends Items {

	Genere genere;
	String autore;
	
	public Libro(long ISBN, String titolo, int anno, int pagine, String autore, Genere g) {
		super(ISBN, titolo, anno, pagine);
		this.genere = g;
		this.autore = autore;
	}

	public String getAutore() {
		return autore;
	}
	
	@Override
	public String toString() {
		return "L," + super.toString() + ","+this.genere+","+this.getAutore();
	}
}
