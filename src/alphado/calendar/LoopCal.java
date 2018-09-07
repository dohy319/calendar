package alphado.calendar;

import java.util.Scanner;

public class LoopCal {
	public static void main(String[] args) {
		
//		반복입력을 받을 수 있게 구현한다.
//		입력하는 곳 앞에 프롬프트를 출력한다.
//		-1일 입력받을 경우 프로그램을 종료한다.
		
		// 입력 객체 생성
		Scanner sc = new Scanner(System.in);
		
		while(true) { // 반복문걸기
			System.out.println("월을 입력하세요.");
			System.out.print("> "); // 프롬프트 출력
			int month = sc.nextInt(); // 사용자 입력받아 month변수에 담기
		
			int []day= {31,28,31,30,31,30,31,31,30,31,30,31}; // 해당 월 일수 배열 담기
			if(1<=month && month<=12) { // 1보다 같거나 크고, 12보다 작거나 같을때
				System.out.println(month+"월은 "+day[month-1]+"일까지 있습니다.");
				System.out.println();
			}else if(month==-1) { // -1을 입력받았을 때 종료
				System.out.println("종료합니다.");
				break; // 종료부분
			}else
				System.out.println("1~12의 숫자를 다시 입력하시오."); // 1~12, -1 이외의 숫자가 입력되었을때 다시 입력하라는 문구 출력
		}
	} 
}
