public class DivideFunction implements DoubleArgMathFunction {

    String name = "Divide";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double calculate(double d1, double d2) {
        return d1 / d2;
    }
}
