package com.tag.stack;

import java.util.Stack;

/**
 * Created by 周游 on 2020/6/16
 * E-mail:15626299617@163.com
 */
public class MinStack_30 {
    Stack<Integer> stack;
    Stack<Integer> minStack;
    /** initialize your data structure here. */
    public MinStack_30() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        if(minStack.isEmpty()) minStack.push(x);
        else minStack.push(minStack.peek() < x ? minStack.peek() : x);
    }

    public void pop() {
        stack.pop();
        minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return minStack.peek();
    }
}
