package gno1.edu.ege.bilmuh.sofw_eng_maddehali.domain;

public class Demir extends Madde {

	private int erimeDonmaNoktasi;
	private int kaynamaNoktasi;
	private String maddeIsmi;
	private String maddeninHali;

	
	
	public String getMaddeIsmi() {
		return maddeIsmi;
	}

	public void setMaddeIsmi(String maddeIsmi) {
		this.maddeIsmi = maddeIsmi;
	}

	public String getMaddeninHali() {
		return maddeninHali;
	}

	public void setMaddeninHali(String maddeninHali) {
		this.maddeninHali = maddeninHali;
	}

	public Demir(int kg, int derece) {
		// TODO Auto-generated constructor stub
		super(kg, derece);
		this.erimeDonmaNoktasi = 1538;
		this.kaynamaNoktasi = 2750;
		this.maddeIsmi = "DEM�R";
		this.maddeninHaliniBul(derece);
	}

	private void maddeninHaliniBul(int derece) {
		// TODO Auto-generated method stub
		String hali = "";
		if (derece == erimeDonmaNoktasi) {
			hali = "Erime Donma Noktas�";
		} else if (derece == kaynamaNoktasi) {
			hali = "Kaynama Noktas�";
		} else if (derece < erimeDonmaNoktasi) {
			hali = "Kat�";
		} else if (derece > erimeDonmaNoktasi && derece < kaynamaNoktasi) {
			hali = "S�v�";
		} else {
			hali = "Gaz";
		}

		this.maddeninHali = hali;
	}

}
