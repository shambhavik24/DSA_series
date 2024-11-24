import java.util.Scanner;

class MountainArray {
    public int peakIndexInMountainArray(int[] arr) {
        int low = 0;
        int high = arr.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            
            if (arr[mid] > arr[mid + 1]) {
                high = mid; // move the high pointer to mid
            } else {
                // Else the peak is on the right side
                low = mid + 1; // move the low pointer to mid + 1
            }
        }

        
        return low;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();

        // Defining the array
        int arr[] = new int[size];
        System.out.println("Enter elements one by one (forming a mountain array):");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        MountainArray solution = new MountainArray();
        int peakIndex = solution.peakIndexInMountainArray(arr);
        System.out.println("Peak element found at index " + peakIndex);

        scanner.close();
    }
}
