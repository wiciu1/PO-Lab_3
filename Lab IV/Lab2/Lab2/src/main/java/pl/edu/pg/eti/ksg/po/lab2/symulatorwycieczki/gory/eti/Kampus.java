package pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.gory.eti;
import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.Wedrowka;

public class Kampus extends Wedrowka {

    public Kampus(double odleglosc) { super(odleglosc); }

    @Override
    public double modyfikujPredkoscGrupy(double predkosc) {
        return predkosc;
    }

    @Override
    public int getTrudnoscNawigacyjna() {
        return 1;
    }

    @Override
    public String getNazwa() {
        return "Kampus PG";
    }
}

