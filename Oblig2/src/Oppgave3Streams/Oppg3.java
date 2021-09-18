package Oppgave3Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import Oppgave2LambdaUttrykk.Ansatt;
import Oppgave2LambdaUttrykk.Kjonn;

public class Oppg3 {

	public static void main(String[] args) {
		List<Ansatt> ansatter = Arrays.asList(new Ansatt("Ole", "Anders", Kjonn.MANN, "Data Ingeniør sjef", 900000),
				new Ansatt("Andrea", "BeGrenser", Kjonn.KVINNE, "Data Ingeniør", 900000),
				new Ansatt("Yosafe", "Fesaha", Kjonn.MANN, "Data Ingeniør", 250000),
				new Ansatt("Alfred", "Vilfred", Kjonn.MANN, "Data Ingeniør", 900000),
				new Ansatt("Tereza", "Fesaha", Kjonn.KVINNE, "Lærer sjef", 500000));
		utskriftAlle(ansatter);

//		3 a) 
		System.out.println("a) Lag en ny liste som kun inneholder etternavnene til de ansatte. ");
		List<String> etternavnene = ansatter.stream()
				.map((a) -> a.getEtternavn())
				.collect(Collectors.toList());
		utskriftAlle(etternavnene);

//		3 b) 
		System.out.println("b) Finn ut antall kvinner blant de ansatte.");
		int antallKvinner = (int) ansatter.stream()
				.filter((a) -> a.getKjonn().equals(Kjonn.KVINNE))
				.count();
		System.out.println(antallKvinner + "\n");

//		3 c) 
		System.out.println("c) Regn ut gjennomsnittslønnen til kvinnene.");
		double gjennomsnittslønnen = ansatter.stream()
				.filter(a -> a.getKjonn().equals(Kjonn.KVINNE))
				.mapToDouble(a -> a.getAarslonn())
				.average()
				.orElse(Double.NaN);
		System.out.println(gjennomsnittslønnen + "\n");

		// 3 d) Gi alle sjefer (stilling inneholder noe med "sjef") en lønnsøkning på 7%
		// ved å
//		bruke streams direkte i stedet for metoden du laget i Oppg2. Skriv ut listen av 
//		ansatte etter lønnsøkningen.
//		double prosentTilegg = 07.0; // a.setAarslonn((int) (a.getAarslonn() * (1 + (prosentTilegg / 100))))
//		ansatter = ansatter.stream()

//		3 e) 
		System.out.println("e) Finn ut (true|false) om det er noen ansatte som tjener mer enn 800.000,-");
		boolean ansattSomTjenerMerEnn800000 = ansatter.stream()
				.anyMatch(a -> a.getAarslonn() > 800000);
		System.out.println(ansattSomTjenerMerEnn800000 + "\n");

//		3 f) 
		System.out.println("f) Skriv ut alle de ansatte med System.out.println() uten å bruke løkke.");
		ansatter.stream().forEach(System.out::println);
		System.out.println();

//		3 g) 
		System.out.println("g) Finn den/de ansatte som har lavest lønn.");
		ansatter.stream()
		.min(Comparator.comparing(Ansatt::getAarslonn))
		.ifPresent(System.out::println);
		System.out.println();

//		3 h) 
		System.out.println("h) Finn ut summen av alle heltall i [1, 1000> som er delelig med 3 eller 5.");
		int sum = IntStream
				.range(1, 1000).filter(a -> a % 3 == 0 || a % 5 == 0)
				.sum();
		System.out.println(sum);

	}

	public static <T> void utskriftAlle(List<T> ansatte) {
		System.out.print("[");
		for (int i = 0; i < ansatte.size(); i++) {
			System.out.print(ansatte.get(i));
			if (i != ansatte.size() - 1) {
				System.out.println(", ");
			} else {
				System.out.print("]\n\n");
			}
		}
	}

}
