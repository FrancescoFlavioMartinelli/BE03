package Es3;

public class Presenza {
private String nome;
private int nPres;

private static String delim = "@";

	public Presenza(String n, int np) {
		this.nome = n;
		this.nPres = np;
	}
	
	public String toString() {
		return this.nome + delim + this.nPres;
	}

	public static Presenza readPresenza(String s) {
		String[] singolaPresenza = s.split(delim);
		String nome = singolaPresenza[0];
		int nPresenze = Integer.valueOf(singolaPresenza[1]);
		Presenza p = new Presenza(nome, nPresenze);
		return p;
	}

}
