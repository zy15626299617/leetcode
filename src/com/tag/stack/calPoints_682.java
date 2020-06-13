package com.tag.stack;

import java.util.Stack;

/**
 * Created by 周游 on 2020/6/13
 * E-mail:15626299617@163.com
 */
public class calPoints_682 {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        int ans = 0;
        for (String s : ops){
            if (s.equals("+")) {
                int pre = stack.pop();
                int sum = stack.peek() + pre;
                stack.push(pre);
                stack.push(sum);
                ans += sum;
            }else if(s.equals("D")){
                int sum = stack.peek() * 2;
                stack.push(sum);
                ans += sum;
            }else if (s.equals("C")){
                ans -= stack.pop();
            }else{
                ans += Integer.valueOf(s);
                stack.push(Integer.valueOf(s));
            }
        }
        return ans;
    }
}
