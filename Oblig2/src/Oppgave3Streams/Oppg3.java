package Oppgave3Streams;

import java.util.Arrays;
import java.util.List;

import Oppgave2LambdaUttrykk.Ansatt;
import Oppgave2LambdaUttrykk.Kjonn;

public class Oppg3 {

	public static void main(String[] args) {
		List<Ansatt> ansatter = Arrays.asList(new Ansatt("Ole", "Anders", Kjonn.MANN, "Data Ingeniør", 900000),
				new Ansatt("Andrea", "BeGrenser", Kjonn.KVINNE, "Data Ingeniør", 800000),
				new Ansatt("Yosafe", "Fesaha", Kjonn.MANN, "Data Ingeniør", 200000),
				new Ansatt("Alfred", "Vilfred", Kjonn.MANN, "Data Ingeniør", 300000),
				new Ansatt("Matias", "Saitam", Kjonn.MANN, "Data Ingeniør", 40000000));

	}

}
