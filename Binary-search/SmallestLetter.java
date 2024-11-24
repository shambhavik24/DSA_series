// https://leetcode.com/problems/find-smallest-letter-greater-than-target/744
public class SmallestLetter {

    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        char target = 'a';

        char result = findSmallestLetter(letters, target);
        System.out.println("The smallest letter greater than target is: " + result);
    }

    public static char findSmallestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        // Wrap around if start is beyond the last index
        return letters[start % letters.length];
    }
}
// ra*BQH5TDsG8C@g