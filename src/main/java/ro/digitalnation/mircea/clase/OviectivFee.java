package ro.digitalnation.mircea.clase;


public class OviectivFee extends Obiectiv{
	String program;
	String bilet;
	
	public OviectivFee() {
		super();
	}

	public OviectivFee(String nume, String descriere, String adresa, String program, String bilet) {
		super();
		this.nume = nume;
		this.descriere = descriere;
		this.adresa = adresa;
		this.program = program;
		this.bilet = bilet;

	}

	public String getProgram() {
		return program;
	}

	public void setProgram(String program) {
		this.program = program;
	}

	public String getBilet() {
		return bilet;
	}

	public void setBilet(String bilet) {
		this.bilet = bilet;
	}

	@Override
	public String toString() {
		return super.toString() + ", Program: " + program + ", Bilet: " + bilet;
	}
		
	
	
	

}
