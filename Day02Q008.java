// Two Sum

class Solution {
    public int[] twoSum(int[] nums, int target) {
        if (nums.length == 0)
            return new int[] {};
        if (nums.length == 1)
            return new int[] { 0 };
        if (nums.length == 2)
            return new int[] { 0, 1 };
        HashMap<Integer, Integer> table = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (table.containsKey(diff))
                return new int[] { table.get(diff), i };
            table.put(nums[i], i);
        }
        return new int[] {};
    }
}