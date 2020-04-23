/*
编写一个函数来查找字符串数组中的最长公共前缀。

如果不存在公共前缀，返回空字符串 ""。

示例 1:

输入: ["flower","flow","flight"]
输出: "fl"
*/

public class Lc14 {

    public String longestCommonPrefix(String[] strs) {
        int len = strs.length;
        if (len==0) return "";
        String ans = strs[0];
        for (int i=1;i<len;i++){
            int j = 0;
            for (;j<ans.length() && j<strs[i].length();j++){
                if (ans.charAt(j) != strs[i].charAt(j)) break;
            }
            if (ans=="") break;
            else ans=ans.substring(0, j);
        }
        return ans;
    }
    
}