package Biblioteca;

public enum Periodicita {
	SETTIMANALE,
	MENSILE,
	SEMETRALE,
	UNDEFINED;
	

	public static Periodicita getFromString(String s) {
		for(Periodicita p : Periodicita.values()) {
			if(p.toString().equalsIgnoreCase(s)) {
				return p;
			} 
		}
		return UNDEFINED;
	}
}