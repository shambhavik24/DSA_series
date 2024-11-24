import java.util.Scanner;

public class LinearSearch {

    public static int linearSearch(int array[], int target){

        int index =-1;
        for( int i=0; i<array.length; i++){
            if(array[i] == target){
                index =i;
                break;

            }

        }
        return index;


    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a size of array");
        int size = scanner.nextInt();


        //defining array
        int arr[] = new int[size];
        System.out.println("enter element one by one");
        for(int i=0; i<size; i++){
            arr[i] = scanner.nextInt();
        }
        
       System.out.println("ENter target eleemtn");
       int  target = scanner.nextInt();

       int foundIndex = linearSearch(arr, target);
       System.out.println(foundIndex);
       if(foundIndex == -1){
        System.out.println("Element not found");
       }
       else{
        System.out.println("Element found at index"+ " " + foundIndex);
       }

    }
    
}
