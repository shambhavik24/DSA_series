public class Floor {

    public static void main(String[] args){
        int arr[] = {2,3,5,9,14,16,18};
        int target = 15;
        int ans = floor(target, arr);
        System.out.println(ans);
    }

    public static int floor(int target, int arr[]){

        int start = 0;
        int end = arr.length-1;

        while( start <= end){

            int mid = start + (end-start)/2;

            if(target < arr[mid]){
                end = mid-1;
            }else if(target > arr[mid]){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return end;
    }
    
}
