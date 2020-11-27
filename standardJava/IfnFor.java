package standardJava;

import java.io.Console;
import java.util.Scanner;

public class IfnFor {

	public static void main(String[] args) {
		/*
		int sum=0;
		int i=0;
		while(sum<100) {
			i++;
			if(i%2!=0) {
				sum += i;
			}else {
				sum -= i;
			}
		}
		System.out.println("몇까지 이렇게 더해야 100이상이 될까? "+ i);
		*/
	
		/*
		int l=1;
		while(l<=10) {
			int s=1;
			while(s<=l) {
				System.out.print("*");
				s++;
			}
			System.out.println();
			l++;
		}
		*/
		
		/*
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=6;j++) {
				if(i+j==6) {
					System.out.println(i+","+j);
				}
			}
		}
		*/
		
		/*
		String str="12345";
		int sum=0;
		
		for(int i=0;i<str.length();i++) {
			sum += Character.getNumericValue(str.charAt(i));
		}
		System.out.println(sum);
		*/
		
		/*
		int value = (int)(Math.random() * 6) + 1;
		System.out.println(value);
		*/
		
		/*
		int num = 12345;
		int sum = 0;
		
		String temp = Integer.toString(num);
		
		for(int i=0;i<temp.length();i++) {
			sum += Character.getNumericValue(temp.charAt(i));
		}
		System.out.println(sum);
		*/
		
		/*
		int answer = (int)(Math.random() * 100) + 1;
		int input = 0;
		int count = 0;
		
		Scanner s = new Scanner(System.in);
		
		do {
			count++;
			System.out.println("1와 100사이의 값을 입력하세요: ");
			input = s.nextInt();
			
			if(input > answer) {
				System.out.println("좀 더 작은 값을 입력하세요");
			}else if(input < answer) {
				System.out.println("좀 더 큰 값을 입력하세요");
			}else {
				System.out.println("맞췄습니다!");
				break;
			}
		}while(true);
		*/
		
		
	}

}
