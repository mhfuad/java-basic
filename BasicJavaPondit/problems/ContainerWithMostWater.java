package BasicJavaPondit.problems;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }

    public static int maxArea(int[] height) {

        int n = height.length;
        int l = 0, r = n -1, max = Integer.MIN_VALUE;

        while (l < r){
            int tempMax = (r - l) * Math.min(height[l], height[r]);
            max = Math.max(max, tempMax);
            if(height[l] < height[r]){
                l++;
            }else{
                r--;
            }
            //System.out.println(tempMax);
        }
        return max;
    }
}
