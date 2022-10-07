package Biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		Catalogo c = new Catalogo("c1");
		
		c.leggiCatalogo();
		if(c.items.size() == 0) {
			do {
				c.nuovoItem();
			} while(c.items.size() < 2);
		}
		
		
		

	}

}
