package com.tag.greedy;

/**
 * Created by 周游 on 2020/6/17
 * E-mail:15626299617@163.com
 */
public class isSubsequence_392 {
    public boolean isSubsequence(String s, String t) {
        int index = 0;
        for (char ch : s.toCharArray()) {
            while(index < t.length() && t.charAt(index) != ch) index++;
            index++;
        }
        return index <= t.length() ? true : false;
    }
}
