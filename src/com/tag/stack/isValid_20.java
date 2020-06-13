package com.tag.stack;

import java.util.HashMap;
import java.util.Stack;

/**
 * Created by 周游 on 2020/6/13
 * E-mail:15626299617@163.com
 */
public class isValid_20 {
    private HashMap<Character,Character> hashmap;
    isValid_20(){
        hashmap = new HashMap<>();
        hashmap.put(']','[');
        hashmap.put('}','{');
        hashmap.put(')','(');
    }
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (Character c : s.toCharArray()){
            if (this.hashmap.containsKey(c)){
                char top = stack.isEmpty() ? '#' : stack.pop();
                if(top != this.hashmap.get(c)) return false;
            }else{
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
