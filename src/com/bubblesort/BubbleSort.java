package com.bubblesort;
//Using Bubble sort to sort an array

public class BubbleSort {
    public static void bubbleSort(int[] array) {
        int n = array.length;

        //This loop controls the number of passes needed to sort the entire array.
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {

                    // swap array[j] and array[j+1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        //printing the element at the end of inner for loop
        for (int key : array){
            System.out.print(key + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Original array: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("\nSorted array: ");

        //Invoking the array
        bubbleSort(array);
    }
}

