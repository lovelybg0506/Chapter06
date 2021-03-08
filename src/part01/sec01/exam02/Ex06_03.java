package part01.sec01.exam02;

import java.util.Scanner;

public class Ex06_03 {

	public static void main(String[] args) {
		// while(),Scanner
		
		int n=0;
		int i=0;
		double sum=0;
		
		Scanner s=new Scanner(System.in);


		System.out.println("0이 입력되면 반복문은 종료합니다.");
		System.out.println("정수값을 입력하세요==>");
		
		while((i=s.nextInt())!=0) {
			sum=sum+i;
			n++;	//하나하나 읽을때마다 n이 누적된다, 즉 갯수를 의미.
		}
		System.out.println("입력된 수의 개수는 "+n+"개 이며 평균은 "+sum/n+"입니다");
	
		s.close();
		
	}

}
