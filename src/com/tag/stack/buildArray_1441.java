package com.tag.stack;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 周游 on 2020/6/16
 * E-mail:15626299617@163.com
 */
public class buildArray_1441 {
    public List<String> buildArray(int[] target, int n) {
        List<String> list = new ArrayList<>();
        int index = 0;
        for (int i = 1; i <= n; i++){
            if(index < target.length){
                if(i == target[index]){
                    list.add("Push");
                    index++;
                }else{
                    list.add("Push");
                    list.add("Pop");
                }
            }else{
                break;
            }
        }
        return list;
    }
}
