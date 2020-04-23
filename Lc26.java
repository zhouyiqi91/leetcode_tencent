
public class Lc26 {
    public int removeDuplicates(int[] nums) {
        if (nums.length==0) return 0;
        int index = 0;
        for (int i=1;i<nums.length;i++){
            if (nums[i] != nums[i-1]){
                index++;
                nums[index] = nums[i];
            } 
        }
        return index+1;
    }

}