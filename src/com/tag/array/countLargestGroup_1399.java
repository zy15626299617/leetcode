package com.tag.array;

public class countLargestGroup_1399 {
    public static void main(String[] args){
        int n = 0;
        //思路一：哈希表存储数位和与并列数,
        //HashMap<Integer,Integer> hashMap = new HashMap<>();
        //for (int i = 1; i <= n; i++) {
        //    int sum = 0;
        //    int tmp = i;
        //    while (tmp > 0){
        //        sum += tmp%10;
        //        tmp /= 10;
        //    }
        //    if (hashMap.containsKey(sum)) hashMap.put(sum,hashMap.get(sum)+1);
        //    else hashMap.put(sum,1);
        //}
        //
        //int max = 0;
        //for (Map.Entry<Integer,Integer> entry : hashMap.entrySet()){
        //    max = Math.max(entry.getValue(),max);
        //}
        //
        //int ans = 0;
        //for (Map.Entry<Integer,Integer> entry : hashMap.entrySet()){
        //    if (entry.getValue() == max) ans++;
        //}
        //return ans;


        //思路二：N取值最大为10的4次方，即最大是10000，所以位数和最大为4*9 = 36，桶思想；
        //if(n < 9) return n;
        int[] arr = new int[37];
        for (int i = 1; i <= n; i++) {
            int sum = 0;
            int tmp = i;
            while (tmp > 0){
                sum += tmp%10;
                tmp /= 10;
            }
            arr[sum]++;
        }

        int max = 1,ans = 1;
        for (int i = 1; i < 38; i++) {
            if (max < arr[i]) {
                max = arr[i];
                ans = 1;
            }else if(max == arr[i]){
                ans++;
            }
        }
        //return ans;
    }
}
