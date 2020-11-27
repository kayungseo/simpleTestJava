package top50;

import java.util.Stack;

/*
public class DailyTemperature {

	public static void main(String[] args) {
	
		int[] nums = new int[] {73, 74, 75, 71, 69, 72, 76, 73};
		int[] result = new int[nums.length];
		DailyTemperature a = new DailyTemperature();
		result = a.solve(nums, result);
		for(int i : result) {
			System.out.println(i);
		}
	
	}
	
	public int[] solve(int[] nums, int[] result) {
		
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]<nums[j]) {
					result[i]=j-i;
					break;
				}
			}
		}
		return result;
		
	}
}
*/

public class DailyTemperature {

	public static void main(String[] args) {
	
		int[] nums = new int[] {73, 74, 75, 71, 69, 72, 76, 73};
		int[] res = dailyTemperatures(nums);
		for(int i:res) {
			System.out.println(i);
		}
	
	}

	private static int[] dailyTemperatures(int[] temper) {
		//1
		Stack<Integer> stack = new Stack<>();
		int[] result = new int[temper.length];
		
		//2
		for(int i=0;i<temper.length;i++) {
			while(!stack.isEmpty() && temper[stack.peek()]<temper[i]) {
				int index = stack.pop();
				result[index] = i-index;
			}
			
			stack.push(i);
		}
		return result;
	}
	
	
}