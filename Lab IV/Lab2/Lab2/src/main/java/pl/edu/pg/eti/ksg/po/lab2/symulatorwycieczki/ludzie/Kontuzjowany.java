package pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.ludzie;

import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.Atrakcja;
import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.Wedrowka;
import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.gory.Bagno;


public class Kontuzjowany extends Czlowiek{
    public Kontuzjowany(String imie, String nazwisko, Plec plec) {
        super(imie, nazwisko, plec, 1.5);
    }
    protected Kontuzjowany(String imie, String nazwisko, Plec plec, double maksymalnaPredkosc) {
        super(imie, nazwisko, plec, maksymalnaPredkosc);
    }

    protected Kontuzjowany(String imie, String nazwisko, Plec plec, double maksymalnaPredkosc, double czasPelnejRegeneracji, double czasPelnegoZmeczenia) {
        super(imie, nazwisko, plec, maksymalnaPredkosc, czasPelnejRegeneracji, czasPelnegoZmeczenia);
    }

    @Override
    public int getUmiejetnosciNawigacyjne() {
        return 1;
    }

    @Override
    public void reagujNaWedrowke(Wedrowka w, double czas) {
        if (w instanceof Bagno) {
            super.reagujNaWedrowke(w, 4 * czas);
        } else {
            super.reagujNaWedrowke(w, 1.5 * czas);
        }
    }

    @Override
    public void reagujNaAtrakcje(Atrakcja a, double czas) {
      super.reagujNaAtrakcje(a, 1.5 * czas);
    }

}
