package com.tag.array;

import java.util.HashSet;

public class checkIfExist_1346 {
    public static void main(String[] args) {
        int[] arr = {};
//思路一
//先对所有数字进行排序。然后维护两个指针：指针 pp 遍历数字 xx，指针 qq 寻找 2x2x。
//
//对于 x>0x>0 的情况，指针只需要一直前进。若 qq 在前进过程中找到一个比 2x2x 大的数字，那么 2x2x 必然不存在。
//在 pp 前进的过程中 pp 所指向的 xx 会不断递增，2x2x 也会不断递增，因此指针 qq 不需要后退。
//对于 x<0x<0 的情况，指针只需要一直后退。若 qq 在后退过程中找到一个比 2x2x 小的数字，那么 2x2x 必然不存在。
//在 pp 后退的过程中 pp 所指向的 xx 会不断递减，2x2x 也会不断递减，因此指针 qq 不需要前进。
//

//思路二hashset
        HashSet<Integer> set = new HashSet<>();
        for (int i : arr) {
            if (set.contains(2 * i) || (i % 2 == 0 && set.contains(i / 2)))
//                return true;
            set.add(i);
        }
//        return false;
    }
}
