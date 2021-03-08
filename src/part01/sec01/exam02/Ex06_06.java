package part01.sec01.exam02;

import java.util.Scanner;

public class Ex06_06 {

	public static void main(String[] args) {
		int menu;
		Scanner s=new Scanner(System.in);
		
		do {
			System.out.printf("\n손님 주문 하시겠습니까?\n");
			System.out.printf("<1>카페라떼 <2>카푸치노 <3>아메리카노 <4>그만 시킬래요==>");
			
			menu=s.nextInt();
			switch(menu) {
			case 1:
				System.out.println("#카페라떼 주문하셨습니다.");
				break;
			case 2:
				System.out.println("#카푸치노 주문하셨습니다.");
				break;
			case 3:
				System.out.println("#카페라떼 주문하셨습니다.");
				break;
			case 4:
				System.out.println("주문하신 커피를 준비하겠습니다.");
				break;
			default:
				System.out.printf("번호를 다시 입력해주세요.");
			}
		}while(menu != 4); 	// 4번을 입력하면 선처리 나중비교이기 때문에 4번을 출력 후 break로 끝남.

		s.close();
	}

}
