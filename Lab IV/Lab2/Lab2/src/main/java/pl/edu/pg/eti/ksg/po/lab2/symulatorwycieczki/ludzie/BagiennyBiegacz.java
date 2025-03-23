package pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.ludzie;

import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.Atrakcja;
import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.Wedrowka;
import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.gory.Bagno;
import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.gory.eti.LegowiskoGabrysia;


public class BagiennyBiegacz extends Czlowiek{
    public BagiennyBiegacz(String imie, String nazwisko, Plec plec) {
        super(imie, nazwisko, plec, 5);
    }
    protected BagiennyBiegacz(String imie, String nazwisko, Plec plec, double maksymalnaPredkosc) {
        super(imie, nazwisko, plec, maksymalnaPredkosc);
    }

    protected BagiennyBiegacz(String imie, String nazwisko, Plec plec, double maksymalnaPredkosc, double czasPelnejRegeneracji, double czasPelnegoZmeczenia) {
        super(imie, nazwisko, plec, maksymalnaPredkosc, czasPelnejRegeneracji, czasPelnegoZmeczenia);
    }

    @Override
    public int getUmiejetnosciNawigacyjne() {
        return 5;
    }

    @Override
    public void reagujNaWedrowke(Wedrowka w, double czas) {
        if (w instanceof Bagno) {
            super.reagujNaWedrowke(w, 0.5 * czas);
        } else {
            super.reagujNaWedrowke(w, czas);
        }
    }

    @Override
    public void reagujNaAtrakcje(Atrakcja a, double czas) {
        if (a instanceof LegowiskoGabrysia) {
            super.reagujNaAtrakcje(a, 1.5 * czas);
        }
    }

}
