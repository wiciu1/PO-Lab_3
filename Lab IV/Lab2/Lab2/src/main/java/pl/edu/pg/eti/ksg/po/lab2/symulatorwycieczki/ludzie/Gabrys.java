package pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.ludzie;

import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.*;
import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.gory.Bagno;

public class Gabrys implements Uczestnik {
    private final String imie;
    private final double maksymalnaPredkosc;
    private final double czasPelnejRegeneracji;
    private final double czasPelnegoZmeczenia;
    private double poziomZmeczenia;

    public Gabrys(double maksymalnaPredkosc) {
        this.imie = "Gabrys";
        this.maksymalnaPredkosc = maksymalnaPredkosc;
        this.czasPelnejRegeneracji = 15.0;
        this.czasPelnegoZmeczenia = 10.0;
    }

    public Gabrys(String imie, String nazwisko, Czlowiek.Plec plec, double maksymalnaPredkosc, double czasPelnejRegeneracji, double czasPelnegoZmeczenia) {
        this.imie = "Gabrys";
        this.maksymalnaPredkosc = maksymalnaPredkosc;
        this.czasPelnejRegeneracji = czasPelnejRegeneracji;
        this.czasPelnegoZmeczenia = czasPelnegoZmeczenia;
    }

    public String getImie() {
        return imie;
    }
    public double getCzasPelnejRegeneracji() {return czasPelnejRegeneracji;}
    public double getMaksymalnaPredkosc() { return maksymalnaPredkosc; }
    public double getCzasPelnegoZmeczenia() { return czasPelnegoZmeczenia; }
    @Override
    public double getPoziomZmeczenia() {
        return poziomZmeczenia;
    }

    @Override
    public void opiszWycieczke(Wycieczka wycieczka) {
        mow();
    }


    @Override
    public double getBazowaPredkosc() {
        double kondycja = Math.max(1 - poziomZmeczenia, 0);
        return kondycja * maksymalnaPredkosc;
    }

    @Override
    public int getUmiejetnosciNawigacyjne() {
        return 1;
    }

    protected void regeneruj(double czas) {
        double zregenerowano = czas/czasPelnejRegeneracji;
        poziomZmeczenia = Math.max(poziomZmeczenia - zregenerowano, 0);
        System.out.println("Poziom zmęczenia u "+imie+" zmalał o "+zregenerowano+" i wynosi "+ poziomZmeczenia +".");
    }


    protected void aktualizujZmeczenie(double czas) {
        double dodatkoweZmeczenie = czas/czasPelnegoZmeczenia;
        poziomZmeczenia = Math.min(poziomZmeczenia + dodatkoweZmeczenie, 1.0);
        System.out.println("Poziom zmęczenia u "+imie+" wzrósł o "+dodatkoweZmeczenie +" i wynosi "+ poziomZmeczenia+".");

    }

    protected void mow() {
        System.out.println(imie+" mówi: " + "Miau");
    }

    @Override
    public void reagujNaWedrowke(Wedrowka w, double czas) {
        aktualizujZmeczenie(czas);
        mow();
    }

    @Override
    public void reagujNaAtrakcje(Atrakcja a, double czas) {
        regeneruj(czas);
        mow();
    }

}


