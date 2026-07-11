class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> result = new HashSet<>();
        List<Integer> numberList = new ArrayList<>();
        for(int i=0 ; i<nums.length;i++){
            numberList.add(nums[i]);
        }

        result.addAll(numberList);

        return result.size() < nums.length;
        
    }
}