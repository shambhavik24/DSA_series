

public class LargestElement {

    public static int findLargestElement(int array[]) {

        int largestEleemnt = array[0];

        for(int i=0; i<array.length; i++){
            largestEleemnt = array[i];
        }
        return largestEleemnt;
    }
    public static void main(String[] args) {

        int arr [] ={10,20,30,40,50,60};
       int value =  findLargestElement(arr);
       System.out.println(value);
        
    }
    
}
