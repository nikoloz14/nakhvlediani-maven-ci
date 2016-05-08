/**
 * Created by Nikoloz on 05/08/16.
 */
public class Arithmetics {
    AdvancedCalculator calc;

    public Arithmetics(AdvancedCalculator calc) {
        this.calc = calc;
    }

    public int add(int first, int second) {
        return first + second;
    }

    public int subtract(int first, int second) {
        return first - second;
    }

    public int multiply(int first, int second) {
        return first * second;
    }

    public int divide(int first, int second) {
        return first / second;
    }

    public int remainder(int first, int second) {
        return calc.remainder(first, second);
    }
}
