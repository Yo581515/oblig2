package Oppgave3Streams;

import java.util.Arrays;
import java.util.List;

import Oppgave2LambdaUttrykk.Ansatt;
import Oppgave2LambdaUttrykk.Kjonn;

public class Oppg3 {

	public static void main(String[] args) {
		List<Ansatt> ansatter = Arrays.asList(new Ansatt("Ole", "Anders", Kjonn.MANN, "Data Ingeni�r", 900000),
				new Ansatt("Andrea", "BeGrenser", Kjonn.KVINNE, "Data Ingeni�r", 800000),
				new Ansatt("Yosafe", "Fesaha", Kjonn.MANN, "Data Ingeni�r", 200000),
				new Ansatt("Alfred", "Vilfred", Kjonn.MANN, "Data Ingeni�r", 300000),
				new Ansatt("Matias", "Saitam", Kjonn.MANN, "Data Ingeni�r", 40000000));

	}

}
