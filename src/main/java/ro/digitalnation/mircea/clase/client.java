package ro.digitalnation.mircea.clase;

public class client {

	long id;
	String nume;
	String adresa;
	String tel;
	int nrPersoane;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public String getAdresa() {
		return adresa;
	}
	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public client(long id, String nume, String adresa, String tel) {
		super();
		this.id = id;
		this.nume = nume;
		this.adresa = adresa;
		this.tel = tel;
	}
	
}
