class Solution {
    public int searchInsert(int[] nums, int target) {
        int front = 0;
        int back = nums.length - 1;

        if(target <= nums[0])
            return 0;
        if(target > nums[back])
            return nums.length;

        while(front < back - 1) {
            int middlePos = (back + front) / 2;

            if(target > nums[middlePos])
                front = middlePos;
            if(target < nums[middlePos])
                back = middlePos;
            if(nums[middlePos] == target)
                return middlePos;
        }

        return back;
    }
}