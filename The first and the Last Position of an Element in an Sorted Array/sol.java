class Solution {
    public int[] searchRange(int[] nums, int target) {
        int [] ans={-1,-1};
        int l=firstindex(nums,target,true);
        int u=firstindex(nums,target,false);
        ans[0]=l;
        ans[1]=u;
        return ans;
    }
    public int firstindex(int [] nums,int target,boolean findstartindex){
        int ans=-1;
        int l=0;
        int u=nums.length-1;
        while(l<=u){
            int mid=l+(u-l)/2;
            if(target<nums[mid]){
                u=mid-1;
            }
            else if(target>nums[mid]){
                l=mid+1;
            }
            else{
                ans=mid;
                if(findstartindex){
                    u=mid-1;
                }
                else{
                    l=mid+1;
                }
            }
        }
        return ans;
    }       
}