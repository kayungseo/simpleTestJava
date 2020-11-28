package standardJava;

import java.util.Arrays;

public class Exercise6_17 {

	//shuffle 메서드 작성 
	public static int[] shuffle(int[] nums) {
		
		for(int i=0;i<nums.length;i++) {
			int index = (int)(Math.random() * nums.length);
			int tmp = 0;
			
			tmp  = nums[index];
			nums[index] = nums[i];
			nums[i] = tmp;
		}
		
		return nums;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] original = {1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(original));
		
		int[] result = shuffle(original);
		System.out.println(Arrays.toString(result));
	}
	

}
