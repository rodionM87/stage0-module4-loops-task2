package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int start = 0;
        while(start <= printToInclusive) {
            if (start == 0) {
                start = start + 2;
                continue;
            }
            else if(start%start==0 && (start%2!=0 && start%3!=0 && start%5!=0) || (start==2) || (start==3) || (start==5)) {
                System.out.println(start);
            }
            start++;
        }
    }
}
