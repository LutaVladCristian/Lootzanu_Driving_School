package LutzanooDrivingSchool;

import java.util.Objects;
import java.util.Scanner;

public class Orar{
	protected String[] ore;
	protected String[] date;
	public Elev[] elevi;
	public Instructor[] instructori;

	public Orar(String[] ora, String[] data, Elev[] elevi, Instructor[] instructori) {
		this.ore = ora;
		this.date = data;
		this.elevi = elevi;
		this.instructori = instructori;
	}

	public void addNewDate(String data){
		String[] newDate = new String[this.date.length + 1];
		for(int i = 0; i < this.date.length; i++)
			newDate[i] = this.date[i];
		newDate[this.date.length] = data;
		this.date = newDate;;
	}

	public void addNewOra(String ora){
		String[] newOra = new String[this.ore.length + 1];
		for(int i = 0; i < this.ore.length; i++)
			newOra[i] = this.ore[i];
		newOra[this.ore.length] = ora;
		this.ore = newOra;
	}

	public void addNewInstructor(Instructor instructor){
		Instructor[] newInstructori = new Instructor[this.instructori.length + 1];
		for(int i = 0; i < this.instructori.length; i++)
			newInstructori[i] = this.instructori[i];
		newInstructori[this.instructori.length] = instructor;
		this.instructori = newInstructori;
	}

	public void addNewElev(Elev elev){
		Elev[] newElevi = new Elev[this.elevi.length + 1];
		for(int i = 0; i < this.elevi.length; i++)
			newElevi[i] = this.elevi[i];
		newElevi[this.elevi.length] = elev;
		this.elevi = newElevi;
	}

	public void afisare(int poz){
		System.out.println("Ora: " + this.ore[poz]);
		System.out.println("Data: " + this.date[poz]);
		this.elevi[poz].afisare();
		this.instructori[poz].afisare();
		System.out.println("=============================");
		System.out.println("");
	}

	public void displayTimeTable(){
		for(int i = 0; i < this.ore.length; i++){
			this.afisare(i);
		}
	}

	public void addClass(String nume_elev, String prenume_elev){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Data la care se va tine intalnirea: ");
		String data = scanner.nextLine();
		System.out.print("Ora la care se va tine intalnirea: ");
		String ora = scanner.nextLine();

		this.addNewDate(data);
		this.addNewOra(ora);

		for(int i = 0; i < this.elevi.length; i++){
			if(Objects.equals(this.elevi[i].nume, nume_elev) && Objects.equals(this.elevi[i].prenume, prenume_elev)){
				addNewElev(this.elevi[i]);
				addNewInstructor(this.instructori[i]);
				break;
			}
		}

		System.out.println("O programare noua a fost finalizata cu succes!");
		this.afisare(this.date.length - 1);
	}

	public Elev getElev(int poz) {
		return this.elevi[poz];
	}

	public Instructor getInstructor(int poz) {
		return this.instructori[poz];
	}

	public String getData(int poz) {
		return this.date[poz];
	}

	public String getOra(int poz) {
		return this.ore[poz];
	}

	public int getEleviLength() {
		return this.elevi.length;
	}

	public int getInstructoriLength() {
		return this.instructori.length;
	}

	public int getOreLength() {
		return this.ore.length;
	}

	public int getDateLength() {
		return this.date.length;
	}

}
