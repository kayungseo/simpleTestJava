package standardJava;

public class Exercise6_4 {
	
	//�� �� (x, y)�� (x1, y1)���� �Ÿ��� ���Ѵ�. 
	static double getDistance(int x, int y, int x1, int y1) {
		int xd = (int)Math.pow(x-x1, 2);//����
		int yd = (int)Math.pow(y-y1, 2);
		return Math.sqrt(xd+xd);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getDistance(1, 1, 2, 2));
	}

}
