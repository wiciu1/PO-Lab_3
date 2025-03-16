package pl.edu.pg.eti.ksg.po.lab1.transformacje;

public class Obrot implements Transformacja{
    private final double angle;

    public Obrot(double angle) {
        this.angle = Math.toRadians(angle);
    }

    public double getAngle() {
        return angle;
    }

    @Override
    public Punkt transformuj(Punkt p) {
        double x = p.getX();
        double y = p.getY();

        double xPrime = x * Math.cos(angle) - y * Math.sin(angle);
        double yPrime = x * Math.sin(angle) + y * Math.cos(angle);
        return new Punkt(xPrime, yPrime);
    }

    @Override
    public Transformacja getTransformacjaOdwrotna() throws BrakTransformacjiOdwrotnejException {
        return new Obrot(-Math.toDegrees(angle));
    }

    @Override
    public String toString() {
        return "Obrot o kat: " + Math.toDegrees(angle) + " stopni";
    }


}
