import java.util.*;

class Solution {
    public boolean isSubset(int[] a, int[] b) {
        // Count frequency in a[]
        Map<Integer, Integer> freqA = new HashMap<>();
        for (int num : a) {
            freqA.put(num, freqA.getOrDefault(num, 0) + 1);
        }

        // Count frequency in b[] and compare with freqA
        for (int num : b) {
            if (!freqA.containsKey(num) || freqA.get(num) == 0) {
                return false; // Either not present or not enough occurrences
            }
            freqA.put(num, freqA.get(num) - 1); // Use one occurrence
        }

        return true;
    }
}
