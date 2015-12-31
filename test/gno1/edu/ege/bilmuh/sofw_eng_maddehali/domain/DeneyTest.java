package gno1.edu.ege.bilmuh.sofw_eng_maddehali.domain;

import static org.junit.Assert.*;

import org.junit.Test;

public class DeneyTest {

	@Test
	public void testDeneyBittiMi() {
		//setup
		Deney deney=new Deney();
		
		deney.deneySonucuAl(10, -120);
		deney.deneySonucuAl(10, -117);
		deney.deneySonucuAl(10, 0);
		deney.deneySonucuAl(10, 78);
		deney.deneySonucuAl(10, 100);
		deney.deneySonucuAl(10, 1538);
		deney.deneySonucuAl(10, 2000);
		deney.deneySonucuAl(10, 2750);
		deney.deneySonucuAl(10, 3000);
		
		//execute
		String bekle1=deney.deneyiBitir();
		boolean bekle=deney.isDeneyBittiMi();
		
		//assert
		assertEquals("Deney Baþarýlý, Teste Baþlayabilirsiniz..", bekle1);
		assertTrue(bekle);
	}
	
	@Test
	public void testDeneyBittiMiOnlyOne() {
		//setup
		Deney deney=new Deney();
		
		deney.deneySonucuAl(10, -120);
		
		//execute
		String bekle1=deney.deneyiBitir();
		boolean bekle=deney.isDeneyBittiMi();
		
		//assert
		assertEquals("..::Deney Tamamlanmadý, Test Baþlatýlamaz::..", bekle1);
		assertFalse(bekle);
	}

}
