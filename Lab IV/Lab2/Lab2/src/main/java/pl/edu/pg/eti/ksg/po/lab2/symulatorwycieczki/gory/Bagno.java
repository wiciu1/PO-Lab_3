package pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.gory;
import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.Wedrowka;

public class Bagno extends Wedrowka {

    public Bagno(double odleglosc) { super(odleglosc); }

    @Override
    public double modyfikujPredkoscGrupy(double predkosc) {
        return 0.3*predkosc;
    }

    @Override
    public int getTrudnoscNawigacyjna() {
        return 4;
    }

    @Override
    public String getNazwa() {
        return "yyy bagno tego";
    }
}
