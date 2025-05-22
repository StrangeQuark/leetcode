class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 1;
        List<Integer> order = new ArrayList();

        order.add(nums[0]);

        if(nums.length == 1)
            return k;

        for(int i = 1; i < nums.length; i++) {
            if(nums[i] > order.get(order.size() - 1)) {
                k++;
                order.add(nums[i]);
            }
        }

        for(int i = 0; i < order.size(); i++)
            nums[i] = order.get(i);

        return k;
    }
}