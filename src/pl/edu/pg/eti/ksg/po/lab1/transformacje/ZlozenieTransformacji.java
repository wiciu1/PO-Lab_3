package pl.edu.pg.eti.ksg.po.lab1.transformacje;

import java.util.Arrays;

public class ZlozenieTransformacji implements Transformacja {
    private final Transformacja[] transformacje;

    public ZlozenieTransformacji(Transformacja[] transformacje) {
        this.transformacje = transformacje;
    }

    @Override
    public Punkt transformuj(Punkt p) {
        Punkt res = p;
        for(Transformacja t : transformacje) {
            res = t.transformuj(res);
        }
        return res;
    }

    @Override
    public Transformacja getTransformacjaOdwrotna() throws BrakTransformacjiOdwrotnejException {
        Transformacja[] rev = new Transformacja[transformacje.length];
        for(int i = 0; i < transformacje.length; i++) {
            rev[i] = transformacje[transformacje.length - i - 1].getTransformacjaOdwrotna();
        }
        return new ZlozenieTransformacji(rev);
    }

    @Override
    public String toString() {
        String[] res = new String[transformacje.length];
        for(int i = 0; i < transformacje.length; i++) {
            res[i] = transformacje[i].toString();
        }
        return "Zlozenie transformacji: " + String.join(", ", res);
    }
}
