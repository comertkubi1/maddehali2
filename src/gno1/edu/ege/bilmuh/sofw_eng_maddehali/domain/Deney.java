package gno1.edu.ege.bilmuh.sofw_eng_maddehali.domain;

import java.util.ArrayList;

public class Deney {
	private ArrayList<DeneySonuc> deneysonuclari;
	private boolean deneyBittiMi;

	public Deney() {
		this.setDeneysonuclari(new ArrayList<DeneySonuc>());
		this.setDeneyBittiMi(false);
	}

	public ArrayList<DeneySonuc> getDeneysonuclari() {
		return deneysonuclari;
	}

	public void setDeneysonuclari(ArrayList<DeneySonuc> deneysonuclari) {
		this.deneysonuclari = deneysonuclari;
	}

	public boolean isDeneyBittiMi() {
		return deneyBittiMi;
	}

	public void setDeneyBittiMi(boolean deneyBittiMi) {
		this.deneyBittiMi = deneyBittiMi;
	}

	public DeneySonuc deneySonucuAl(int kg, int derece) {
		// TODO burada Maddeleri olu�tur aray�ze yolla ve kontrol ama�l� listeye
		// ekle.
		SafSu safsu = new SafSu(kg, derece);
		EtilAlkol etilalkol = new EtilAlkol(kg, derece);
		Demir demir = new Demir(kg, derece);

		DeneySonuc deneysonuc = new DeneySonuc(safsu, etilalkol, demir);

		deneysonuclari.add(deneysonuc);

		return deneysonuc;
	}

	public String deneyiBitir() {
		// TODO Auto-generated method stub
		String sonuc = "";
		if (deneysonuclari.size() < 9) {
			sonuc = "..::Deney Tamamlanmad�, Test Ba�lat�lamaz::..";

		} else {
			sonuc = "Deney Ba�ar�l�, Teste Ba�layabilirsiniz..";
			this.deneyBittiMi = true;
		}
		return sonuc;
	}

}