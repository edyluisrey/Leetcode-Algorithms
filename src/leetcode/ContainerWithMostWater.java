package leetcode;

public class ContainerWithMostWater {

	public static void main(String[] args) {
		ContainerWithMostWater containerWithMostWater  = new ContainerWithMostWater();
		System.out.println(containerWithMostWater.maxArea(new int[]{1,5,4,6,8}));

	}
	
	public int maxArea(int[] height) {
		int left=0;  
		int  right = height.length -1;
		int maxArea= 0;
		while(left<right){
			int area= (right-left)*Math.min(height[left], height[right]);
			maxArea = Math.max(area, maxArea);
			if(height[left] < height[right]){
			  do{
				left++;
			  } while (left < right && height[left-1] >= height[left]);
			}	 
			else{
			  do{
				 right--;
			   } while (right > left && height[right+1] >= height[right]);
			}
				
		}
		return maxArea;
	}

}
