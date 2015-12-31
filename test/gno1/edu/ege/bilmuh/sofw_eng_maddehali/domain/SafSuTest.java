package gno1.edu.ege.bilmuh.sofw_eng_maddehali.domain;

import static org.junit.Assert.*;

import org.junit.Test;

public class SafSuTest {
	SafSu safsu1;
	public SafSu createSafSu() {
		return new SafSu(20,0);
	}

	@Test
	public void testSafSuHalleriErimeDonmaNoktasi() {
		//setup, execute
		safsu1=createSafSu();
		//assert
		assertEquals("Erime Donma Noktasý", safsu1.getMaddeninHali());
	}
	
	@Test
	public void testSafSuHalleriKaynamaNoktasi() {
		//setup, execute
		SafSu safsu=new SafSu(10,100);
		//assert
		assertEquals("Kaynama Noktasý", safsu.getMaddeninHali());
	}
	
	@Test
	public void testSafSuHalleriKati() {
		//setup, execute
		SafSu safsu=new SafSu(10,-20);
		//assert
		assertEquals("Katý", safsu.getMaddeninHali());
	}
	
	@Test
	public void testSafSuHalleriSývý() {
		//setup, execute
		SafSu safsu=new SafSu(10,20);
		//assert
		assertEquals("Sývý", safsu.getMaddeninHali());
	}
	
	@Test
	public void testSafSuHalleriGaz() {
		//setup, execute
		SafSu safsu=new SafSu(10,101);
		//assert
		assertEquals("Gaz", safsu.getMaddeninHali());
	}

}
