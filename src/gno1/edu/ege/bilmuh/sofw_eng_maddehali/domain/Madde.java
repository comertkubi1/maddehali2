package gno1.edu.ege.bilmuh.sofw_eng_maddehali.domain;

public class Madde {
	int kg;
	int derece;

	public int getKg() {
		return kg;
	}

	public void setKg(int kg) {
		this.kg = kg;
	}

	public int getDerece() {
		return derece;
	}

	public void setDerece(int derece) {
		this.derece = derece;
	}

	public Madde(int kg, int derece) {
		this.kg = kg;
		this.derece = derece;
	}

}
