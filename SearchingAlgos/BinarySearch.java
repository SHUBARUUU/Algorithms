public class BinarySearch {
    //  Binary Searching - a searching algorithm that starts in the middle then moves the range of search accordingly.
//  This searching algo is only possible if the arrays are sorted.
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 5;

//      Variables - set up for the range of the binary search.
        int left = 0; //Start of the array.
        int right = arr.length - 1; //End of the array.
        int mid; //Middle point where we first start comparing.

        while (right >= left) {

            mid = (left + right) / 2;
            if (arr[mid] == target) {
                System.out.println("Target Found!");
                break;
            } else if (target > arr[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }


        }


    }
}
