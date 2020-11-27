package top50;


public class MoveZeros{
	public static void main(String args[]) {
		int nums[] = {0, 3, 2, 0, 8, 5};
		int index = 0;
		
		/*
		for(int i=0;i<nums.length;i++) {
			if(nums[i] == 0) {
				index++;
			}else {
				nums[i-index] = nums[i];
			}
		}
		int num = 1;
		for(int j=0;j<index;j++) {
			nums[nums.length-num] = 0;
			num++;
		}
		System.out.println(nums);
		 
		 */
		
		for(int i=0;i<nums.length;i++) {
			if(nums[i] != 0) {
				nums[index] = nums[i];
				index++;
				System.out.println("index "+index);
			}
		}
		while(index<nums.length) {
			nums[index]=0;
			index++;
		}
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
	}
	
}
