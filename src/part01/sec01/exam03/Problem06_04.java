package part01.sec01.exam03;

import java.util.Scanner;

public class Problem06_04 {
	// 1부터 100사이의 수를 하나 선택한다
	// 컴퓨터가 만들어낸 랜덤 숫자를 맞추면 ?번만에 맞추셨습니다. 출력
	// while.if~else
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int count=0;
		int input=0;
		int comnumber=(int)(Math.random()*100)+1;
		
		while(true) {
			System.out.printf("컴퓨터 수:");
			input=s.nextInt();
			count++;
			
			if(input<comnumber)
			System.out.println("더 높은 수 입니다.");
			else if(input>comnumber)
			System.out.println("더 낮은 수 입니다");
			else if(input==comnumber)
				break;
				
		}

		System.out.printf("%d번만에 맞았습니다.",count);
		s.close();
	}

}

/* 선생님이 하신것

		if(comnumber==input){
			break;
		}else if(comnumber>input){
		System.out.println("up입니다.");
		}else {
		System.out.println("down입니다.");
		}
	}
system.out.println(count+"번만에 맞추셨습니다.");
s.close();
*/