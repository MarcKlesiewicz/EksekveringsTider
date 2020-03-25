package bubbleSort;


import java.util.Date;
import timer.MyTimer;

public class BubbleSort {

    public static void main(String[] args) {

        BubbleSort newArray = new BubbleSort();

        long startTime = MyTimer.currentTimestamp();

        Date date=new Date(startTime);
        System.out.println("Time is " + date.toString() + " (" + date.getTime() + ")\n");
        System.out.println("Calculation starting.");

        newArray.bubbleSort();
        newArray.printArray();

        long endTime = MyTimer.currentTimestamp();
        String resultat = MyTimer.timeElapsed(startTime, endTime) ;
        System.out.println();
        System.out.println(resultat);
    }


    private int[] theArray = {48,65,11,19,84,9,17,11,20,14,36,16,97,68,5,17,78,74,23,41};

    //Antallet af indexes i theArray
    private int arraySize = 20;

    
    // Printer Array i console
    public void printArray() {

        System.out.println("----------");

        for (int i = 0; i < arraySize; i++) {

            //index nummer
            System.out.print("| " + i + " | ");

            //value
            System.out.println(theArray[i] + " |");

            System.out.println("----------");

        }
    }


    // Bubble sort metode : sortere array fra lille til stor value

    public void bubbleSort() {

        int temp = 0;


        /*et nested for loop som sammenligner den første value med den næste value
        er den første value større end den næste bytter de plads.
        loopet starter forfra og tjekker næste value.
         */
        for (int i = 0; i < arraySize; i++) {

            for (int j = 1; j < (arraySize - i); j++) {

                if (theArray[j - 1] > theArray[j]) {

                    temp = theArray[j - 1];
                    theArray[j - 1] = theArray[j];
                    theArray[j] = temp;

                }

            }
        }
    }

}

