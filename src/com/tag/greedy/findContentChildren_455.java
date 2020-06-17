package com.tag.greedy;

import java.util.Arrays;

/**
 * Created by 周游 on 2020/6/17
 * E-mail:15626299617@163.com
 */
public class findContentChildren_455 {
    public int findContentChildren(int[] g, int[] s) {
        if(g.length == 0 || s.length == 0) return 0;
        int gi = 0,sj = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        while (gi < g.length && sj < s.length){
            if(g[gi] <= s[sj]) gi++;
            sj++;
        }
        return gi;
    }
}
