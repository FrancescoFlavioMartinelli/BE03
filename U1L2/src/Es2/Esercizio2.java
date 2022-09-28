package Es2;

public class Esercizio2 {
	
	public static void main(String[] args) {
		SIM s = new SIM("1234567890");
		Chiamata[] l = generaListaChiamate();
		s.setListaChiamate(l);
		stampaDati(s);
	}
	
	public static void stampaDati(SIM s) {
		System.out.println("SIM: " + s.getNumeroTelefono());
		System.out.println("Credito: " + s.getCredito());
		System.out.println("Log chiamate: " + s.getLogChiamate());
	}
	
	public static Chiamata[] generaListaChiamate() {
		Chiamata[] l = new Chiamata[5];
		l[0] = new Chiamata(1, "1234356345645");
		l[1] = new Chiamata(2, "1234356345645");
		l[2] = new Chiamata(3, "1234356345645");
		l[3] = new Chiamata(4, "1234356345645");
		l[4] = new Chiamata(5, "1234356345645");
		return l;
	}
	

}
