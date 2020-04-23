//判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
import java.util.*;

class Lc9 {
    public boolean isPalindrome_str(int x) {
        if (x<0) return false;
        StringBuilder reverse = new StringBuilder();
        reverse.append(Integer.toString(x));
        reverse = reverse.reverse();
        return Integer.toString(x).equals(reverse.toString());
    }

    public boolean isPalindrome(int x) {
        if (x<0) return false;
        int div = 1;
        while (x/div>=10) div*=10;
        while (x>0){
            int left = x/div;
            int right = x % 10;
            if (left!=right) return false;
            x = (x % div)/10;
            div = div/100;
        }
        return true;
    }

}