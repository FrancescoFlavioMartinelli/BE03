package Es;

public class Cliente {
	
	private Long id;
	private String nome;
	private int tier;
	
	public Cliente(Long id, String n, int t) {
		this.id = id;
		this.nome = n;
		this.tier = t;
	}
	
	public int getTier() {
		return this.tier;
	}
	

	public String toString() {
		return this.id + "-" + this.nome;
	}
	

}
