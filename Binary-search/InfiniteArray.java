public class InfiniteArray {
    public static void main(String[] args) {
        int arr[] = {3,5,7,9,10,19, 100,130, 140,160, 170};
        int target =10;
        System.out.println(ans(arr, target));


        
    }

    static int ans(int arr[], int target){

        //first find the range
        //first start with box size 2
        int start =0;
        int end =1;

        //condition for the taret lie in range
        while(target > arr[end]){

            int temp = end+1;  //this is my new start
            //double the box
            //end = previous end + sizeBox *2

            end = end +( end-start +1) *2;
            start = temp;
        }

        return infiniteArry(target, arr, start, end);
    }
static int infiniteArry(int target, int arr[], int start, int end){


    while(start<=end){

        int mid = start + (end-start)/2;

        if(target< arr[mid]){
            
            end = mid-1;
        }else if( target > arr[mid]){

            start = mid+1;
        }
        else{
            return mid;
        }
    }
    return -1;
}
    
}
