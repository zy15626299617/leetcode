package com.tag.greedy;

import java.util.Arrays;

/**
 * Created by 周游 on 2020/6/18
 * E-mail:15626299617@163.com
 */
public class twoCitySchedCost_1029 {
    public int twoCitySchedCost(int[][] costs) {
        int ans = 0, l = -1, r = costs.length;
        Arrays.sort(costs, (int[] a, int[] b) -> a[0]-a[1]-b[0]+b[1]);
        for(int[] c : costs) System.out.print(Arrays.toString(c));
        while(++l < --r){
            ans += costs[l][0];
            ans += costs[r][1];
        }
        return ans;
    }
}
