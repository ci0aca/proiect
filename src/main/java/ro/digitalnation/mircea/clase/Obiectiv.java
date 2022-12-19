package ro.digitalnation.mircea.clase;

public class Obiectiv {
	Long id;
	String nume;
	String descriere;
	String adresa;
	
	
	public Obiectiv() {
		
	}


	public Obiectiv(Long id, String nume, String descriere, String adresa) {
		this.id = id;
		this.nume = nume;
		this.descriere = descriere;
		this.adresa = adresa;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNume() {
		return nume;
	}


	public void setNume(String nume) {
		this.nume = nume;
	}


	public String getDescriere() {
		return descriere;
	}


	public void setDescriere(String descriere) {
		this.descriere = descriere;
	}


	public String getAdresa() {
		return adresa;
	}


	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}


	@Override
	public String toString() {
		String s = "Id: " + id + "Nume: " + nume + ", Descriere: " + descriere +  ", Adresa: " + adresa ;
		return s;
	}

	

	
	}



