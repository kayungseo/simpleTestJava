package standardJava;

public class Exercise6_18 {
	
	static boolean isNumber(String str) {
		if(str.isEmpty() || str.equals("")) {
			return false;
		}
		for(int i=0;i<str.length();i++) {
			if(48 > str.charAt(i) || str.charAt(i) > 57) {//유니코드로 비교 
				return false;
			}
		}
		return true;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "123";
		System.out.println(str + "는 숫자입니까? " + isNumber(str));
		
		str="1234o";
		System.out.println(str +"는 숫자입니까? "+ isNumber(str));
	}

}
