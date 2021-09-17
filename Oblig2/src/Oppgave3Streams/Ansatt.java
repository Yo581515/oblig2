package Oppgave3Streams;

public class Ansatt {

	private String fornavn;
	private String etternavn;
	private Kjonn Kjonn;
	private String Stilling;
	private int aarslonn;

	public Ansatt(String fornavn, String etternavn, Kjonn kjonn, String stilling, int aarslonn) {
		this.fornavn = fornavn;
		this.etternavn = etternavn;
		this.Kjonn = kjonn;
		this.Stilling = stilling;
		this.aarslonn = aarslonn;
	}

	public String getFornavn() {
		return fornavn;
	}

	public void setFornavn(String fornavn) {
		this.fornavn = fornavn;
	}

	public String getEtternavn() {
		return etternavn;
	}

	public void setEtternavn(String etternavn) {
		this.etternavn = etternavn;
	}

	public Kjonn getKjonn() {
		return Kjonn;
	}

	public void setKjonn(Kjonn kjonn) {
		Kjonn = kjonn;
	}

	public String getStilling() {
		return Stilling;
	}

	public void setStilling(String stilling) {
		Stilling = stilling;
	}

	public int getAarslonn() {
		return aarslonn;
	}

	public void setAarslonn(int aarslonn) {
		this.aarslonn = aarslonn;
	}

	@Override
	public String toString() {
		return "[fornavn=" + fornavn + ", etternavn=" + etternavn + ", Kjonn=" + Kjonn + ", Stilling=" + Stilling
				+ ", aarslonn=" + aarslonn + "]\n";
	}

}
