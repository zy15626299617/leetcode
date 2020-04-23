package com.tag.array;

public class try123 {
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
