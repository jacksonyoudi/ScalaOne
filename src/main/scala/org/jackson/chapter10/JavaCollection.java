package org.jackson.chapter10;

import java.util.ArrayList;

public class JavaCollection {
    public static void main(String[] args) {
        // 不可变集合
        int[] nums = new int[3];
        nums[2] = 11;
        System.out.println(nums.hashCode());
        nums[2] = 13;
        System.out.println(nums.hashCode());

        String[] names = {"one", "two"};
        System.out.println(nums);

        // 可变集合
        ArrayList<String> list = new ArrayList<>();
        list.add("one");
        System.out.println(list.hashCode());
        list.add("two");
        System.out.println(list.hashCode());


    }
}
