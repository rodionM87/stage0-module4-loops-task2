package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int start = 0;
        int count = 0;
        if (start <= multiplyByAndToInclusive) {
            while(start <= multiplyByAndToInclusive) {
                System.out.println(start);
                start = start + multiplyByAndToInclusive;
                count++;
            }
        }
        else if (start >= multiplyByAndToInclusive) {
            while(start >= multiplyByAndToInclusive) {
                System.out.println(start);
                start = start + multiplyByAndToInclusive;
                count--;
            }
        }
    }
}
