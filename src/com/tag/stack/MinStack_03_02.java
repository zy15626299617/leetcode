package com.tag.stack;

import java.util.Stack;

/**
 * Created by 周游 on 2020/6/16
 * E-mail:15626299617@163.com
 */
public class MinStack_03_02 {
    //核心思想 minstack存储每次存储当前所有元素的最小值
    Stack<Integer> stack;
    Stack<Integer> minstack;
    /** initialize your data structure here. */
    public MinStack_03_02() {
        stack = new Stack<>();
        minstack = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        if (minstack.isEmpty()) minstack.push(x);
        else minstack.push(minstack.peek() < x ? minstack.peek() : x);
    }

    public void pop() {
        stack.pop();
        minstack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minstack.peek();
    }
}
