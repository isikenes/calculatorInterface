public class SubtractFunction implements DoubleArgMathFunction{

    String name="Subtract";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double calculate(double d1, double d2) {
        return d1-d2;
    }

}
