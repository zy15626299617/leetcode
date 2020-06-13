package com.tag.array;

/**
 * Created by 周游 on 2020/6/11
 * E-mail:15626299617@163.com
 */
public class masterMind_16_15 {
    public static void main(String[] args){
        String solution = "";
        String guess = "";

        int[] ans = new int[2];
        int[] keg = new int[26];

        for (int i = 0; i < 4; i++) {
            char A = solution.charAt(i), B = guess.charAt(i);
            if (A == B) ans[0]++;
            else{
                if (keg[A - 'A'] < 0) ans[1]++;
                keg[A - 'A']++;

                if (keg[B - 'A'] > 0) ans[1]++;
                keg[B - 'A']--;
            }
        }
        //return ans;


        //思路二：hashmap
    }
}
