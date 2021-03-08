package part01.sec01.exam03;

import java.util.Scanner;

public class Problem06_03 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str;
		char ch;
		int i,k;
		int star;
		
		System.out.println("숫자를 여러개 입력: ");
		str=s.nextLine();  // 숫자를 입력하라고 했지만 str타입이라 문자열로 들어감.
		
		i=0;
		ch=str.charAt(0);
		
		while(true) { //무한반복
			star=ch-48;
			for(k=0;k<star;k++)
				System.out.printf("*");
			System.out.printf("\n");
			i++;
			if(i>=str.length()-1)
				break;
			ch=str.charAt(i);
		
		}
		s.close();
	}

}
