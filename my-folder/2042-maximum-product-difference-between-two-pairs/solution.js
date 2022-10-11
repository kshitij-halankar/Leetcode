/**
 * @param {number[]} nums
 * @return {number}
 */
var maxProductDifference = function(nums) {
    var l=nums.length;
    nums.sort(function(a, b){return a-b});
    return (nums[l-1] * nums[l-2]) - (nums[0] * nums[1]);
};
