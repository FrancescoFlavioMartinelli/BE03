package Es;

import java.util.Random;

public class Prodotto {
	
	static Long instances = 0l;
	static Random r = new Random();
	
	private Long id;
	private String nome;
	private Categoria categoria;
	private Double prezzo;
	
	public Prodotto(String n, Categoria c, Double p) {
		this.id = instances;
		instances++;
		this.nome = n;
		this.categoria = c;
		this.prezzo = p;
	}
	
	public Categoria getCategoria() {
		return this.categoria;
	}
	
	public Double getPrezzo() {
		return this.prezzo;
	}

	public static Prodotto generaProdotto1() {
		return new Prodotto("p1", Categoria.BOOKS, 10d);
	}
	public static Prodotto generaProdotto2() {
		return new Prodotto("p2", Categoria.BABY, 100d);
	}
	public static Prodotto generaProdotto3() {
		return new Prodotto("p3", Categoria.BOY, 1000d);
	}
	
	public static double randomNumber() {
		int max = 10;
		int min = 1;
		int range = max - min + 1;
		double number = (double) (Math.random() * 10) + min;
		return number;
	}
	
	public String toString() {
		return this.id + "-" + this.categoria;
	}
	
	public void setPrezzo(double p) {
		this.prezzo = p;
	}


}
