package alphado.calendar;

import java.util.Scanner;

public class Calendar {
	
	private static final int[] day= {31,28,31,30,31,30,31,31,30,31,30,31};
	
	public int getMaxDaysofMonth(int month) {
		return day[month-1];
	}
	public static void main(String[] args) {

		System.out.println(" 일   월   화    수    목    금    토");
		System.out.println("---------------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
		
		// 숫자를 입력받아 해당하는 달의 일수 출력하기.
		Scanner sc = new Scanner(System.in);
		Calendar cal = new Calendar();
		System.out.println("달을 입력하세요.");
		int month = sc.nextInt();
		
	//	System.out.printf("%d월은 %d일까지 있습니다.\n",month, cal.getMaxDaysofMonth(month));
		
		System.out.println(month+"월은 "+cal.getMaxDaysofMonth(month)+"일까지 있습니다.");
		
	}
}
