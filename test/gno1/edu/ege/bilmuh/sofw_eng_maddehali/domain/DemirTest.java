package gno1.edu.ege.bilmuh.sofw_eng_maddehali.domain;

import static org.junit.Assert.*;

import org.junit.Test;

public class DemirTest {

	@Test
	public void testDemirErimeDonmaNoktasi() {
		//setup, execute
		Demir demir=new Demir(10, 1538);
		//assert
		assertEquals("Erime Donma Noktasý", demir.getMaddeninHali());
	}
	
	@Test
	public void testDemirHalleriKaynamaNoktasi() {
		//setup, execute
		Demir demir=new Demir(10, 2750);
		//assert
		assertEquals("Kaynama Noktasý", demir.getMaddeninHali());
	}
	
	@Test
	public void testDemirHalleriKati() {
		//setup, execute
		Demir demir=new Demir(10, 1537);
		//assert
		assertEquals("Katý", demir.getMaddeninHali());
	}
	
	@Test
	public void testDemirHalleriSývý() {
		//setup, execute
		Demir demir=new Demir(10, 1999);
		//assert
		assertEquals("Sývý", demir.getMaddeninHali());
	}
	
	@Test
	public void testDemirHalleriGaz() {
		//setup, execute
		Demir demir=new Demir(10, 2751);
		//assert
		assertEquals("Gaz", demir.getMaddeninHali());
	}


}
