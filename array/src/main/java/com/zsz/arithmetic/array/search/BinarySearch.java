package com.zsz.arithmetic.array.search;
/**
 * @author ZSZ
 * @date 2024/8/3 23:37
 */
public class BinarySearch {
    //二分法找出指定有序数组中目标数字的下标，没有返回-1
    public static int binarySearch(int[] array,int target){
        int left=0,right=array.length-1;
        while (left <= right){
            int mid=left+((right-left)>>1);
            if (array[mid] == target){
                return mid;
            }
            if (array[mid] < target){
                //目标大于中间值，更新左边界
                left = mid+1;
            }else {
                //目标小于中间值，更新右边界
                right = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7,8};
        System.out.println(binarySearch(array, 5));
    }
}
