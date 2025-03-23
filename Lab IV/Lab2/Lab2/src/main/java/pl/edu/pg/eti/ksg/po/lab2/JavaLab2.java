package pl.edu.pg.eti.ksg.po.lab2;

import java.util.HashSet;
import java.util.Set;

import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.*;
import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.gory.*;
import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.gory.eti.Akademik;
import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.gory.eti.Kampus;
import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.gory.eti.LegowiskoGabrysia;
import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.ludzie.*;
import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.gory.beskidy.DrewnianaCerkiew;
public class JavaLab2 {
    public static void main(String[] args) {
        Wycieczka w = naETI();
        
//        PrzewodnikStudencki przewodnik = new PrzewodnikStudencki("Stefan", "Długonogi", Czlowiek.Plec.MEZCZYZNA);
//        Set<Uczestnik> uczestnicy = new HashSet<>();
//        uczestnicy.add(new Student("Alojzy", "Mechanik", Czlowiek.Plec.MEZCZYZNA));
//        uczestnicy.add(new Student("Ada", "Lovelace", Czlowiek.Plec.KOBIETA));
//        uczestnicy.add(new Student("Jan", "Elektronik", Czlowiek.Plec.MEZCZYZNA));
//        uczestnicy.add(new StudentKSG("Piotr","Teledetekcyjny", Czlowiek.Plec.MEZCZYZNA));

        PrzewodnikStudencki przewodnik2 = new PrzewodnikStudencki("Przewodnik", "Jacek", Czlowiek.Plec.MEZCZYZNA);
        Set<Uczestnik> uczestnicy2 = new HashSet<>();
        uczestnicy2.add(new Gabrys(15));
        uczestnicy2.add(new Informatyk("Jacek", "Placek", Czlowiek.Plec.MEZCZYZNA));
        uczestnicy2.add(new BagiennyBiegacz("Piotrek", "Placek", Czlowiek.Plec.KOBIETA));
        uczestnicy2.add(new Kontuzjowany("Joanna", "Placek", Czlowiek.Plec.KOBIETA));

        Grupa g2 = new Grupa(przewodnik2, uczestnicy2);
        SymulatorWycieczki symulator2 = new SymulatorWycieczki(g2, w);
        symulator2.dodajSluchaczPostepow((ElementWycieczki elementWycieczki, int lp, int liczbaElementow) -> System.out.println("POSTĘP: "
                + ((double) ((lp + 1) * 100 / liczbaElementow)) + "% / 100%" ));
        symulator2.symuluj();


//        Grupa g = new Grupa(przewodnik, uczestnicy);
//        SymulatorWycieczki symulator = new SymulatorWycieczki(g, w);
//        symulator.symuluj();
    }
    

    public static Wycieczka doDydiowki() {
        Wycieczka ret = new Wycieczka("Do Dydiówki");
        ret.dodajElementWycieczki(new Droga(1.0));
        ret.dodajElementWycieczki(new DrewnianaCerkiew("Smolnik"));
        ret.dodajElementWycieczki(new Droga(4.0));
//        ret.dodajElementWycieczki(new PrzeprawaPrzezRzeke(1.0));
//        ret.dodajElementWycieczki(new GestyLas(2.0));
        ret.dodajElementWycieczki(new Las(2.0));
        ret.dodajElementWycieczki(new Droga(5.0));
        
        return ret;
    }

    public static Wycieczka naETI() {
        Wycieczka ret = new Wycieczka("Na ETI");
        ret.dodajElementWycieczki(new Droga(4)); // W1
        ret.dodajElementWycieczki(new Bagno(4)); // W2
        ret.dodajElementWycieczki(new Akademik("Gdańsk")); // A1
        ret.dodajElementWycieczki(new Las(2)); // W3
        ret.dodajElementWycieczki(new BlotnistaDroga(3)); // W4
        ret.dodajElementWycieczki(new Tory(0.5)); // W5
        ret.dodajElementWycieczki(new Kampus(3)); // W6
        ret.dodajElementWycieczki(new LegowiskoGabrysia("Gdańsk")); // A2

        return ret;
    }
   
}
