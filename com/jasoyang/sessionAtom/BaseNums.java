package com.jasoyang.sessionAtom;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class BaseNums {
    public static void main(String[] args) {
        /*
        数组的排序去重 
        1. 用hashset来去重
        2.用Arrays.sort 配合 Comparator 排序
        3. set可以直接转成String
         */
        int[] nums1 = {1, 9, -1, 3, 3, 7, 8, 5, 8};
        Integer[] nums2 = {2, 5, 7, 1, 4, 7, 5};
        // 从小到大
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));

        // 逆序排序不能使用基本类型

        Comparator com = new Comparator<Integer>() {
            @Override

            public int compare(Integer o1, Integer o2) {
                return o1 > o2 ? -1 : 1;
            }
        };

        Arrays.sort(nums2, com);
        System.out.println(Arrays.toString(nums2));
        // 用hashset去重

        Set<Integer> uniqueNum = new HashSet<>();
        for (Integer elem : nums1) {
            uniqueNum.add(elem);
        }
        System.out.println(Arrays.toString(uniqueNum.toArray(new Integer[]{})));
        System.out.println(uniqueNum.contains(1111));
    }
}
