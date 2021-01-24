// 暴力搜索
// class Solution {
//     public int maxArea(int[] height) {
//         int area = 0;
//         int max_area = 0;
//         for(int i = 0; i < (height.length-1); i++) {
//             for(int j = i+1; j < height.length; j++) {
//                 area = Math.min(height[i],height[j])*(j-i);
//                 max_area = Math.max(max_area,area);
//             }
//         }
//         return max_area;
//     }
// } 时间复杂度O(2的N次方) 空间复杂度o(N)

// 双指针
class Solution {
    public int maxArea(int[] height) {
        int area = 0;
        int max_area = 0;
        int i = 0;
        int j = height.length-1;
        while(i < j) {
            if(height[i] < height[j]) {
                area = height[i] * (j-i);
                i++;
            }else {
                area = height[j] * (j-i);
                j--;
            }
            max_area = Math.max(max_area,area);
        }
        return max_area;
    }
}
