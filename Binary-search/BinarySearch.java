import java.util.Scanner;

public class BinarySearch {

    public static int binarySearch(int arr[], int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int midIndex = low + (high - low) / 2;

            // Check the middle element
            if (arr[midIndex] == target) {
                return midIndex;
            }

            // If target is smaller, it is in the left half
            if (target < arr[midIndex]) {
                high = midIndex - 1;
            }
            // If target is greater, it is in the right half
            else {
                low = midIndex + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();

        // Defining the array
        int arr[] = new int[size];
        System.out.println("Enter elements one by one (in sorted order):");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Enter target element:");
        int target = scanner.nextInt();

        int foundIndex = binarySearch(arr, target);
        if (foundIndex == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index " + foundIndex);
        }

        scanner.close();
    }
}
