package LutzanooDrivingSchool;

public class OfertaCurs {
	protected String categoria;
	protected int pret;

	public OfertaCurs(String categoria, int pret) {
		this.categoria = categoria;
		this.pret = pret;
	}

	public String getCategorie() {
		return this.categoria;
	}

	public int getPret() {
		return this.pret;
	}

	public void afisare() {
		System.out.println("Categoria: " + this.categoria);
		System.out.println("Pret: " + this.pret);
	}
}
