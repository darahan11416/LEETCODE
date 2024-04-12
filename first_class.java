//Given an array of integers nums and an integer target,
//return indices of the two numbers such that they add up to target.

//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
import java.util.*;

class first_class {
    public int[] twoSum(int[] num, int target) {
        int result[] = new int[2];
        for(int i=0;i<num.length;i++)
        {
            for(int j=i+1;j<num.length;j++)
            {
                if (num[i]+num[j]==target)
                {
                    result[0]=i;
                    result[1]= j;
                    //return result;
                }
            }
        }
        return result;
    }

    public static void main(String args[])
    {
        int[] arr = {1,2,3,4,5};
        int target = 9;
        first_class  s = new first_class();

        int[] result = s.twoSum(arr,target);

        for(int k=0;k<arr.length;k++)
        {
            System.out.print(result[k]+" ");
        }
    }


}