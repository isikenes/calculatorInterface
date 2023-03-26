public class Test {

    public static void main(String[] args) {
        CasioCalculator calculator = new CasioCalculator();

        calculator.addFunction(new SinFunction());
        calculator.addFunction(new CosFunction());
        calculator.addFunction(new LogFunction());
        calculator.addFunction(new SquaredFunction());
        calculator.addFunction(new AddFunction());
        calculator.addFunction(new SubtractFunction());
        calculator.addFunction(new MultiplyFunction());
        calculator.addFunction(new DivideFunction());

        calculator.listMathFunction();

        System.out.println();
        System.out.println("sin90=" + calculator.doCalculation("sin", 90));
        System.out.println("cos180=" + calculator.doCalculation("cos", 180));
        System.out.println("log100=" + calculator.doCalculation("log", 100));
        System.out.println("√64=" + calculator.doCalculation("sqrt", 64));
        System.out.println("2+3=" + calculator.doCalculation("add", 2, 3));
        System.out.println("7-3=" + calculator.doCalculation("subtract", 7, 3));
        System.out.println("3*4=" + calculator.doCalculation("multiply", 3, 4));
        System.out.println("12/4=" + calculator.doCalculation("divide", 12, 4));
    }
}
