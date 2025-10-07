public class Binarysearch {
    // Binary Search using Loop
    public static int binarySearch(int arr[], int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Element found
            }
            else if (arr[mid] < target) {
                left = mid + 1; // Right side search
            }
            else {
                right = mid - 1; // Left side search
            }
        }
        return -1; // Element not found
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 10, 15, 20, 25}; // Sorted array
        int target = 15;

        int result = binarySearch(arr, target);

        if (result == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element " + target + " found at index: " + result);
    }
}
