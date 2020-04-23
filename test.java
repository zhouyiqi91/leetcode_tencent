
public class test {
    public static void main(String args[]){
        /*
        String s = "([)]";
        Lc20 solution = new Lc20();
        boolean res = solution.isValid(s);
        System.out.println(res);  
        //System.out.println(4>>1);   

        Lc9 solution = new Lc9();
        boolean res = solution.isPalindrome(1212);        
        System.out.println(res);     
        res = solution.isPalindrome(12321);        
        System.out.println(res);  

        
        int[] nums = {1,1,2};
        Lc26 solution = new Lc26();
        System.out.println(solution.removeDuplicates(nums));
 
        int[] prices = {7,1,5,3,6,4};
        Lc121 solution = new Lc121();
        System.out.println(solution.maxProfit(prices));
        assert (solution.maxProfit(prices)==5);
                */
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        Lc53 solution = new Lc53();
        System.out.println(solution.maxSubArray_dp(nums));
    }      

}