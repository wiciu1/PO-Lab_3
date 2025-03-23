package pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki;

public class Atrakcja implements ElementWycieczki {
    private double time;
    protected Atrakcja(double time) {
        this.time = time;
    }

    public double getWymaganyCzas() {
        return time;
    }

    @Override
    public String getNazwa() {
        return "Atrakcja";
    }

}
