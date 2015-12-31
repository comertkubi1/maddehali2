package gno1.edu.ege.bilmuh.sofw_eng_maddehali.domain;

public class Ogrenci {
	private String ad;
	private String sad;
	private int no;
	private Deney deney;
	private TestQuiz test;

	public Ogrenci(String ad, String sad, int no) {
		// TODO Auto-generated constructor stub
		this.ad = ad;
		this.sad = sad;
		this.no = no;
	}

	public void deneyBaslat() {
		// TODO Auto-generated method stub
		deney = new Deney();
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSad() {
		return sad;
	}

	public void setSad(String sad) {
		this.sad = sad;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public Deney getDeney() {
		return deney;
	}

	public void setDeney(Deney deney) {
		this.deney = deney;
	}

	public DeneySonuc maddelerinHaliniGoster(int kg, int derece) {
		// TODO Auto-generated method stub
		return deney.deneySonucuAl(kg, derece);
	}

	public String deneyiBitir() {
		// TODO Auto-generated method stub
		return deney.deneyiBitir();
	}

	public TestQuiz testBaslat() {
		this.test=new TestQuiz();
		return test;
	}

	public String testCevapla(String c1, String c2, String c3, String c4, String c5, String c6, String c7) {
		return test.testSonucuHesapla(c1,c2,c3,c4,c5,c6,c7);
		 
	}

}
