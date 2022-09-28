package Es2;

public class SIM {
	
	private String numeroTelefono;
	private double credito;
	private Chiamata[] listaChiamate;
	
	public SIM(String n) {
		this.numeroTelefono = n;
		this.credito = 0;
		this.listaChiamate = new Chiamata[5];
	}
	
	public String getNumeroTelefono() {
		return this.numeroTelefono;
	}
	
	public double getCredito() {
		return this.credito;
	}
	/*
	public Chiamata[] getChiamate() {
		return this.listaChiamate;
	}*/
	
	public void setListaChiamate(Chiamata[] l) {
		this.listaChiamate = l;
	}
	
	public String getLogChiamate() {
		if(this.listaChiamate[0] == null) {
			return "NESSUNA CHIAMATA";
		}
		String log = "Log chiamate";
		for(int i = 0; i < this.listaChiamate.length; i++) {
			if(this.listaChiamate[0] != null ) {
				log += "\nChiamata " + i + ": " + this.listaChiamate[i].getNumeroContattato() + " - durata: " + this.listaChiamate[i].getDurata();
			}
		}
		return log;
	}
	
	

}
