import java.util.ArrayList;

public class CasioCalculator implements Calculator {

    ArrayList<MathFunction> list = new ArrayList<>();

    @Override
    public void addFunction(MathFunction mf) {
        list.add(mf);
    }

    @Override
    public void listMathFunction() {
        for (MathFunction mf : list) {
            System.out.println(mf.getName());
        }
    }

    @Override
    public double doCalculation(String s, double d) {
        for (MathFunction mf : list) {
            if (mf.getName().equalsIgnoreCase(s)) {
                return ((SingleArgMathFunction) mf).calculate(d);
            }
        }
        throw new IllegalArgumentException("Math function can't be found!");
    }

    @Override
    public double doCalculation(String s, double d1, double d2) {
        for (MathFunction mf : list) {
            if (mf.getName().equalsIgnoreCase(s)) {
                return ((DoubleArgMathFunction) mf).calculate(d1, d2);
            }
        }
        throw new IllegalArgumentException("Math function can't be found!");
    }
}
