package standardJava;

import java.util.Scanner;

public class Charpter5Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int[] arr = {10, 20, 30, 40, 50};
		int sum = 0;
		
		for(int i=0;i<arr.length;i++) {
			sum += arr[i];
		}
		System.out.println(sum);
		*/
		
		/*
		//2���� �迭�� ��� ���� ���հ� ��� 
		int[][] arr = {
				{5, 5, 5, 5, 5},
				{10, 10, 10, 10, 10},
				{20, 20, 20, 20, 20},
				{30, 30, 30, 30, 30}
				};
		int total = 0;
		float average = 0;
		
		int count=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				total += arr[i][j];
				count++;
			}
		}
		average = total / (float)count;
		System.out.println("total=" + total);
		System.out.println("average=" + average);
		*/
		
		/*
		//1�� 9������ �ߺ����� ���� ���ڷ� �̷���� 3�ڸ� ���ڸ� ������ ���α׷� 
		int[] ballArr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] ball3 = new int[3];
		
		//�迭ballArr�� ������ ��Ҹ� ��� ��ġ�� �ٲ۴�. 
		for(int i=0;i<ballArr.length;i++) {
			int j = (int)(Math.random() * ballArr.length);
			int tmp = 0;
			
			//1.
			tmp = ballArr[j];
			ballArr[j] = ballArr[i];
			ballArr[i] = tmp;
		}
		
		//2.ballArr�� �տ��� 3���� ���� �迭 ball3���� �����Ѵ�. 
		for(int i=0;i<3;i++) {
			ball3[i] = ballArr[i];
		}
		
		for(int i=0;i<ball3.length;i++) {
			System.out.print(ball3[i]);
		}
		*/
		
		//�ܾ��� ������ġ�� ��� �����ְ� ������ �ܾ ���ߴ� ����
		String[] words = {"television", "computer", "mouse", "phone"};
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0;i<words.length;i++) {
			char[] question = words[i].toCharArray();
			
			//1. 
			for(int j=0;j<question.length;j++) {
				int k = (int)(Math.random() * question.length);
				char tmp = ' ';
				
				//random���� ���� �ٲٱ� 
				tmp = question[k]; 
				question[k] = question[j];
				question[j] = tmp;
			}
			System.out.println(question);
			System.out.printf("Q%d. %s�� ������ �Է��ϼ��� : ", i+1, new String(question));//@@ String �ν��Ͻ� ����!! 
			String answer = scanner.nextLine();
			
			if(words[i].equals(answer.trim())) {//�¿�������� �� �� @@ 
				System.out.println("�¾ҽ��ϴ�!!\n\n");
			}else {
				System.out.println("Ʋ�Ƚ��ϴ�!!\n\n");
			}
			
		
		}
	}

}
