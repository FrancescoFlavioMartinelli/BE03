package Es3;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.common.io.FileUtils;

public class RegistroPresenze {
	
	private static String filePath = "/Users/francescoflaviomartinelli/eclipse-workspace/Epicode/U2L3/src/Es3/presenze.txt";
	
	private static List<Presenza> presenze = new ArrayList<Presenza>();
	
	public static void main(String[] args) {
		
		if(!readPresenze()) {
			//al posto del return potrei avere il metodo readPresenze che lancia una Exception quando il file no viene trovato o è vuoto, così potrei usare il try invece che l'if e non dovrei usare i return dentro al catch
		
			Presenza p1 = new Presenza("nome1", 5);
			Presenza p2 = new Presenza("nome2", 10);
			
			String presenze = p1 + "#" + p2;
			writePresenze(presenze);
			readPresenze();
		}
		
		
	}

	public static boolean readPresenze() {
		try {
			File file = new File(filePath);
		} catch(NullPointerException e){
			return false;
			//il return dentro al catch non è una buona pratica perchè non fa propagare l'errore, il metodo che ha richiamato readPresenze() riceverà un return come se il funzionamento fosse andato a buon fine
		}
		
		try {
			String contenuto = FileUtils.readFileToString();
			if(contenuto.equals("")) {
				return false;
			}
			String[] pres = contenuto.split("#");
			for(int i = 0; i < pres.length; i++) {
				Presenza p = Presenza.readPresenza(pres[i]);
				presenze.add(p);
			}
			return true;
		} catch(Exception e) {
			return false;
			//in questo caso il throw di un errore non blocca nessuna esecuzione importante in questo metodo quindi possiamo accettare questo return ma potrebbe essere impostato meglio questo codice, così da separare le Exceptions che ci asapettiamo (file non esistente o vuoto) da quelle che potrebbero derivare da altre esecuzioni fallite
			//sarebbe meglio avere il return nelle exception che "accetto" e un throw delle altre per essere catturato e gestito
		}
		
	}
	public static void writePresenze(String s) {
		File file = new File(filePath);
		try {
		FileUtils.writeStringToFile(file, s);
		} catch(IOException e) {}
	}
	
	

}
