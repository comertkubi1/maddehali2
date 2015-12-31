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
		
		s1="SORU 1: Her madde farkl� s�cakl�kta Kaynama Noktas�na sahiptir.(D/Y)";
		c1="D";
		tsc1=new TestSoruCevap(s1,c1);
		testsorucevap.add(tsc1);
		
		s1="SORU 2: T�m Maddelerin Erime Donma Noktalar� e�ittir.(D/Y)";
		c1="Y";
		tsc1=new TestSoruCevap(s1,c1);
		testsorucevap.add(tsc1);
		
		s1="SORU 3: Kaynama Noktas� 2750 derece ise bu madde kesinlikle Demirdir.(D/Y)";
		c1="D";
		tsc1=new TestSoruCevap(s1,c1);
		testsorucevap.add(tsc1);
		
		s1="SORU 4: Erime Donma Noktas� -117 derece ise bu madde kesinlikle Etil Alkold�r.(D/Y)";
		c1="D";
		tsc1=new TestSoruCevap(s1,c1);
		testsorucevap.add(tsc1);
		
		s1="SORU 5: Erime Donma ve Kaynama Noktalar� Maddeler i�in Ay�rt edici bir �zellik de�ildir.(D/Y)";
		c1="Y";
		tsc1=new TestSoruCevap(s1,c1);
		testsorucevap.add(tsc1);
		
		s1="SORU 6: Madde Miktar�n De�i�mesinin Erime Donma ve Kaynama Noktalar� �zerindeki etkisi �ok fazlad�r.(D/Y)";
		c1="Y";
		tsc1=new TestSoruCevap(s1,c1);
		testsorucevap.add(tsc1);
		
		s1="SORU 7: Madde Miktar�, Maddeler i�in Ay�rt Edici bir �zellik de�ildir.(D/Y)";
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
			sonuc="Test Ba�ar�s�z, Deneyi Tekrarlamal�s�n.";
		}
		else {
			sonuc="TEBR�KLER TEST BA�ARILI, Bir sonraki Deney'e Ge�ebilirsin.";
			testBittiMi=true;
		}
		return sonuc;
	}
	
	

}
