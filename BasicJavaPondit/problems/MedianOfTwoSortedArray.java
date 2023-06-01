package BasicJavaPondit.problems;

import java.util.Arrays;

public class MedianOfTwoSortedArray {
    public static void main(String[] args) {
        int[] first = {1,2};
        int[] second = {3,4};
        System.out.println(findMedianSortedArrays(first,second));

    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] newArray = new int[nums1.length+nums2.length];
        int index = 0;

        for (int num: nums1){
            newArray[index] = num;
            index++;
        }

        for (int num: nums2){
            newArray[index] = num;
            index++;
        }

        Arrays.sort(newArray);
        if(newArray.length % 2 != 0){
            return newArray[newArray.length / 2];
        }else{
            int first = newArray[(newArray.length / 2) -1];
            int second = newArray[newArray.length / 2];
            return (double)(first + second) / 2;
        }
    }
}
