package standardJava;

public class Exercise6_20 {

	public static int max(int[] arr) {
		int max = 0;
		
		if(arr == null || arr.length == 0) {//���� �ٲٸ� nullpointexception ���� 
			return -99999;
		}else {
			for(int i=0;i<arr.length;i++) {
				if(max < arr[i]) {
					max = arr[i];
				}
			}
		}
		
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {3, 2, 9, 4, 7};
		int[] check = null;
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("�ִ�:"+max(data));
		System.out.println("�ִ�:"+max(new int[] {}));//ũ�Ⱑ 0�� �迭
		System.out.println("�ִ�:"+max(check));
		
	}

}
