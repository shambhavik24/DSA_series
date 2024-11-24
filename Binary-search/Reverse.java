import java.util.Scanner;
public class Reverse {
    public static void reversedArray(int array[]) {

        for(int i= 0; i<array.length /2; i++){
            int temp = array[i];
            array[i] = array[array.length- i- 1];
            array[array.length - i- 1] = temp;
        }
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

        reversedArray(arr);
        System.out.println("Revserd array");
        for(int i =0; i<size; i++){
            System.out.print(arr[i] + " ");
        }
    }
  
}
