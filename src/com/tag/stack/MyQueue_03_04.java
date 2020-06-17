package com.tag.stack;

import java.util.Stack;

/**
 * Created by 周游 on 2020/6/16
 * E-mail:15626299617@163.com
 */
public class MyQueue_03_04 {
    Stack<Integer> intStack;
    Stack<Integer> outStack;
    /** Initialize your data structure here. */
    public MyQueue_03_04() {
        intStack = new Stack<>();
        outStack = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        intStack.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        peek();
        return outStack.pop();
    }

    /** Get the front element. */
    public int peek() {
        if(outStack.isEmpty()){
            while(intStack.size() > 0) outStack.push(intStack.pop());
        }
        return outStack.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return outStack.isEmpty() && intStack.isEmpty();
    }
}
