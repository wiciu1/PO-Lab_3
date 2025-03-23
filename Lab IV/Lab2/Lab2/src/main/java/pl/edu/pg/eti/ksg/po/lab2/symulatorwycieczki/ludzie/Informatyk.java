package pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.ludzie;

import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.Atrakcja;
import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.Wedrowka;
import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.gory.Bagno;
import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.gory.eti.Akademik;
import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.gory.eti.Kampus;

public class Informatyk extends Czlowiek{
    public Informatyk(String imie, String nazwisko, Plec plec) {
        super(imie, nazwisko, plec, 3.5);
    }
    protected Informatyk(String imie, String nazwisko, Plec plec, double maksymalnaPredkosc) {
        super(imie, nazwisko, plec, maksymalnaPredkosc);
    }

    protected Informatyk(String imie, String nazwisko, Plec plec, double maksymalnaPredkosc, double czasPelnejRegeneracji, double czasPelnegoZmeczenia) {
        super(imie, nazwisko, plec, maksymalnaPredkosc, czasPelnejRegeneracji, czasPelnegoZmeczenia);
    }

    @Override
    public int getUmiejetnosciNawigacyjne() {
        return 5;
    }

    @Override
    public void reagujNaWedrowke(Wedrowka w, double czas) {
        if (w instanceof Bagno) {
            super.reagujNaWedrowke(w, 2 * czas);
        } else {
            super.reagujNaWedrowke(w, czas);
        }
    }

    @Override
    public void reagujNaAtrakcje(Atrakcja a, double czas) {
        if (a instanceof Akademik) {
            super.reagujNaAtrakcje(a, 1.5 * czas);
        } else {
            super.reagujNaAtrakcje(a, czas);
        }
    }

}
