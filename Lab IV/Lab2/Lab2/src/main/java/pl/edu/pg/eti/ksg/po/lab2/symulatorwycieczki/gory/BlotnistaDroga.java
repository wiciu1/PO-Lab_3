package pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.gory;
import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.Wedrowka;

public class BlotnistaDroga extends Wedrowka {

    public BlotnistaDroga(double odleglosc) { super(odleglosc); }

    @Override
    public double modyfikujPredkoscGrupy(double predkosc) {
        return 0.7*predkosc;
    }

    @Override
    public int getTrudnoscNawigacyjna() {
        return 3;
    }

    @Override
    public String getNazwa() {
        return "Błotnista Droga";
    }
}

