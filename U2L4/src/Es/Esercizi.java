package Es;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Esercizi {
	
	static Random r = new Random();
	static List<Prodotto> p = new ArrayList<Prodotto>();
	static List<Cliente> c = new ArrayList<Cliente>();
	static List<Ordine> o = new ArrayList<Ordine>();

	public static void main(String[] args) {
		

		for(int i = 0; i < 5; i++) {
			p.add(Prodotto.generaProdotto1());
			p.add(Prodotto.generaProdotto2());
			p.add(Prodotto.generaProdotto3());
		}
		
		c.add(new Cliente(0l, "c1", 1));
		c.add(new Cliente(1l, "c2", 2));
		
		LocalDate od = LocalDate.parse("2021-05-01");
		LocalDate dd = od.plusYears(1);
		
		for(long i = 0; i < 5; i ++) {
			List<Prodotto> prodottiOrdine = new ArrayList<Prodotto>();
			prodottiOrdine.add(p.get(r.nextInt(p.size())));
			prodottiOrdine.add(p.get(r.nextInt(p.size())));
			prodottiOrdine.add(p.get(r.nextInt(p.size())));
			prodottiOrdine.add(p.get(r.nextInt(p.size())));
			o.add(new Ordine(i,
					"s1",
					LocalDate.parse("2021-01-01").plusMonths(r.nextInt(2)),
					LocalDate.now(),
					prodottiOrdine,
					c.get(r.nextInt(c.size()))));
		}

		System.out.println(es4());
		
		

	}

	private static List<Prodotto> es1() {
		return p.stream().filter(pr -> pr.getCategoria() == Categoria.BOOKS).filter(pr->pr.getPrezzo() > 100).collect(Collectors.toList());
	}
	
	private static List<Ordine> es2() {
		return o.stream()
				.filter(or -> 
				or.getProdotti().stream().anyMatch(
						pr -> pr.getCategoria() == Categoria.BABY
					))
				.collect(Collectors.toList());
		
	}
	
	private static List<Prodotto> es3() {
		return p.stream()
				.filter(pr -> pr.getCategoria() == Categoria.BOY)
				.map(pr -> {
					double prezzoScontato = pr.getPrezzo() - (pr.getPrezzo() * 0.1);
					pr.setPrezzo(prezzoScontato);
					return pr;
					})
				.collect(Collectors.toList());
		
	}
	private static List<Prodotto> es4() {
		LocalDate inizio = LocalDate.parse("2021-02-01");
		LocalDate fine = LocalDate.parse("2021-04-01");
		
		//ottenere la stream
		Stream<Ordine> ordiniStream = o.stream();
		//operazioni
		ordiniStream = ordiniStream.filter(or -> or.getCliente().getTier() == 2);
		ordiniStream = ordiniStream.filter(or -> or.getOrderDate().compareTo(inizio) >= 0);
		ordiniStream = ordiniStream.filter(or -> or.getOrderDate().compareTo(fine) <= 0);
		//ricostruire la lista
		//List<Ordine> l = ordiniStream.collect(Collectors.toList());
		
		Stream<Prodotto> prodottiStream = ordiniStream.flatMap(or -> or.getProdotti().stream());
		prodottiStream = prodottiStream.distinct();
		return prodottiStream.collect(Collectors.toList());
	}
	
	private static List<Prodotto> es4bis() {

		LocalDate inizio = LocalDate.parse("2021-02-01");
		LocalDate fine = LocalDate.parse("2021-04-01");
	
		Predicate<Ordine> tier2 = or -> or.getCliente().getTier() == 2;
		
		return o.stream()
				.filter(tier2)
				.filter(or -> or.getOrderDate().compareTo(inizio) >= 0)
				.filter(or -> or.getOrderDate().compareTo(fine) <= 0)
				.flatMap(or -> or.getProdotti().stream())
				.distinct().collect(Collectors.toList());
	}

}
