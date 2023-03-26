public class MultiplyFunction implements DoubleArgMathFunction {

    String name = "Multiply";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double calculate(double d1, double d2) {
        return d1 * d2;
    }
}
