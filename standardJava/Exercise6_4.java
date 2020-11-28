package standardJava;

public class Exercise6_4 {
	
	//두 점 (x, y)와 (x1, y1)간의 거리를 구한다. 
	static double getDistance(int x, int y, int x1, int y1) {
		int xd = (int)Math.pow(x-x1, 2);//제곱
		int yd = (int)Math.pow(y-y1, 2);
		return Math.sqrt(xd+xd);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getDistance(1, 1, 2, 2));
	}

}
