package Oppgave1LambdaUttrykk;

public class Oppg1b {

	public static void main(String[] args) {

//		i
		Funskjon summerFunksjon = (a, b) -> a + b;
		int sum = beregn(12, 13, summerFunksjon);
		System.out.println("Summen av 12 og 13 = " + sum + "\n");

//		ii
		Funskjon maxFunksjon = (a, b) -> Math.max(a, b);
		int denStoorste = beregn(12, 13, maxFunksjon);
		System.out.println("Den største av -5 og 3 = " + denStoorste + "\n");

//		iii
		Funskjon differanseFunksjon = (a, b) -> Math.abs(b - a);
		int diferanse = beregn(-1, 1, differanseFunksjon);
		System.out.println("Avstanden (absoluttverdien av differansen) mellom 54 og 45 = " + diferanse + "\n");

	}

	public static int beregn(int a, int b, Funskjon funksjon) {
		return funksjon.regn(a, b);
	}

}

@FunctionalInterface
interface Funskjon {
	public int regn(int a, int b);
}
