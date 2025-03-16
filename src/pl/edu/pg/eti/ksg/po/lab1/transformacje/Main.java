package pl.edu.pg.eti.ksg.po.lab1.transformacje;
import pl.edu.pg.eti.ksg.po.lab1.transformacje.Translacja;
import pl.edu.pg.eti.ksg.po.lab1.transformacje.Skalowanie;
import pl.edu.pg.eti.ksg.po.lab1.transformacje.BrakTransformacjiOdwrotnejException;
import pl.edu.pg.eti.ksg.po.lab1.transformacje.Punkt;
import pl.edu.pg.eti.ksg.po.lab1.transformacje.Transformacja;

public class Main {

    public static void zad1(){
        Punkt b = new Punkt(2.5, 1.2);
        System.out.println("Pobieranie liczby:");
        System.out.println(b.getX());
        System.out.println("Drukowanie całego obiektu:");
        System.out.println(b);
        System.out.println("Drukowanie całego obiektu po ustawieniu liczby:");

        System.out.println(b);
        Punkt b1 = new Punkt(2.5, 1.2);
        System.out.println("Porównywanie referencji: b == b");
        System.out.println(b == b);
        System.out.println("Porównywanie referencji: b == b1");
        System.out.println(b == b1);
        System.out.println("Metoda equals: b.equals(b)");
        System.out.println(b.equals(b));
        System.out.println("Metoda equals: b.equals(b1)");
        System.out.println(b.equals(b1));
        System.out.println("Metoda hashCode: b.hashCode()");
        System.out.println(b.hashCode());
        System.out.println("Metoda hashCode: b1.hashCode()");
        System.out.println(b1.hashCode());
    }

    public static void zad2(){
        /*
         * Konstrukcja językowa try {} catch (...){} służy do
         * obsługi wyjątków. Kod w bloku try jest monitorowany
         * pod kątem wystąpienia wyjątku bądź wyjątków
         * wspomnianych na początku bloku/bloków catch.
         * Jeżeli gdzieś w bloku try wystąpi wyjątek, to sterowanie
         * zostanie natychmiast przeniesione do bloku catch.
         * Tam powinien znajdować się kod obsługujący wyjątek.
         * Może to być np. wypisanie stosu wywołań na wyjście błędów
         * lub zapisanie wyjątku w logach, lub wyrzucenie (zgłoszenie)
         * innego wyjątku lepiej opisującego sytuacje (można załączyć
         * wyjątek który zainicjował to zdarzenie patrz. Konstruktor
         * klasy java.lang.Exception)
         */
        try {
            Punkt p1 = Punkt.E_X;
            System.out.println(p1);
            Transformacja tr = new Translacja(5, 6);
            System.out.println(tr);
            Punkt p2 = tr.transformuj(p1);
            System.out.println(p2);
            Transformacja trr = tr.getTransformacjaOdwrotna();
            System.out.println(trr);
            Punkt p3 = trr.transformuj(p2);
            System.out.println(p3);

        } catch (BrakTransformacjiOdwrotnejException ex)
        {
            ex.printStackTrace();
        }
        System.out.println();
        try
        {
            Punkt p1 = new Punkt(2, 2);
            System.out.println(p1);
            Transformacja tr2 = new Skalowanie(5, 4);
            System.out.println(tr2);
            Punkt p2 = tr2.transformuj(p1);
            System.out.println(p2);
            Transformacja trr2 = tr2.getTransformacjaOdwrotna();
            System.out.println(trr2);
            Punkt p3 = trr2.transformuj(p2);
            System.out.println(p3);
        }
        catch(BrakTransformacjiOdwrotnejException ex)
        {
            ex.printStackTrace();
        }
        System.out.println();
        try
        {
            Punkt p1 = new Punkt(2, 2);
            Transformacja tr2 = new Skalowanie(5, 0);
            System.out.println(tr2);
            System.out.println(p1);
            Punkt p2 = tr2.transformuj(p1);
            System.out.println(p2);
            Transformacja trr2 = tr2.getTransformacjaOdwrotna();
            System.out.println(trr2);
            Punkt p3 = trr2.transformuj(p2);
            System.out.println(p3);
        }
        catch(BrakTransformacjiOdwrotnejException ex)
        {
            ex.printStackTrace();
        }
        System.out.println();
    }

    public static void zad3(){
        try {
            Punkt p = new Punkt(1, 0);
            Transformacja obrot = new Obrot(90);
            System.out.println("Punkt przed obrotem: " + p);

            Punkt pPrim = obrot.transformuj(p);
            System.out.println("Punkt po obrocie: " + pPrim);

            Transformacja obrotOdwrotny = obrot.getTransformacjaOdwrotna();
            System.out.println("Transformacja odwrotna: " + obrotOdwrotny);

            Punkt pPowrotny = obrotOdwrotny.transformuj(pPrim);
            System.out.println("Punkt po transformacji odwrotnej: " + pPowrotny);
        } catch (BrakTransformacjiOdwrotnejException e) {
            e.printStackTrace();
        }
    }

    public static void zad4(){
        try {
            Transformacja skalowanie = new Skalowanie(2, 2);
            Transformacja translacja = new Translacja(3, 4);
            Transformacja skalowanie2 = new Skalowanie(0, 2);

            Transformacja[] transformacje = {skalowanie, translacja, skalowanie2};
            Transformacja zlozenie = new ZlozenieTransformacji(transformacje);

            Punkt p = new Punkt(1, 1);
            System.out.println("Punkt przed transformacjami: " + p);

            Punkt pPrim = zlozenie.transformuj(p);
            System.out.println("Punkt po transformacjach: " + pPrim);

            Transformacja zlozenieOdwrotne = zlozenie.getTransformacjaOdwrotna();
            System.out.println("Transformacja odwrotna:\n" + zlozenieOdwrotne);

            Punkt pPowrotny = zlozenieOdwrotne.transformuj(pPrim);
            System.out.println("Punkt po transformacji odwrotnej: " + pPowrotny);
        } catch (BrakTransformacjiOdwrotnejException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        zad4();
    }
}