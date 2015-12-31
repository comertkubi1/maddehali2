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
		assertEquals("TEBRÝKLER TEST BAÞARILI, Bir sonraki Deney'e Geçebilirsin.", str);
		
	}
	
	@Test
	public void testTestSonucuHesaplaBasarisiz() {
		//setup
		TestQuiz tesq=new TestQuiz();
		//execute
		String str=tesq.testSonucuHesapla("D", "Y", "D", "Y", "D", "D", "Y");
		//Assert
		assertEquals("Test Baþarýsýz, Deneyi Tekrarlamalýsýn.", str);
		
	}



}
