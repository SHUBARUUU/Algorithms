package SortingAlgos;

public class MergeSort {
    //  Merge sort - is a sorting algorithm that uses recursion as backbone, and divide and conquer as its concept.
    public static void main(String[] args) {
//        Sample Arrays (Unsorted)
        int[] arr = new int[]{6, 4, 1, 2, 5, 3};
        //Length of our array is 6.

        mergeSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }//end of main

    private static void mergeSort(int[] arr) {
        // Sets variable for the length of the array we're going to sort out.
        //Length = 6 -- First calling of the mergeSort
        //Length = 3 -- Second calling of mergeSort (Left Arr)
        //Length = 2 -- Third calling of mergeSort (Right Arr)
        int length = arr.length;

        //Base Case. - Stops if element is just one.
        if (length <= 1) return;

        //Middle Length = 3
        //Middle Length (2nd call) = 1.5 = 1
        //Middle length (3rd call) = 1 = 1
        int mid = length / 2;
        //Sub Arrays - Container
        int[] leftArr = new int[mid]; //3 -- 1
        int[] rightArr = new int[length - mid]; //3 -- 2

        int indexLeft = 0; //Left Arr
        int indexRight = 0; //Right Arr

        //For loop transfers the elements of the original array into 2 sub arrays.
        //Halves the elements of the original arrays.
        for (; indexLeft < length; indexLeft++) {
            //0 - 1 - 2 - X
            if (indexLeft < mid) {
                leftArr[indexLeft] = arr[indexLeft];
            }
            //3 - 4 - 5
            else {
                rightArr[indexRight] = arr[indexLeft];
                indexRight++;
            }
        }//end of for loop
        //At the end of the loop the original array is now halve into left Arr and right Arr.

        //Recursion is a crucial step for merge sorting so we can limit the usage of repeating some of the steps.
        //Enters (IN 2nd) w 3 elements --> (6, 4, 1)
        //Enters (IN 3rd) 1 element --> (6) -> Triggers the base case, Moves to the next recursion (mergeSort(rightArr)) w the arrays (4, 1)

        //Enters (IN 4th) 1 element --> (4) -> Triggers the base case, Moves to the next recursion
        mergeSort(leftArr);

        //Enters (IN 4th) 1 element --> (1) -> Triggers the base case, moves to the helper method.
        //AFTER SPLITTING (4) and (1) STAYS AT THIS Recursion (IN 4th)
        //DONE W the leftArr same procedure to the rightArr
        mergeSort(rightArr);
        //Enters (IN 4th) 2 elements (4) (1)
        //Passes the 1 element of left arr and right arr, and the original arr
        //Enters (IN 3rd) 3 elements --> (6) (1, 4)
        merge(leftArr, rightArr, arr);
        //Finished the merge having the 2 separate values from (4) (1) to (1, 4)
        //GOES OUT OF THIS METHOD, Back to the 3rd call...
        //GOES OUT OF THIS METHOD, Back to 2nd call...

    }//end of mergeSort method

    //  Helper Method - primary functions helps another method, in our case its helping the mergeSort method.
    private static void merge(int[] leftArr, int[] rightArr, int[] arr) {

        int leftSize  = arr.length / 2; //1 --> 1
        int rightSize = arr.length - leftSize; //1 --> 2
        int origIndex = 0, leftIndex = 0, rightIndex = 0; //Indices

        //Checks the condition for merging.
        //  4 < 1
        //  6 < 1
        //  6 < 4
        while(leftIndex < leftSize && rightIndex < rightSize){
            if(leftArr[leftIndex] < rightArr[rightIndex]){
                arr[origIndex] = leftArr[leftIndex];
                origIndex++;
                leftIndex++;
            }else {
                arr[origIndex] = rightArr[rightIndex];
                origIndex++;
                rightIndex++;
            }
        }
        //[1, _]
        //[1, _, _]
        //[1, 4, _]

        //After checking through for loop checks once again -> to put the remaining elements to the original arrays.
        //Triggers when else was executed.

        //[1, 4]
        //[1, 4, 6]
        while (leftIndex < leftSize){
            arr[origIndex] = leftArr[leftIndex];
            origIndex++;
            leftIndex++;
        }

        //Triggers when if was executed.
        while (rightIndex < rightSize){
            arr[origIndex] = rightArr[rightIndex];
            origIndex++;
            rightIndex++;
        }

    }//end of merge helper method.

}//end of class
