package test;

import LutzanooDrivingSchool.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrivingSchoolTest {

    @Test
    public void shouldAddElev() {
        RezultatExamen[] rezultate = new RezultatExamen[3];
        rezultate[0] = new RezultatExamen("Respins", "19", "-");
        rezultate[1] = new RezultatExamen("Respins", "25", "25");
        rezultate[2] = new RezultatExamen("Admis", "25", "0");

        OfertaCurs[] oferte = new OfertaCurs[4];
        oferte[0] = new OfertaCurs("A", 1000);
        oferte[1] = new OfertaCurs("B", 1500);
        oferte[2] = new OfertaCurs("C", 2000);
        oferte[3] = new OfertaCurs("D", 2500);

        Vehicul[] vehicule = new Vehicul[3];
        vehicule[0] = new Vehicul("B-01-ABC", "Dacia", "Logan", 1.6, 150, "2015");
        vehicule[1] = new Vehicul("B-02-SRC", "BMW", "E95", 3.0, 350, "2010");
        vehicule[2] = new Vehicul("B-03-ABC", "Mercedes", "CLA AMG", 2.5, 300, "2016");

        Instructor[] instructori = new Instructor[3];
        instructori[0] = new Instructor("Prof1", "Razvan", "12.12.1999", "Str. Mihai Eminescu, nr. 1", "0740123456", "rzv@gmail.com", vehicule[2]);
        instructori[1] = new Instructor("Prof2", "Ion", "12.12.2000", "Str. Mihai Eminescu, nr. 1", "0740123456", "cine_stie@yahoo.com", vehicule[1]);
        instructori[2] = new Instructor("Prof3", "Mihai", "12.12.2001", "Str. Mihai Eminescu, nr. 1", "0740123456", "rzv@gmail.com", vehicule[0]);

        Elev[] elevi = new Elev[3];
        elevi[0] = new Elev("Lutzan", "Andrei", "12.12.1999", "Str. Mihai Eminescu, nr. 1", "0740123456", "ltx@yahoo.com", oferte[0]);
        elevi[0].addRezultat(rezultate[2]);
        elevi[1] = new Elev("Popescu", "Ion", "12.12.2000", "Str. Mihai Eminescu, nr. 1", "0740123456", "rzv@gmail.com", oferte[1]);
        elevi[1].addRezultat(rezultate[0]);
        elevi[2] = new Elev("Ionescu", "Mihai", "12.12.2001", "Str. Mihai Eminescu, nr. 1", "0740123456", "cine_stie@yahoo.com", oferte[2]);
        elevi[2].addRezultat(rezultate[1]);

        String[] date = new String[3];
        date[0] = "12.12.2019";
        date[1] = "13.12.2019";
        date[2] = "14.12.2019";

        String[] ore = new String[3];
        ore[0] = "12:00";
        ore[1] = "13:00";
        ore[2] = "14:00";

        Orar orar = new Orar(ore, date, elevi, instructori);

        Elev elev = new Elev("Lutzan", "Andrei", "12.12.1999", "Str. Mihai Eminescu, nr. 1", "0740123456", "alabama@gmail.com", oferte[0]);

        orar.addNewElev(elev);

        assertEquals("Lutzan Andrei", orar.getElev(orar.getEleviLength() - 1).getNume());
    }

    @Test
    public void shouldAddClass() {
        RezultatExamen[] rezultate = new RezultatExamen[3];
        rezultate[0] = new RezultatExamen("Respins", "19", "-");
        rezultate[1] = new RezultatExamen("Respins", "25", "25");
        rezultate[2] = new RezultatExamen("Admis", "25", "0");

        OfertaCurs[] oferte = new OfertaCurs[4];
        oferte[0] = new OfertaCurs("A", 1000);
        oferte[1] = new OfertaCurs("B", 1500);
        oferte[2] = new OfertaCurs("C", 2000);
        oferte[3] = new OfertaCurs("D", 2500);

        Vehicul[] vehicule = new Vehicul[3];
        vehicule[0] = new Vehicul("B-01-ABC", "Dacia", "Logan", 1.6, 150, "2015");
        vehicule[1] = new Vehicul("B-02-SRC", "BMW", "E95", 3.0, 350, "2010");
        vehicule[2] = new Vehicul("B-03-ABC", "Mercedes", "CLA AMG", 2.5, 300, "2016");

        Instructor[] instructori = new Instructor[3];
        instructori[0] = new Instructor("Prof1", "Razvan", "12.12.1999", "Str. Mihai Eminescu, nr. 1", "0740123456", "rzv@gmail.com", vehicule[2]);
        instructori[1] = new Instructor("Prof2", "Ion", "12.12.2000", "Str. Mihai Eminescu, nr. 1", "0740123456", "cine_stie@yahoo.com", vehicule[1]);
        instructori[2] = new Instructor("Prof3", "Mihai", "12.12.2001", "Str. Mihai Eminescu, nr. 1", "0740123456", "rzv@gmail.com", vehicule[0]);

        Elev[] elevi = new Elev[3];
        elevi[0] = new Elev("Lutzan", "Andrei", "12.12.1999", "Str. Mihai Eminescu, nr. 1", "0740123456", "ltx@yahoo.com", oferte[0]);
        elevi[0].addRezultat(rezultate[2]);
        elevi[1] = new Elev("Popescu", "Ion", "12.12.2000", "Str. Mihai Eminescu, nr. 1", "0740123456", "rzv@gmail.com", oferte[1]);
        elevi[1].addRezultat(rezultate[0]);
        elevi[2] = new Elev("Ionescu", "Mihai", "12.12.2001", "Str. Mihai Eminescu, nr. 1", "0740123456", "cine_stie@yahoo.com", oferte[2]);
        elevi[2].addRezultat(rezultate[1]);

        String[] date = new String[3];
        date[0] = "12.12.2019";
        date[1] = "13.12.2019";
        date[2] = "14.12.2019";

        String[] ore = new String[3];
        ore[0] = "12:00";
        ore[1] = "13:00";
        ore[2] = "14:00";

        Orar orar = new Orar(ore, date, elevi, instructori);

        orar.addClass("Lutzan", "Andrei");

        assertEquals("Lutzan Andrei", orar.getElev(orar.getEleviLength() - 1).getNume());
        assertEquals(instructori[0].getNume(), orar.getInstructor(orar.getInstructoriLength() - 1).getNume());
        assertEquals("test data", orar.getData(orar.getDateLength() - 1));
        assertEquals("test ora", orar.getOra(orar.getOreLength() - 1));
    }
}
