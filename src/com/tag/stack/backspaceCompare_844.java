package com.tag.stack;

import java.util.Stack;

/**
 * Created by 周游 on 2020/6/13
 * E-mail:15626299617@163.com
 */
public class backspaceCompare_844 {
    public boolean backspaceCompare(String S, String T) {
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        for (char c : S.toCharArray()){
            if (c == '#'){
                if(!stack1.isEmpty()) stack1.pop();
            }else stack1.push(c);
        }
        for (char c : T.toCharArray()){
            if (c == '#'){
                if(!stack2.isEmpty()) stack2.pop();
            }else stack2.push(c);
        }
        System.out.print(stack1.size()+","+stack2.size());
        if (stack1.size() != stack2.size()) return false;
        else {
            while(!stack1.isEmpty())
                if (stack1.pop() != stack2.pop()) return false;
        }
        return true;
    }


    //    public boolean backspaceCompare(String S, String T) {
    //        return build(S).equals(build(T));
    //    }
    //
    //    public String build(String S) {
    //        Stack<Character> ans = new Stack();
    //        for (char c: S.toCharArray()) {
    //            if (c != '#')
    //                ans.push(c);
    //            else if (!ans.empty())
    //                ans.pop();
    //        }
    //        return String.valueOf(ans);
    //    }
}
