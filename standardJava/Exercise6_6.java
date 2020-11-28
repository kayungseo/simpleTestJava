package standardJava;

class MyPoint {
	int x;
	int y;
	
	MyPoint(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	//�� �� (x, y)�� (x1, y1)���� �Ÿ��� ���Ѵ�. 
	double getDistance(int x1, int y1) {
		int xd = (int)Math.pow(this.x-x1, 2);//����
		int yd = (int)Math.pow(this.y-y1, 2);
		return Math.sqrt(xd+xd);
	}
}
public class Exercise6_6 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyPoint p = new MyPoint(1, 1);
		System.out.println(p.getDistance(2, 2));
	}

}
