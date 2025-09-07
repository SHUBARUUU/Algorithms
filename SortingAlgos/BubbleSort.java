package SortingAlgos;

public class BubbleSort {
    //  Bubble Sort - is a sorting algorithm compares and swaps the values of next to each other, as its concept.
    public static void main(String[] args) {
        int[] arr = new int[]{6, 4, 1, 2, 5, 3};


        while (true) {
            boolean hasMove = true;
            int elementHolder;

            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    elementHolder = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = elementHolder;
                    hasMove = false;
                }

            }

            if (hasMove) {
                break;
            }
        }
        for (int displayArr : arr) {
            System.out.print(displayArr + " ");
        }


    }//end of main

}//end of class
