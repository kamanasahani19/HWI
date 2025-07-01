import java.util.Arrays;
import java.util.Comparator;

class Non-overlappingIntervals {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[1]));

        int removeCount = 0;
        long end = Long.MIN_VALUE;

        for (int[] interval : intervals) {
            if (interval[0] >= end) {
                
                end = interval[1];
            } else {
                
                removeCount++;
            }
        }

        return removeCount;
    }
}