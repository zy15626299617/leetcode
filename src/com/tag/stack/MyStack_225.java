package com.tag.stack;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by 周游 on 2020/6/13
 * E-mail:15626299617@163.com
 */
public class MyStack_225 {
    private Queue<Integer> queue;
    /** Initialize your data structure here. */
    public MyStack_225() {
        queue = new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        queue.add(x);
        for (int i = 1;i < queue.size(); i++) queue.add(queue.remove());
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return queue.remove();
    }

    /** Get the top element. */
    public int top() {
        return queue.peek();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue.isEmpty();
    }
}
