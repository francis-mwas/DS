package com.fram.ds;

public class SelectionSort {
    public static void main(String [] args){


        int [] inputArray = {20, 35, -15, 7, 55, 1, -22};

        for(int lastUnsortedItem = inputArray.length - 1; lastUnsortedItem > 0; lastUnsortedItem--){
            int largest = 0;

            for(int i = 0; i <= lastUnsortedItem; i++){
                if(inputArray[i] > inputArray[largest]){
                    largest = i;
                }
                swap(inputArray, largest, lastUnsortedItem);
            }
        }


        for(int num: inputArray){
            System.out.println("The sorted array is: "+num);
        }
    }

    public static void swap(int[] intArray, int i, int j){
        if(i == j) return;

        int temp = intArray[i];
        intArray[i] = intArray[j];
        intArray[j]= temp;
    }


}
