package top50;

public class TwoSum {

	public static void main(String[] args) {
		int[] nums = {8,7,11,3};
        int target =10;
        TwoSum a = new TwoSum();//result;
        int[] result = a.solve(nums, target);
        for(int i : result) {
        	System.out.println(i);
        }
        
	}
	

	public int[] solve(int[] nums, int target) {
		
		int[] result = new int[2];
		
		for(int i=0;i<nums.length;i++) {
        	for(int j=i+1;j<nums.length;j++) {
        		if(target - nums[i] == nums[j]) {
        			result[0] = i+1;
        			result[1] = j+1;
        		}
        	}
        }
			
		return result;
		
		
		
		
		
		
	}
}
