package LutzanooDrivingSchool;

public class Elev {
    protected String nume;
    protected String prenume;
    protected String dataNasterii;
    protected String adresa;
    protected String telefon;
    protected String email;
    protected RezultatExamen[] rezultate;
    protected OfertaCurs oferta;
    protected Boolean statusPlata;
    private static int index = 0;

    public Elev(String nume, String prenume, String dataNasterii, String adresa, String telefon, String email, OfertaCurs oferta) {
        this.nume = nume;
        this.prenume = prenume;
        this.dataNasterii = dataNasterii;
        this.adresa = adresa;
        this.telefon = telefon;
        this.email = email;
        this.rezultate = new RezultatExamen[5];
        this.oferta = oferta;
        this.statusPlata = false;
    }

    public void addRezultat(RezultatExamen rezultat){
        if (index < 5)
        {
            this.rezultate[index] = rezultat;
            index++;
        }
        else
            System.out.println("Numarul maxim de incercari a fost atins!");
    }

    public String getNume() {
        String numeComplet = this.nume + " " + this.prenume;
        return numeComplet;
    }

    public void setStatusPlata(){
        this.statusPlata = true;
    }

    public void afisare()
    {
        System.out.println("Nume & prenume: " + this.getNume());
        System.out.println("Data nasterii: " + this.dataNasterii);
        System.out.println("Adresa: " + this.adresa);
        System.out.println("Telefon: " + this.telefon);
        System.out.println("Email: " + this.email);
        this.oferta.afisare();
        if (this.statusPlata)
            System.out.println("Status plata: achitat");
        else
            System.out.println("Status plata: neachitat");
    }

}
