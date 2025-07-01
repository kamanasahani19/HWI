class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] counts = new int[26];
        for (char task : tasks) {
            counts[task - 'A']++;
    }
    int max_freq = 0;
        for (int cnt : counts) {
            max_freq = Math.max(max_freq, cnt);
        }
        int max_count = 0;
        for (int cnt : counts) {
            if (cnt == max_freq) {
                max_count++;
            }
        }
        return Math.max(tasks.length, (max_freq - 1) * (n + 1) + max_count);
    }    

}