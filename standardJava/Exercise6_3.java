package standardJava;

public class Exercise6_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student2 s = new Student2();
		s.name ="È«±æµ¿";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		
		System.out.println("ÀÌ¸§ : "+s.name);
		System.out.println("ÃÑÁ¡ : "+s.getTotal());
		System.out.println("Æò±Õ : "+s.getAverage());
	}
}

class Student2{
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;	
	
	int getTotal() {
		return this.kor + this.eng + this.math;
	}
	
	float getAverage() {
		return (float)(getTotal()/3);
	}
}
