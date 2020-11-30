package standardJava;

//추상 클래스 작성

public class Ex7_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Unit[] group = {new Marine(), new Tank(), new DropShip()};
		
		for(int i=0;i<group.length;i++) {
			group[i].move(100, 200);
		}
	}

}

//추상 클래스
abstract class Unit{
	int x, y;
	abstract void move(int x, int y);
	void stop() {/*현재 위치에 정지 */}
}

class Marine extends Unit{
	void move(int x, int y) {
		System.out.println("Marine[x=" + x + ",y=" + y + "]");
	}
	
	void stimPack() {/*스팀팩을 사용한다.*/}
}

class Tank extends Unit{
	void move(int x, int y) {
		System.out.println("Tank[x=" + x + ",y=" + y + "]");
	}
	void changeMode() {
		/*
		  공격 모드를 소환한다.
		 */
	}
}

class DropShip extends Unit{
	void move(int x, int y) {
		System.out.println("DropShip[x=" + x + ",y=" + y + "]");
	}
	void load() {
		/*
		  선택된 대상을 태운다.
		 */
	}
	void reload() {
		/*
		  선택된 대상을 내린다.
		 */
	}
}


