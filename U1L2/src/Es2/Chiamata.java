package Es2;

public class Chiamata {
	
	private double durata;
	private String numeroContattato;
	
	public Chiamata(double d, String n) {
		this.durata = d;
		this.numeroContattato = n;
	}

	public double getDurata() {
		return this.durata;
	}
	
	public String getNumeroContattato() {
		return this.numeroContattato;
	}
}
