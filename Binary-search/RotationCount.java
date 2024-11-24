public class RotationCount {

    public static void main(String[] args) {
        int arr [] = {4,5,6,7,0,1,2};
        System.out.println(countRotation(arr));

       
    }

    private static int countRotation(int arr[]){
        int pivot = findpivot(arr);
        return pivot +1;

    }
    
    public static int findpivot(int arr[]){
        int start = 0;
        int end = arr.length-1;

        while(start < end){

            int mid = start + (end -start)/2;

            // if we don't add the mid<end then mid+1 gives us IndexOutOfBoundaryException at the end 
            if(mid < end && arr[mid] > arr[mid+1])
            {
                return mid;
            }
            // if we don't add the mid<end then mid+1 gives us IndexOutOfBoundaryException at the start
            if( mid > start && arr[mid] < arr[mid+1]){   

                return mid-1;
            }
            if(arr[mid] <= arr[start]){
                end = mid-1;
            }else{
                start = mid +1;
            }
        }
        return -1;

        //functionalities
        // calculate Total expense weekly / montaly / halfly and yearly/
        // it show in pie or bar grapgh
        //categories wise data  like food/ tarnsport 
        // / utility (for personal)
        // for bussiness or commerical (utility, or othe factor)
        // Integeating power bi to show expensive id wise 
    }

}

//How to count in duplicate rotated sorted array
