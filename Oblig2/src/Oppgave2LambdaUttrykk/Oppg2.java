package Oppgave2LambdaUttrykk;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Oppg2 {

	private static void lonnsoppgjor(List<Ansatt> ansatte, Consumer<Ansatt> consumer, Predicate<Ansatt> predicate) {
		for (Ansatt a : ansatte) {
			if (predicate.test(a)) {
				consumer.accept(a);
			}
		}
	}

	public static void main(String[] args) {

		List<Ansatt> ansatter = Arrays.asList(new Ansatt("Ole", "Anders", Kjonn.MANN, "Data Ingeniør", 900000),
				new Ansatt("Andrea", "BeGrenser", Kjonn.KVINNE, "Data Ingeniør", 800000),
				new Ansatt("Yosafe", "Fesaha", Kjonn.MANN, "Data Ingeniør", 200000),
				new Ansatt("Alfred", "Vilfred", Kjonn.MANN, "Data Ingeniør", 300000),
				new Ansatt("Matias", "Saitam", Kjonn.MANN, "Data Ingeniør", 40000000));

		System.out.println(ansatter);
		System.out.println();

		int leggTilKron = 50;
		lonnsoppgjor(ansatter, (a) -> a.setAarslonn(a.getAarslonn() + leggTilKron), (a) -> true);
		System.out.println("Et fast kronetillegg");
		System.out.println(ansatter);
		System.out.println();

		System.out.println("Et fast prosenttillegg");
		double prosentTilegg = 40.0;
		lonnsoppgjor(ansatter, (a) -> a.setAarslonn((int) (a.getAarslonn() * (1 + (prosentTilegg / 100)))), a -> true);
		System.out.println(ansatter);
		System.out.println();

		System.out.println("Et fast kronetillegg hvis du har lav lønn");
		int leggTilKronforLavLonn = 100000;
		lonnsoppgjor(ansatter, (a) -> a.setAarslonn(a.getAarslonn() + leggTilKronforLavLonn),
				(a) -> a.getAarslonn() <= 30000);
		System.out.println(ansatter);
		System.out.println();

		System.out.println("Et fast kronetillegg hvis du har lav lønn");
		int leggTilKronformen = 100000;
		lonnsoppgjor(ansatter, (a) -> a.setAarslonn(a.getAarslonn() + leggTilKronformen),
				(a) -> a.getKjonn() == Kjonn.MANN);
		System.out.println(ansatter);
		System.out.println();

	}

}
