package com.tag.stack;

/**
 * Created by 周游 on 2020/6/13
 * E-mail:15626299617@163.com
 */
public class removeDuplicates_1047 {
    public String removeDuplicates(String S) {
        StringBuilder ans = new StringBuilder();
        int length = 0;
        for (char c : S.toCharArray()){
            if(length != 0 && c == ans.charAt(length - 1)){
                ans.deleteCharAt(length-- - 1);
            }else{
                ans.append(c);
                length++;
            }
        }
        return ans.toString();
    }
}
