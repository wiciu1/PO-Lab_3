package pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.gory.eti;

import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.Atrakcja;

public class Akademik extends Atrakcja {
    private final String miejscowosc;
    public Akademik(String miejscowosc) {
        super(1);
        this.miejscowosc = miejscowosc;
    }

    public String getMiejscowosc() {
        return miejscowosc;
    }

    @Override
    public String getNazwa() {
        return "Dom Studencki 5";
    }

}
