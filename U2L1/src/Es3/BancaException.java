package Es3;

public class BancaException extends Exception {
	
	private String msg;
	
	public BancaException(String m) {
		super(m);
		this.msg = m;
	}
	
	@Override
	public String toString() {
		return "BANCAEXCEPTION - " + this.msg;
	}
	
	

}
