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
		System.out.println("����� �̷��� ���ؾ� 100�̻��� �ɱ�? "+ i);
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
			System.out.println("1�� 100������ ���� �Է��ϼ���: ");
			input = s.nextInt();
			
			if(input > answer) {
				System.out.println("�� �� ���� ���� �Է��ϼ���");
			}else if(input < answer) {
				System.out.println("�� �� ū ���� �Է��ϼ���");
			}else {
				System.out.println("������ϴ�!");
				break;
			}
		}while(true);
		*/
		
		
	}

}
