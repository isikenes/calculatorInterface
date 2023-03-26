public class LogFunction implements SingleArgMathFunction {

    String name = "Log";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double calculate(double d) {
        return Math.log10(d);
    }


}
