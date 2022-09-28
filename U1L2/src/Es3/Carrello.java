package Es3;

public class Carrello {
	private Cliente cliente;
	private Articolo[] articoli;
	private double prezzoTotale;

	
	public double getPrezzoTotale() {
		/*double tot = 0;
		for(int i = 0; i < this.articoli.length; i++) {
			tot += this.articoli[i].getPrezzo();
		}
		return tot;
		*/
		return this.prezzoTotale;
	}
	
	public void setListaArticoli(Articolo[] l) {
		this.articoli = l;
		this.updateTot();
	}
	
	private void updateTot() {
		double tot = 0;
		for(int i = 0; i < this.articoli.length; i++) {
			//Articolo a = Articolo.getArticoloById(this.articoli[i]);
			tot += articoli[i].getPrezzo();
		}
		this.prezzoTotale = tot;
	}
	
}
