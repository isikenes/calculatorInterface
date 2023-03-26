public class CosFunction implements SingleArgMathFunction {

    String name = "Cos";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double calculate(double d) {
        return Math.cos(Math.toRadians(d));
    }
}
