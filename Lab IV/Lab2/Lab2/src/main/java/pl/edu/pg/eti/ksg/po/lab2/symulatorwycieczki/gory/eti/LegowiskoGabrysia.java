package pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.gory.eti;

import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.Atrakcja;

public class LegowiskoGabrysia extends Atrakcja {
    private final String miejscowosc;
    public LegowiskoGabrysia(String miejscowosc) {
        super(0.5);
        this.miejscowosc = miejscowosc;
    }

    public String getMiejscowosc() {
        return miejscowosc;
    }

    @Override
    public String getNazwa() {
        return "Legowisko Gabrysia";
    }
}
