class Solution {
    public int[] twoSum(int[] nums, int target) {

        int i = 0,j = nums.length -1;
        int[]temp = nums.clone();
        Arrays.sort(temp);
        while(temp[i] + temp[j] != target){
            int sum = temp[i] + temp[j];
            if( sum < target){
                i++;
            }
            else {
                j--;
            }
        }
        int a1 = 0,a2 = 0;
        // setting a1 and a2
        for(int ii = 0 ; ii < nums.length;ii++){
            if(nums[ii] == temp[i]){
                a1 = ii;
                break;  
            }
        }

        for(int ii = 0 ; ii < nums.length;ii++){
            if(nums[ii] == temp[j] && a1!=ii){
                a2 = ii;
            }

        }
        int[] ans = {a1,a2};
        return ans;
        
    }
}