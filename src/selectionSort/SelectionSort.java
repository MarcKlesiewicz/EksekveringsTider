package selectionSort;



import bubbleSort.MyTimer;

import java.util.Date;

public class SelectionSort {

    public static void main(String[] args) {

        SelectionSort newArray = new SelectionSort();

        long startTime = bubbleSort.MyTimer.currentTimestamp();

        Date date=new Date(startTime);
        System.out.println("Time is " + date.toString() + " (" + date.getTime() + ")\n");
        System.out.println("Calculation starting.");

        newArray.selectionSort();
        newArray.printArray();

        long endTime = bubbleSort.MyTimer.currentTimestamp();
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

    /* Selection sort metode : der sorterer array fra lille til stor value
    ved at finde det laveste tal i theArray og placere det i det første index
     */

    public void selectionSort() {

        for (int i = 0; i < (arraySize - 1); i++) {

            int currentMin = theArray[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < arraySize; j++) {
                if (currentMin > theArray[j]) {
                    currentMin = theArray[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != 1) {
                theArray[currentMinIndex] = theArray[i];
                theArray[i] = currentMin;
            }

        }

    }
}
