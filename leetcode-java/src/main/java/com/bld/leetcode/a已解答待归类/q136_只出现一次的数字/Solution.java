//136. 只出现一次的数字
//        给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
//
//        说明：
//
//        你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
//
//        示例 1:
//
//        输入: [2,2,1]
//        输出: 1
//        示例 2:
//
//        输入: [4,1,2,1,2]
//        输出: 4
//        通过次数266,982提交次数382,377
//        https://leetcode-cn.com/problems/single-number/
package com.bld.leetcode.a已解答待归类.q136_只出现一次的数字;

class Solution {
    public int singleNumber(int[] nums) {
        int rv = 0;
        for(int i = 0; i < nums.length; i++) {
            rv ^= nums[i];
        }
        return rv;
    }
}