package ro.digitalnation.mircea.clase;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Utilizator {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String nume;
	private String email;
	private String parola;
	private String dataNasterii;
	private String gen;
	private String ocupatie;
	private boolean casatorie;
	private String obs;
	
	
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getParola() {
		return parola;
	}
	public void setParola(String parola) {
		this.parola = parola;
	}
	public String getDataNasterii() {
		return dataNasterii;
	}
	public void setDataNasterii(String dataNasterii) {
		this.dataNasterii = dataNasterii;
	}
	public String getGen() {
		return gen;
	}
	public void setGen(String gen) {
		this.gen = gen;
	}
	public String getOcupatie() {
		return ocupatie;
	}
	public void setOcupatie(String ocupatie) {
		this.ocupatie = ocupatie;
	}
	public boolean isCasatorie() {
		return casatorie;
	}
	public void setCasatorie(boolean casatorie) {
		this.casatorie = casatorie;
	}
	public String getObs() {
		return obs;
	}
	public void setObs(String obs) {
		this.obs = obs;
	}
	@Override
	public String toString() {
		return "utilizator [nume=" + nume + ", email=" + email + ", parola=" + parola + ", dataNasterii=" + dataNasterii
				+ ", gen=" + gen + ", ocupatie=" + ocupatie + ", casatorie=" + casatorie + ", obs=" + obs + "]";
	}
	
	
	

}
