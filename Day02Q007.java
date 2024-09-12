// Chocolate Distribution Problem

class Solution {
    public long findMinDiff(ArrayList<Integer> a, int n, int m) {
        // your code here
        Collections.sort(a);
        long min = Integer.MAX_VALUE;
        int i = 0, j = m - 1;
        while (j < n) {
            long diff = a.get(j) - a.get(i);
            min = Math.min(min, diff);
            i++;
            j++;
        }
        return min;
    }
}
