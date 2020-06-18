package com.tag.greedy;

/**
 * Created by 周游 on 2020/6/18
 * E-mail:15626299617@163.com
 */
public class balancedStringSplit_1221 {
    public int balancedStringSplit(String s) {
        int count = 0,ans = 0;
        for(char c : s.toCharArray()){
            count += c == 'R' ? 1 : -1;
            ans += count == 0 ? 1 : 0;
        }
        return ans;
    }
}
