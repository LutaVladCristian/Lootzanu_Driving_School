package LutzanooDrivingSchool;

public class RezultatExamen {
	protected String calificativ;
	protected String punctajSala;
	protected String punctajTraseu;

	public RezultatExamen(String calificativ, String punctajSala, String punctajTraseu) {
		this.calificativ = calificativ;
		this.punctajSala = punctajSala;
		this.punctajTraseu = punctajTraseu;
	}

	public void afisare(){
		System.out.println("Calificativ: " + this.calificativ);
		System.out.println("Punctaj sala: " + this.punctajSala);
		System.out.println("Punctaj traseu: " + this.punctajTraseu);
	}
}
