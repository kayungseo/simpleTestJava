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
		//2차원 배열에 담긴 값의 총합과 평균 
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
		//1과 9사이의 중복되지 않은 숫자로 이루어진 3자리 숫자를 만들어내는 프로그램 
		int[] ballArr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] ball3 = new int[3];
		
		//배열ballArr의 임의의 요소를 골라서 위치를 바꾼다. 
		for(int i=0;i<ballArr.length;i++) {
			int j = (int)(Math.random() * ballArr.length);
			int tmp = 0;
			
			//1.
			tmp = ballArr[j];
			ballArr[j] = ballArr[i];
			ballArr[i] = tmp;
		}
		
		//2.ballArr의 앞에서 3개의 수를 배열 ball3으로 복사한다. 
		for(int i=0;i<3;i++) {
			ball3[i] = ballArr[i];
		}
		
		for(int i=0;i<ball3.length;i++) {
			System.out.print(ball3[i]);
		}
		*/
		
		//단어의 글자위치를 섞어서 보여주고 원래의 단어를 맞추는 예제
		String[] words = {"television", "computer", "mouse", "phone"};
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0;i<words.length;i++) {
			char[] question = words[i].toCharArray();
			
			//1. 
			for(int j=0;j<question.length;j++) {
				int k = (int)(Math.random() * question.length);
				char tmp = ' ';
				
				//random으로 문자 바꾸기 
				tmp = question[k]; 
				question[k] = question[j];
				question[j] = tmp;
			}
			System.out.println(question);
			System.out.printf("Q%d. %s의 정답을 입력하세요 : ", i+1, new String(question));//@@ String 인스턴스 생성!! 
			String answer = scanner.nextLine();
			
			if(words[i].equals(answer.trim())) {//좌우공백제거 후 비교 @@ 
				System.out.println("맞았습니다!!\n\n");
			}else {
				System.out.println("틀렸습니다!!\n\n");
			}
			
		
		}
	}

}
