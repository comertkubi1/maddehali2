package gno1.edu.ege.bilmuh.sofw_eng_maddehali.domain;

import static org.junit.Assert.*;

import org.junit.Test;

public class EtilAlkolTest {

		@Test
		public void testEtilAlkolErimeDonmaNoktasi() {
			//setup, execute
			EtilAlkol etalkol=new EtilAlkol(10, -117);
			//assert
			assertEquals("Erime Donma Noktas�", etalkol.getMaddeninHali());
		}
		
		@Test
		public void testEtilAlkolHalleriKaynamaNoktasi() {
			//setup, execute
			EtilAlkol etalkol=new EtilAlkol(10, 78);
			//assert
			assertEquals("Kaynama Noktas�", etalkol.getMaddeninHali());
		}
		
		@Test
		public void testEtilAlkolHalleriKati() {
			//setup, execute
			EtilAlkol etalkol=new EtilAlkol(10, -118);
			//assert
			assertEquals("Kat�", etalkol.getMaddeninHali());
		}
		
		@Test
		public void testEtilAlkolHalleriS�v�() {
			//setup, execute
			EtilAlkol etalkol=new EtilAlkol(10, 50);
			//assert
			assertEquals("S�v�", etalkol.getMaddeninHali());
		}
		
		@Test
		public void testEtilAlkolHalleriGaz() {
			//setup, execute
			EtilAlkol etalkol=new EtilAlkol(10, 79);
			//assert
			assertEquals("Gaz", etalkol.getMaddeninHali());
		}


}
