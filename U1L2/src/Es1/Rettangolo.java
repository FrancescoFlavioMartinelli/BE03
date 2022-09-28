package Es1;

public class Rettangolo {
	private double altezza;
	private double larghezza;
	
	public Rettangolo(double a, double l){
		this.altezza = a;
		this.larghezza = l;
	}
	
	public double area() {
		return altezza * larghezza;
	}
	
	public double perimetro() {
		return (altezza + larghezza)*2;
	}

}
