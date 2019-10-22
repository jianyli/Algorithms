package com.leetcode.examples.C_3;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxSub = 0;
        String[] arr = s.split("");
        StringBuilder sb = new StringBuilder();
        int cursor = 0;
        for (int i = 0; i < arr.length; i++ ) {
            int index = sb.indexOf(arr[i],cursor);
            cursor = index > -1 ? (index + 1) : cursor;
            sb.append(arr[i]);
            int len = sb.length() - cursor;
            maxSub = maxSub > len ? maxSub : len;
        }
        return maxSub;
    }

    /**
     * 网上大佬做法，执行用时 :2 ms , 在所有 Java 提交中击败了 100.00%的用户
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring1(String s) {
        int maxLength = 0;
        char[] chars = s.toCharArray();
        int leftIndex = 0;
        for (int j = 0; j < chars.length; j++) {
            for (int innerIndex = leftIndex; innerIndex < j; innerIndex++) {
                if (chars[innerIndex] == chars[j]) {
                    maxLength = Math.max(maxLength, j - leftIndex);
                    leftIndex = innerIndex + 1;
                    break;
                }
            }
        }
        return Math.max(chars.length - leftIndex, maxLength);
    }

}
public class C_3 {
    public static void main(String[] args) {
        String s = "bbbbb";
        Solution solution = new Solution();
        int result = solution.lengthOfLongestSubstring(s);
        System.out.println(result);
    }
}
