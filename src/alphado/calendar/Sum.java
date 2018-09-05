package alphado.calendar;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("두 수를 입력하시오 : ");
		int m=sc.nextInt();
		int n=sc.nextInt();
		
//		int sum = m+n;
//		System.out.println("두 수의 합은 : "+sum+"입니다.");
		
		// 또는
		System.out.printf("%d와 %d의 합은 %d입니다.",m,n,m+n);
		sc.close(); // 습관적으로 해주어야 한다.
	}
}
