package part01.sec01.exam03;

import java.util.Scanner;

public class Problem06_02 {
	
	// do~while,Scanner nextLine, if
	// 키보드로부터 영문 대문자,소문자,숫자(문자)를 입력 받아서 각각 입력된 갯수를 구함.
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str;
		char ch;
		int upper_cnt=0; // 대문자 갯수체크.
		int lower_cnt=0; // 소문자 갯수체크.
		int digit_cnt=0; // 숫자 갯수체크.
		int i;
		
		System.out.printf("문자열 입력");
		str=s.nextLine();
		i=0;
		do {
			ch=str.charAt(i); // 이부분 못썼다
			if(ch>='A'&&ch<='Z')
				upper_cnt++;
			if(ch>='a'&&ch<='z')
				lower_cnt++;
			if(ch>='0'&&ch<='9')
				digit_cnt++;
			i++;		// 배열 다음번호 대입하기위함.
		
		}while(i<str.length());
		
		
		System.out.printf("대문자 %d개, 소문자 %d개, 숫자 %d개",upper_cnt,lower_cnt,digit_cnt);
		
		

	}

}
