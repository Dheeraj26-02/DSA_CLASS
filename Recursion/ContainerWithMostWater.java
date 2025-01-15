public class ContainerWithMostWater {
    public static void main(String[] args) {
        int height []= {1,8,6,2,5,4,8,3,7};
        int n=height.length;
        int left=0;
        int right=n-1;
        int curArea=0;
        int maxArea=0;
        while(left<right){
            int minHeight=Math.min(height[left],height[right]);
            int width=right-left;
            curArea=minHeight*width;
            maxArea=Math.max(maxArea,curArea);
            if(height[right]>height[left]){
                left++;
            }
            else{
                right--;
            }
        }
        System.out.println(maxArea);
    }
}
