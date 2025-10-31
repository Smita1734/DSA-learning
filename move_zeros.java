import java.util.Arrays;

class Solution {
    public void moveZeroes(int[] nums) {
        int[] temp=new int[nums.length];
        int j=0;

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                temp[j]=nums[i];
                j++;
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=temp[i];
        }
        
    }
    public static void main(String[] args)
    {
        int[] nums={0,0,0,1,3,-2};
     Solution  obj=new Solution ();
       obj.moveZeroes(nums);
        System.out.print(Arrays.toString(nums));
}

}
