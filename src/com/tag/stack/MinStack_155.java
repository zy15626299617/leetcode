package com.tag.stack;

import java.util.Stack;

/**
 * Created by 周游 on 2020/6/13
 * E-mail:15626299617@163.com
 */
public class MinStack_155 {
    Stack<Integer> stack;
    Stack<Integer> min_stack;
    /** initialize your data structure here. */
    public MinStack_155() {
        stack = new Stack<>();
        min_stack = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        if(min_stack.isEmpty() || x <= min_stack.peek()) min_stack.push(x);
    }

    public void pop() {
        if (stack.pop().equals(min_stack.peek())) min_stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min_stack.peek();
    }
}
