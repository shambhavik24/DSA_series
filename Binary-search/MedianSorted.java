import java.util.Arrays;


public class MedianSorted {

    public double sortedArrays(int arr1[], int arr2[]){

        int[] mergedArray = new int [arr1.length + arr2.length];
        System.arraycopy(arr1, 0, mergedArray, 0, arr1.length);
        System.arraycopy(arr2, 0, mergedArray, arr1.length, arr2.length);

        Arrays.sort(mergedArray);
        int n = mergedArray.length;

        if(n % 2==0){
            int mid1 = n/2;
            int mid2 = mid1 -1;

            return(mergedArray[mid1] + mergedArray[mid2]) / 2.0;
        }
        else{
            return mergedArray[n/2];
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {3, 6, 12, 15};
        int[] arr2 = {-12, -10, 4, 10};

        MedianSorted solution = new MedianSorted();
        double result = solution.sortedArrays(arr1, arr2);
        System.out.println("Median is: " + result);
    }
    
}
