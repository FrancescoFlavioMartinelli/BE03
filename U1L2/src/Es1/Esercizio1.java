package Es1;

public class Esercizio1 {
	
	public static void main(String[] args) {
		Rettangolo r1 = new Rettangolo(10, 5);
		Rettangolo r2 = new Rettangolo(4, 7);
		
		stampaRettangolo(r1);
		
		stampaDueRettangoli(r1, r2);
	}
	
	public static void stampaRettangolo(Rettangolo r) {
		System.out.print("AREA: ");
		System.out.println(r.area());
		System.out.print("PERIMETRO: ");
		System.out.println(r.perimetro());
		
	}
	
	public static void stampaDueRettangoli(Rettangolo r1, Rettangolo r2) {
		System.out.print("AREA 1: ");
		System.out.println(r1.area());
		System.out.print("PERIMETRO 1: ");
		System.out.println(r1.perimetro());
		System.out.print("AREA 2: ");
		System.out.println(r2.area());
		System.out.print("PERIMETRO 2: ");
		System.out.println(r2.perimetro());
		System.out.print("AREA TOT: ");
		System.out.println(r1.area() + r2.area());
		System.out.print("PERIMETRO TOT: ");
		System.out.println(r1.perimetro() + r2.perimetro());		
	}

}
