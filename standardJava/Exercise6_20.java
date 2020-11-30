package standardJava;

public class Exercise6_20 {

	public static int max(int[] arr) {
		int max = 0;
		
		if(arr == null || arr.length == 0) {//¼ø¼­ ¹Ù²Ù¸é nullpointexception ³ª¿È 
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
		System.out.println("ÃÖ´ñ°ª:"+max(data));
		System.out.println("ÃÖ´ñ°ª:"+max(new int[] {}));//Å©±â°¡ 0ÀÎ ¹è¿­
		System.out.println("ÃÖ´ñ°ª:"+max(check));
		
	}

}
