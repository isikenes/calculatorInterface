public class SinFunction implements SingleArgMathFunction {

    String name = "Sin";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double calculate(double d) {
        return Math.sin(Math.toRadians(d));
    }
}
