public class SearchAlgorithms {

    // Method for Linear Search
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Target found at index i
            }
        }
        return -1; // Target not found
    }

    // Method for Binary Search
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Target found at index mid
            }
            if (arr[mid] < target) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }
        return -1; // Target not found
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int target1 = 10; // Target for Linear Search
        int target2 = 14; // Target for Binary Search

        // Performing Linear Search
        int linearResult = linearSearch(arr, target1);
        if (linearResult != -1) {
            System.out.println("Linear Search: " + target1 + " found at index " + linearResult);
        } else {
            System.out.println("Linear Search: " + target1 + " not found");
        }

        // Performing Binary Search
        int binaryResult = binarySearch(arr, target2);
        if (binaryResult != -1) {
            System.out.println("Binary Search: " + target2 + " found at index " + binaryResult);
        } else {
            System.out.println("Binary Search: " + target2 + " not found");
        }
    }
}
