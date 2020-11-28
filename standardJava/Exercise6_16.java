package standardJava;

public class Exercise6_16 {

	public static void change(String str) {// 지역변수는 메서드를 벗어나면 없어진다. 
		str += "456";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ABC123";
		System.out.println(str);
		change(str);
		System.out.println("After change: "+ str);
		//Exercise6_16 ex16 = new Exercise6_16(); 
		//ex16.change(str);//main 메소드의 지역변수
		//System.out.println(str);
	}

}
