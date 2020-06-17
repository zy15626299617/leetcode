package com.tag.greedy;

/**
 * Created by 周游 on 2020/6/17
 * E-mail:15626299617@163.com
 */
public class lemonadeChange_860 {
    public boolean lemonadeChange(int[] bills) {
        int f = 0,t = 0;
        for (int i : bills){
            switch (i) {
                case 5:
                    f++;
                    break;
                case 10:
                    if(f == 0) return false;
                    else{
                        f--;
                        t++;
                    }
                    break;
                case 20:
                    if((t == 0 && f < 3) || (t > 0 && f == 0)) return false;
                    else{
                        if(t > 0) {
                            t--;
                            f--;
                        }else{
                            f -= 3;
                        }
                    }
                    break;
            }
        }
        return true;
    }
}
