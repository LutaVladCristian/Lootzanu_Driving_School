package LutzanooDrivingSchool;

public class Vehicul {
	protected String nrInmatriculare;
	protected String marca;
	protected String model;
	protected double capacitateMotor;
	protected int putereMotor;
	protected String anFabricatie;

	public Vehicul(String nrInmatriculare, String marca, String model, double capacitateMotor, int putereMotor, String anFabricatie) {
		this.nrInmatriculare = nrInmatriculare;
		this.marca = marca;
		this.model = model;
		this.capacitateMotor = capacitateMotor;
		this.putereMotor = putereMotor;
		this.anFabricatie = anFabricatie;
	}

	public void afisare(){
		System.out.println("Nr inmatriculare: " + this.nrInmatriculare);
		System.out.println("Marca: " + this.marca);
		System.out.println("Model: " + this.model);
		System.out.println("Capacitate motor: " + this.capacitateMotor);
		System.out.println("Putere motor: " + this.putereMotor);
		System.out.println("An fabricatie: " + this.anFabricatie);
	}
}
