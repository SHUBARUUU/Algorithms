public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 3, 5, 7, 1, 2, 8, 6};

        for (int displayUnsorted : arr) {
            System.out.print(displayUnsorted + " ");
        }

        for (int i = 0; i < arr.length - 1; i++) {
            int currentMin = i;
            int temp = 0;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[currentMin]) {
                    currentMin = j;
                }
            }

            temp = arr[currentMin];
            arr[currentMin] = arr[i];
            arr[i] = temp;

        }
        System.out.println();//Spacing

        for (int displaySorted : arr) {
            System.out.print(displaySorted + " ");
        }


    }//end of main

}//end of class
