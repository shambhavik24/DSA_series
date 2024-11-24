public class SplitArrayLargestSum {
    public static void main(String[] args) {
        
    }
    public int splitArray(int nums[], int m){
        int start = 0;
        int end = 0;

        for(int i = 0; i<nums.length; i++){
            start = Math.max(start, nums[i]); 
            end += nums[i];
        }

        while(start < end){
            //try middle as potential ans
            int mid = start + (end - start)/2;

            //claculate how many pieces u can divide with max sum
            int sum = 0;
            int piece = 1;
            for(int num:nums){
                if(sum + num > mid){
                    sum = num;
                    piece++;

                }else{
                    start += num;
                }

            }
            if(piece > m){
                sum = mid+1;
            }
            else{
                end = mid;
            }

        }
        return end;

    }
    
}
