package SortingAlgos;

public class InsertionSort {
//  Insertion Sort - is a sorting algorithm starts w the adjacent element having a temp container and putting it at their "position" once compared.
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4, 7, 5, 6};

        for (int i = 1; i < arr.length - 1; i++) {
            int tempElement = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > tempElement) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = tempElement;
        }

        for (int displayArr : arr)
            System.out.print(displayArr + " ");

    }//end of main

}//end of class
