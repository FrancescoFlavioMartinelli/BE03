package Es3;

import java.util.ArrayList;
import java.util.List;

public class Articolo {
	
	//private static List articoli = new ArrayList();
	
	private int codice;
	private String descr;
	private double prezzo;
	private int disp;
	
	private Articolo(int cod, String d, double p, int disp) {
		this.codice = cod;
		this.descr = d;
		this.prezzo = p;
		this.disp = disp;
	}
	/*
	public Articolo CreaArticolo(int cod, String d, double p, int disp) {
		Articolo a = new Articolo();
		articoli.add(a);
		return a;
		}*/
	
	public double getPrezzo() {
		return this.prezzo;
	}

	/*
	public static Articolo getArticoloById(int i) {
		// TODO Auto-generated method stub
		return null;
	}*/
}
