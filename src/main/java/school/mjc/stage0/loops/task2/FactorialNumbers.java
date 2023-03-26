package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int start = 0;
        int factorial;
        int factorialAfter = 1;
        while(start < printToInclusive) {
            start++;
            factorial = factorialAfter * start;
            factorialAfter = factorial;
            System.out.println(factorial);
        }
    }
}
