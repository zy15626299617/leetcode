package com.tag.array;

import java.util.Arrays;

public class numSmallerByFrequency_1170 {
    public static void main(String[] args){
        String[] queries = {"bba","abaaaaaa","aaaaaa","bbabbabaab","aba","aa","baab","bbbbbb","aab","bbabbaabb"};
        String[] words = {"aaabbb","aab","babbab","babbbb","b","bbbbbbbbab","a","bbbbbbbbbb","baaabbaab","aa"};

        int[] queries_ = new int[queries.length];
        for (int i = 0; i < queries.length; i++){
            char min = 1000;
            for (char c : queries[i].toCharArray()){
                if (c < min){
                    min = c;
                    queries_[i] = 1;
                }else {
                    if (c == min) queries_[i]++;
                }
            }
        }
        System.out.println(Arrays.toString(queries_));

        int[] words_ = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            char min = 1000;
            for (char c : words[i].toCharArray()){
                if (c < min){
                    min = c;
                    words_[i] = 1;
                }else {
                    if (c == min) words_[i]++;
                }
            }
        }
        System.out.println(Arrays.toString(words_));

        for (int i = 0;i < queries_.length;i++){
            int word_count = 0;
            for (int j : words_){
                if (queries_[i] < j) word_count++;
            }
            queries_[i] = word_count;
        }

        System.out.println(Arrays.toString(queries_));
    }
}
