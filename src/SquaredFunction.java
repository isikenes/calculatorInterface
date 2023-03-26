public class SquaredFunction implements SingleArgMathFunction {

    String name = "Sqrt";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double calculate(double d) {
        return Math.sqrt(d);
    }
}
