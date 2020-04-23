//静态和非静态的区别

import java.util.*;
import static java.lang.System.*;

class Lc20{

    private HashMap<Character,Character> map;
    private static HashMap<Character,Character> map1 = new HashMap<Character,Character>();

    static {
        map1.put('(',')');
        map1.put('[',']');
        map1.put('{','}');  
    }


    public Lc20(){
        this.map = new HashMap<Character,Character>();
        this.map.put('(',')');
        this.map.put('[',']');
        this.map.put('{','}');  
    }    

    public boolean isValid(String s) {
        /*
        HashMap<Character,Character> map = new HashMap<>();
        map.put('(',')');
        map.put('[',']');
        map.put('{','}');
        */
        Set<Character> keys = this.map.keySet();
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()){
            if (keys.contains(c)){
                stack.push(c);
            } else {
                if (!stack.empty()) return false;
                char top_char = stack.pop();
                if (c!=map.get(top_char)){
                    return false;
                }
            }
        }
        if (!stack.empty()) return false;
        return true;
    }

    public static boolean isValid1(String s) {
        /*
        HashMap<Character,Character> map = new HashMap<>();
        map.put('(',')');
        map.put('[',']');
        map.put('{','}');
        */
        Set<Character> keys = map1.keySet();
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()){
            if (keys.contains(c)){
                stack.push(c);
            } else {
                if (!stack.empty()) return false;
                char top_char = stack.pop();
                if (c!=map1.get(top_char)){
                    return false;
                }
            }
        }
        if (!stack.empty()) return false;
        return true;
    }

    public static void main(String args[]){
        String s = "([)]"; 
        System.out.println(isValid1(s));       
    }
    
}

