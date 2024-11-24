public class FindFirstandLast {

    public static void main(String[] args) {
        FindFirstandLast solution = new FindFirstandLast();
        
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] result = solution.searchRange(nums, target);
        
        System.out.println("Output: [" + result[0] + ", " + result[1] + "]");
    }

    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        
        int start = search(nums, target, true);  // Find the first occurrence
        int end = search(nums, target, false);   // Find the last occurrence
        
        ans[0] = start;
        ans[1] = end;

        return ans;
    }

    private int search(int[] nums, int target, boolean findFirstIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                // Found target at mid
                ans = mid;
                if (findFirstIndex) {
                    end = mid - 1;  // Narrow search to the left for first occurrence
                } else {
                    start = mid + 1;  // Narrow search to the right for last occurrence
                }
            }
        }
        return ans;
    }
}
