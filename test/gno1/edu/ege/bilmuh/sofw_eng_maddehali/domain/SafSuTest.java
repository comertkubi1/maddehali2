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
		assertEquals("Erime Donma Noktas�", safsu1.getMaddeninHali());
	}
	
	@Test
	public void testSafSuHalleriKaynamaNoktasi() {
		//setup, execute
		SafSu safsu=new SafSu(10,100);
		//assert
		assertEquals("Kaynama Noktas�", safsu.getMaddeninHali());
	}
	
	@Test
	public void testSafSuHalleriKati() {
		//setup, execute
		SafSu safsu=new SafSu(10,-20);
		//assert
		assertEquals("Kat�", safsu.getMaddeninHali());
	}
	
	@Test
	public void testSafSuHalleriS�v�() {
		//setup, execute
		SafSu safsu=new SafSu(10,20);
		//assert
		assertEquals("S�v�", safsu.getMaddeninHali());
	}
	
	@Test
	public void testSafSuHalleriGaz() {
		//setup, execute
		SafSu safsu=new SafSu(10,101);
		//assert
		assertEquals("Gaz", safsu.getMaddeninHali());
	}

}
