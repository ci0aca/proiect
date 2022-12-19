package ro.digitalnation.mircea.clase;

import java.util.List;

public class Home {

	String nume = "BRASOV";
	 String content;

	public Home(String nume, String content) {
		this.nume = nume;
		this.content = content;
		nume = "Biserica Neagra";
	}

	public String getNume() {
		return nume;
	}

	public String getContent() {
		return content;
	}

	public List<Home> getAllHome() {
		// TODO Auto-generated method stub
		return null;
	}
	 String[] homeList = {nume, content};
}