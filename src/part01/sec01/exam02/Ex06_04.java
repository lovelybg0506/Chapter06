package part01.sec01.exam02;

import java.io.IOException;
import java.util.Scanner;

public class Ex06_04 {

	public static void main(String[] args) throws IOException {
		// 키보드로부터 두 개 의 정수를 입력 받고, 연산자도(+,-,*,/,%) 입력(문자) 받는다.
		// while(무한루프)강제 종료 ,switch,Scanner
		 
		int a,b;
		char ch;
		Scanner s=new Scanner(System.in);

		while(true) {	// while 을 없애면 무한루프가 사라지고 한번만 실행됨.
		System.out.print("첫번째 수 입력");
		a=s.nextInt();
		System.out.print("두번째 수 입력");
		b=s.nextInt();
		System.out.println("계산할 연산자를 입력하세요:");
		ch=(char) System.in.read();	// throws IOException 입력과 출력에 대한 예외처리를 던지겠다
									// 문법상 맞춰만 놓으면 JVM이 알아서 처리해줌.		
		switch(ch) {
		case '+' : 
			System.out.printf("%d+%d=%d입니다\n",a,b,a+b);
			break;
		case '-' : 
			System.out.printf("%d-%d=%d입니다\n",a,b,a-b);
			break;
		case '*' : 
			System.out.printf("%d*%d=%d입니다\n",a,b,a*b);
			break;
		case '/' : 
			System.out.printf("%d/%d=%d입니다\n",a,b,a/b);
			break;
		case '%' : 
			System.out.printf("%d%%%d=%d입니다\n",a,b,a%b);
			break;
		default:
			System.out.println("연산자를 잘 못 입력했습니다.\n");
			}
		}

	}

}
