package gno1.edu.ege.bilmuh.sofw_eng_maddehali.domain;

import java.util.ArrayList;

public class TestQuiz {
	ArrayList<TestSoruCevap> testsorucevap;
	public ArrayList<TestSoruCevap> getTestsorucevap() {
		return testsorucevap;
	}

	public void setTestsorucevap(ArrayList<TestSoruCevap> testsorucevap) {
		this.testsorucevap = testsorucevap;
	}

	boolean testBittiMi;
	public TestQuiz() {
		testsorucevap=new ArrayList<TestSoruCevap>();
		this.testSoruCevapHazirla();
		testBittiMi=false;
	}

	private void testSoruCevapHazirla() {
		String s1,c1;
		TestSoruCevap tsc1;
		
		s1="SORU 1: Her madde farklý sýcaklýkta Kaynama Noktasýna sahiptir.(D/Y)";
		c1="D";
		tsc1=new TestSoruCevap(s1,c1);
		testsorucevap.add(tsc1);
		
		s1="SORU 2: Tüm Maddelerin Erime Donma Noktalarý eþittir.(D/Y)";
		c1="Y";
		tsc1=new TestSoruCevap(s1,c1);
		testsorucevap.add(tsc1);
		
		s1="SORU 3: Kaynama Noktasý 2750 derece ise bu madde kesinlikle Demirdir.(D/Y)";
		c1="D";
		tsc1=new TestSoruCevap(s1,c1);
		testsorucevap.add(tsc1);
		
		s1="SORU 4: Erime Donma Noktasý -117 derece ise bu madde kesinlikle Etil Alkoldür.(D/Y)";
		c1="D";
		tsc1=new TestSoruCevap(s1,c1);
		testsorucevap.add(tsc1);
		
		s1="SORU 5: Erime Donma ve Kaynama Noktalarý Maddeler için Ayýrt edici bir özellik deðildir.(D/Y)";
		c1="Y";
		tsc1=new TestSoruCevap(s1,c1);
		testsorucevap.add(tsc1);
		
		s1="SORU 6: Madde Miktarýn Deðiþmesinin Erime Donma ve Kaynama Noktalarý üzerindeki etkisi çok fazladýr.(D/Y)";
		c1="Y";
		tsc1=new TestSoruCevap(s1,c1);
		testsorucevap.add(tsc1);
		
		s1="SORU 7: Madde Miktarý, Maddeler için Ayýrt Edici bir özellik deðildir.(D/Y)";
		c1="D";
		tsc1=new TestSoruCevap(s1,c1);
		testsorucevap.add(tsc1);
	}

	public String testSonucuHesapla(String c1, String c2, String c3, String c4, String c5, String c6, String c7) {
		String sonuc="";
		int indx=0;
		String[] cevapdizim={c1,c2,c3,c4,c5,c6,c7};
		int puan=0;
		for (TestSoruCevap tsorucevap : testsorucevap) {
			if (tsorucevap.getTestcevap()==cevapdizim[indx]) {
				puan += 15;
			}
			indx++;
		}
		if (puan<50) {
			sonuc="Test Baþarýsýz, Deneyi Tekrarlamalýsýn.";
		}
		else {
			sonuc="TEBRÝKLER TEST BAÞARILI, Bir sonraki Deney'e Geçebilirsin.";
			testBittiMi=true;
		}
		return sonuc;
	}
	
	

}
