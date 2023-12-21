package Array;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args){
        int nums[] = {2, 7, 11, 15};
        int target = 9;
        int[] result1 = findTwosum1(nums, target);
        System.out.println("Without inbuilt= "+result1[0]+":"+result1[1]);
        int[] result2 = findTwosum2(nums,target);
    }

    private static int[] findTwosum1(int[] nums, int target) {
        int result[]=new int[2];
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    result[0]=i;
                    result[1]=j;
                }
            }
        }
        return result;
    }

    private static int[] findTwosum2(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer,Integer> hm=new HashMap();
        for ( int i=0;i<nums.length;i++)
        {
            if(hm.containsKey(target-nums[i]))
            {
                result[1]=i;
                result[0]=hm.get(target-nums[i]);
                return result;
            }
            hm.put(nums[i],i);
        }
        return result;
    }
}
