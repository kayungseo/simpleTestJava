package standardJava;

//�߻� Ŭ���� �ۼ�

public class Ex7_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Unit[] group = {new Marine(), new Tank(), new DropShip()};
		
		for(int i=0;i<group.length;i++) {
			group[i].move(100, 200);
		}
	}

}

//�߻� Ŭ����
abstract class Unit{
	int x, y;
	abstract void move(int x, int y);
	void stop() {/*���� ��ġ�� ���� */}
}

class Marine extends Unit{
	void move(int x, int y) {
		System.out.println("Marine[x=" + x + ",y=" + y + "]");
	}
	
	void stimPack() {/*�������� ����Ѵ�.*/}
}

class Tank extends Unit{
	void move(int x, int y) {
		System.out.println("Tank[x=" + x + ",y=" + y + "]");
	}
	void changeMode() {
		/*
		  ���� ��带 ��ȯ�Ѵ�.
		 */
	}
}

class DropShip extends Unit{
	void move(int x, int y) {
		System.out.println("DropShip[x=" + x + ",y=" + y + "]");
	}
	void load() {
		/*
		  ���õ� ����� �¿��.
		 */
	}
	void reload() {
		/*
		  ���õ� ����� ������.
		 */
	}
}


