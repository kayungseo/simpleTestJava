package standardJava;

public class Exercise6_16 {

	public static void change(String str) {// ���������� �޼��带 ����� ��������. 
		str += "456";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ABC123";
		System.out.println(str);
		change(str);
		System.out.println("After change: "+ str);
		//Exercise6_16 ex16 = new Exercise6_16(); 
		//ex16.change(str);//main �޼ҵ��� ��������
		//System.out.println(str);
	}

}
