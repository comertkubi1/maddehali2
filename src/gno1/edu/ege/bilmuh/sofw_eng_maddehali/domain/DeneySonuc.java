package gno1.edu.ege.bilmuh.sofw_eng_maddehali.domain;

public class DeneySonuc {
	private SafSu safsu;
	private EtilAlkol etilalkol;
	private Demir demir;

	public DeneySonuc(SafSu safsu, EtilAlkol etilalkol, Demir demir) {
		// TODO Auto-generated constructor stub
		this.safsu=safsu;
		this.etilalkol=etilalkol;
		this.demir=demir;
	}

	public SafSu getSafsu() {
		return safsu;
	}

	public EtilAlkol getEtilalkol() {
		return etilalkol;
	}

	public Demir getDemir() {
		return demir;
	}

}
