public class LinearSearch {
    //  Linear Searching - a searching algorithm that searches one at a time on a group of data.
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 4;

        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                System.out.println("Target Found!");
                break;
            }
        }

    }
}
