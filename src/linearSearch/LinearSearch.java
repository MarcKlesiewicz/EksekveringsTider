package linearSearch;

import selectionSort.SelectionSort;
import timer.MyTimer;

import java.util.Date;
import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Indtast en value at søge efter imellem 1-100:");
        int num = input.nextInt();

        LinearSearch newArray = new LinearSearch();

        long startTime = MyTimer.currentTimestamp();

        Date date=new Date(startTime);
        System.out.println("Time is " + date.toString() + " (" + date.getTime() + ")\n");
        System.out.println("Calculation starting.");

        newArray.linearSearchForValue(num);
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


    /* Linear Search metode : søger kronologisk igennem array, et tal af gangen
    og retunere indexes som indeholder tallet */

    public String linearSearchForValue(int value){

        boolean valueInArray = false;

        String indexsWithValue = "";

        System.out.print("Din søgte value blev fundet i de følgende indexes: ");

        for(int i = 0; i < arraySize; i++){

            if(theArray[i] == value) {
                valueInArray = true;

                System.out.print(i + ", ");

                indexsWithValue+= i + " ";
            }
        }
        if(!valueInArray){
            indexsWithValue = "None";

            System.out.print(indexsWithValue);
        }

        return indexsWithValue;
    }
}


