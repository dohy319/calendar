package alphado.calendar;

import java.util.Scanner;

public class VirtualOutput {
	public static void main(String[] args) {
//		월을 입력하면 해당월의 달력을 출력한다.
//		달력은 모양은 1단계에서 작성한 모양으로 만든다.
//		1일은 일요일로 정해도 무방하다.
//		-1을 입력받기 전까지 반복 입력받는다.
//		프롬프트를 출력한다.
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("원하는 달력의 월을 입력하시오 > ");
			int month = sc.nextInt();
			System.out.println();
 
			if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12) {
				System.out.println(" 일   월   화   수    목    금    토");
				System.out.println(" 1  2  3  4  5  6  7");
				System.out.println(" 8  9 10 11 12 13 14");
				System.out.println("15 16 17 18 19 20 21");
				System.out.println("22 23 24 25 26 27 28");
				System.out.println("29 30 31");
				System.out.println();
			}else if(month==4 || month==6 || month==9 || month==11) {
				System.out.println(" 일   월   화   수    목    금    토");
				System.out.println(" 1  2  3  4  5  6  7");
				System.out.println(" 8  9 10 11 12 13 14");
				System.out.println("15 16 17 18 19 20 21");
				System.out.println("22 23 24 25 26 27 28");
				System.out.println("29 30");
				System.out.println();
			}else if(month==2) {
				System.out.println(" 일   월   화   수    목    금    토");
				System.out.println(" 1  2  3  4  5  6  7");
				System.out.println(" 8  9 10 11 12 13 14");
				System.out.println("15 16 17 18 19 20 21");
				System.out.println("22 23 24 25 26 27 28");
				System.out.println();
			}else if(month==-1) {
				System.out.println("종료합니다.");
				break;
			}else {
				System.out.println("1~12 또는 -1을 입력하십시요.");
				System.out.println();
			}
		}
	}
}
