package gno1.edu.ege.bilmuh.sofw_eng_maddehali.domain;

import static org.junit.Assert.*;

import org.junit.Test;

public class DeneySonucTest {

	@Test
	public void testDeneySonuc() {
		//setup
		SafSu safsu=new SafSu(10,100);
		EtilAlkol etalkol=new EtilAlkol(10, -118);
		Demir demir=new Demir(10, 2751);
		DeneySonuc dens=new DeneySonuc(safsu, etalkol, demir);
		//execute
		String bekle1=dens.getSafsu().getMaddeninHali();
		String bekle2=dens.getEtilalkol().getMaddeninHali();
		String bekle3=dens.getDemir().getMaddeninHali();
		//assert
		assertEquals("Kaynama Noktasý", bekle1);
		assertEquals("Katý", bekle2);
		assertEquals("Gaz", bekle3);
	}

}
