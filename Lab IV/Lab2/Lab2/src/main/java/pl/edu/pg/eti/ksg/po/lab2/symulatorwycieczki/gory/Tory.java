package pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.gory;
import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.Wedrowka;

public class Tory extends Wedrowka {

    public Tory(double odleglosc) { super(odleglosc); }

    @Override
    public double modyfikujPredkoscGrupy(double predkosc) {
        return 0.9 * predkosc;
    }

    @Override
    public int getTrudnoscNawigacyjna() {
        return 2;
    }

    @Override
    public String getNazwa() {
        return "Tory";
    }
}

