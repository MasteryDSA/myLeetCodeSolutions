import java.util.HashMap;

class Solution {

    HashMap<Integer, Integer> map = new HashMap<>();

    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            int formula = target - nums[i];
            if (map.containsKey(formula)){
                return new int[] {map.get(formula), i};
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }

    public static void main (String[] args){
        int nums[] = {2, 7, 11, 15};
        int target = 9;

        Solution obj = new Solution();
        obj.twoSum(nums, target);
    }
}