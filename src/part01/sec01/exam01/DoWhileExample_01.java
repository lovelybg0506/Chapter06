package part01.sec01.exam01;

import java.util.Scanner;

public class DoWhileExample_01 {

	public static void main(String[] args) {
		System.out.println("메시지를 입력하세요:");
		System.out.println("프로그램을 종료하려면 q를 입력하세요.");
		
		Scanner s=new Scanner(System.in);
		String inputString;
	
		
		do {
			System.out.print(">");
			inputString=s.nextLine();
			System.out.println(inputString);
		}while(!inputString.equals("q")); // .equals = 앞에거 와 뒤에거 비교후 같으면 true, 다르면 false
											// 근데 앞에 !가 붙어있으므로 반대
		
		System.out.println();
		System.out.println("프로그램 종료");
		
	}

}
