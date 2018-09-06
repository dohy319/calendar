package alphado.calendar;

import java.util.Scanner;

public class InputCycle {
	public static void main(String[] args) {
		// 반복 입력이 가능한 프로그램 작성
		// 반복 횟수를 입력하고 해당 횟수만큼 월 숫자를 입력하면 해당 월의 일짜수 출력
		Scanner sc= new Scanner(System.in);
		
		System.out.println("반복 횟수를 입력하세요.");
		int cycle = sc.nextInt();
		
		System.out.println("월을 입력하세요.");
		int []month = new int[cycle];
		for(int i=0; i<month.length; i++) {
			month[i] = sc.nextInt();
		} 

		int[] day = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		for(int i=0; i<month.length; i++) {
		System.out.println(day[month[i]-1]);
		}
	}
}

 
