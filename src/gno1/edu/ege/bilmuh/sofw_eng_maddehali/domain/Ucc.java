package gno1.edu.ege.bilmuh.sofw_eng_maddehali.domain;

public class Ucc {
	Ogrenci ogr;

	public void kayitOlDeneyBaslat(String ad, String sad, int no) {
		ogr = new Ogrenci(ad, sad, no);
		ogr.deneyBaslat();// constrc olabilirdi designa uydurduk
	}

	public DeneySonuc maddelerinHaliniGoster(int kg, int derece) {
		return ogr.maddelerinHaliniGoster(kg, derece);
	}

	public Ogrenci getOgr() {
		return ogr;
	}

	public void setOgr(Ogrenci ogr) {
		this.ogr = ogr;
	}

	public String deneyiBitir() {
		return ogr.deneyiBitir();
	}

	public TestQuiz testBaslat() {
		return ogr.testBaslat();
	}
	
	public String testCevapla(String c1, String c2, String c3, String c4, String c5, String c6, String c7) {
		return	ogr.testCevapla(c1,c2,c3,c4,c5,c6,c7);
		
	}

}
