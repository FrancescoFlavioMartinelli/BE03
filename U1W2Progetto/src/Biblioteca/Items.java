package Biblioteca;

public abstract class Items {
	
	private long ISBN;
	private String titolo;
	private int anno;
	private int pagine;

	public Items(long ISBN, String titolo, int anno, int pagine) {
		this.ISBN = ISBN;
		this.titolo = titolo;
		this.anno = anno;
		this.pagine = pagine;
	}
	
	public long getISBN() {
		return this.ISBN;
	}

	public int getAnno() {
		return this.anno;
	}
	
	public String toString() {
		return this.ISBN+","+titolo+","+anno+","+pagine;
				
	}
	
	

}
