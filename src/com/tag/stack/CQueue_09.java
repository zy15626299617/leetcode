package com.tag.stack;

import java.util.Stack;

/**
 * Created by 周游 on 2020/6/16
 * E-mail:15626299617@163.com
 */
public class CQueue_09 {
    Stack<Integer> stack;
    Stack<Integer> helpStack;
    public CQueue_09() {
        stack = new Stack<>();
        helpStack = new Stack<>();
    }

    public void appendTail(int value) {
        stack.push(value);
    }

    public int deleteHead() {
        if(helpStack.isEmpty() && stack.isEmpty()) return -1;
        if(helpStack.isEmpty()){
            while(!stack.isEmpty()) helpStack.push(stack.pop());
        }
        return helpStack.pop();
    }
}
