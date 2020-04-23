/*
给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。

你可以假设数组是非空的，并且给定的数组总是存在多数元素。
输入: [3,2,3]
输出: 3
输入: [2,2,1,1,1,2,2]
输出: 2
*/
import java.util.HashMap;

public class Lc169{

    public int majorityElement(int[] nums) {
        int len = nums.length;
        HashMap<Integer,Integer> map1 = new HashMap<>();
        for (int i=0;i<len;i++){
            int count = 1;
            if (map1.keySet().contains(nums[i])) {
                count = map1.get(nums[i])+1;
            }
            if (count>len/2) return nums[i];
            map1.put(nums[i],count); 

        }
        return -1;
    }

}