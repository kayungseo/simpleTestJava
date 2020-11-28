package standardJava;

public class Exercise6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student("ȫ�浿", 1, 1, 100, 60, 76);
		
		String info = s.info();
		System.out.println(info);
	}

}

class Student{
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	Student(String name, int ban, int no, int kor, int eng, int math){
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this. math = math;
	}
	
	String info() {
		int sum = this.kor + this.eng+this.math;
		float avg = (float) (sum/3);
		return name+","+ban+","+no+","+kor+","+eng+","+sum+","+avg;
	}
	
	
}
