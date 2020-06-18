package com.tag.sort;

/**
 * Created by 周游 on 2020/6/18
 * E-mail:15626299617@163.com
 */
public class isAnagram_242 {
    public boolean isAnagram(String s, String t) {
        int[] keg = new int[26];
        for(char c : s.toCharArray()) keg[c - 'a']++;
        for(char c : t.toCharArray()) keg[c - 'a']--;
        for(int i : keg) if(i != 0) return false;
        return true;
    }
}
