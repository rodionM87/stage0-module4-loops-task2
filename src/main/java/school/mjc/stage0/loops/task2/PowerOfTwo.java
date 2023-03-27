package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int count = 0;
        int mainVar = 1;
        switch ((power == 0)? 0: (power < 0)? 1:2) {
            case 0:
                System.out.println(1);
                break;
            case 1;
                System.out.println("too much power");
                break;
            case 2:
                while(start <= power) {
                    if (mainVar == 1) {
                        System.out.println(mainVar);
                        mainVar = mainVar + 1;
                        count++;
                        continue;
                    }
                    System.out.println(mainVar);
                    mainVar = mainVar * 2;
                    count++;                    
                }
                break;
        }
    }
}
