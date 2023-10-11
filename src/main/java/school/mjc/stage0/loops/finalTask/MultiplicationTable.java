package school.mjc.stage0.loops.finalTask;

public class MultiplicationTable {
    public void printTable(int numberTableToPrint){
        if (numberTableToPrint <= 0) {
            System.out.println("Input must be a positive integer.");
            return;
        } else {

        System.out.println("Multiplication table for " + numberTableToPrint + ":");

        for (int i = 1; i <= 10; i++) {
            System.out.println(numberTableToPrint + " x " + i + " = " + (numberTableToPrint * i));
        }
    }
    }
}
