import java.util.Scanner;

public class SumArray {

    public static int sumArrayy(int arr[]){
        int sum=0;
        for(int i=0; i<arr.length;i++){
        sum=sum+arr[i];
        }
        return sum;
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
       int summ =  sumArrayy(arr);
       System.out.println("Addition is"+ " "+ summ);

    }
}
