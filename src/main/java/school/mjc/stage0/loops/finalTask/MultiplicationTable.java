package school.mjc.stage0.loops.finalTask;

public class MultiplicationTable {
    public void printTable(int numberTableToPrint){
        if (numberTableToPrint < 0) {
            System.out.println("Input must be a positive integer.");
            return;
        } else {


        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + numberTableToPrint + " = " + (numberTableToPrint * i));
        }
    }
    }
}
