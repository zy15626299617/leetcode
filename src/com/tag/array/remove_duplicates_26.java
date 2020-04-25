package com.tag.array;

//leetcode:26

//给定一个排序数组，你需要在 原地 删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
//不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
//链接：https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array

//给定 nums = [0,0,1,1,1,2,2,3,3,4],
//函数应该返回新的长度 5, 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4。
//你不需要考虑数组中超出新长度后面的元素。

//主要解题思路是将所有不重复的元素移动到数组的左侧。
//定义俩个指针i和j，i代表的是前一个元素，j代表的是后一个元素，刚开始i代表第一个元素，j从第一个元素开始遍历也是指向第一个元素，判断i和j是否相等
//因为此时俩者指向相同所以值相等，这时前一个元素i不变，后一个元素j指向后一个元素，即j递增。完成后在再次判断前一个元素与后一个元素是否相同，
//如果相同，则重复上面的操作。若不相同，则将前一个元素变成此时的后一个元素，即i+1，后一个元素j指向后一个元素，即j递增。循环直至j递增结束。
//而刚开始的前一个元素相当于完成筛选，放进了合格的队列中，所以整个过程相当于遍历整个队列，将筛选合格的人按顺序放到另外一个队列中，因为题目规定
//原地修改，所以这里将原数组的前N项假设成另一个队列

public class remove_duplicates_26 {
    public static void main(String[] a) {
        int[] base_array = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        if (base_array.length == 0) {
            System.out.println("源数组为空");
        } else {
            int i = 0;
            System.out.print("[" + base_array[0]);

            for(int j = 0; j < base_array.length; ++j) {
                if (base_array[i] != base_array[j]) {
                    ++i;
                    base_array[i] = base_array[j];
                    System.out.print("," + base_array[i]);
                }
            }
            System.out.print("]");
        }

    }
}
