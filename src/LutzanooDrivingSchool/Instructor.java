package LutzanooDrivingSchool;

public class Instructor {
	protected String nume;
	protected String prenume;
	protected String dataNasterii;
	protected String adresa;
	protected String telefon;
	protected String email;
	public Vehicul vehicule;

	public Instructor(String nume, String prenume, String dataNasterii, String adresa, String telefon, String email, Vehicul vehicul) {
		this.nume = nume;
		this.prenume = prenume;
		this.dataNasterii = dataNasterii;
		this.adresa = adresa;
		this.telefon = telefon;
		this.email = email;
		this.vehicule = vehicul;
	}

	public void afisare(){
		System.out.println("Nume & prenume: " + this.nume + " " + this.prenume);
		System.out.println("Data nasterii: " + this.dataNasterii);
		System.out.println("Adresa: " + this.adresa);
		System.out.println("Telefon: " + this.telefon);
		System.out.println("Email: " + this.email);
		this.vehicule.afisare();
	}

	public String getNume() {
		String numeComplet = this.nume + " " + this.prenume;
		return numeComplet;
	}
}
