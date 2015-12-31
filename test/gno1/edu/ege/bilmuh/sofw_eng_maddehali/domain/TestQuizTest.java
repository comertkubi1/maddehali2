package gno1.edu.ege.bilmuh.sofw_eng_maddehali.domain;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestQuizTest {

	@Test
	public void testTestSoruSayisi() {
		//setup
		TestQuiz tesq=new TestQuiz();
		//execute, Assert
		assertEquals(7, tesq.getTestsorucevap().size());
		
	}
	
	@Test
	public void testTestSonucuHesaplaBasarili() {
		//setup
		TestQuiz tesq=new TestQuiz();
		//execute
		String str=tesq.testSonucuHesapla("D", "Y", "D", "D", "Y", "Y", "D");
		//Assert
		assertEquals("TEBR�KLER TEST BA�ARILI, Bir sonraki Deney'e Ge�ebilirsin.", str);
		
	}
	
	@Test
	public void testTestSonucuHesaplaBasarisiz() {
		//setup
		TestQuiz tesq=new TestQuiz();
		//execute
		String str=tesq.testSonucuHesapla("D", "Y", "D", "Y", "D", "D", "Y");
		//Assert
		assertEquals("Test Ba�ar�s�z, Deneyi Tekrarlamal�s�n.", str);
		
	}



}
