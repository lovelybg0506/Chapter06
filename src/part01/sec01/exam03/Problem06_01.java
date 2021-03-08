package part01.sec01.exam03;

import java.util.Scanner;

public class Problem06_01 {
	// Scanner, while, if
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int start,end;
		int i,basu;
		int hap=0;
		
		System.out.printf("합계의 시작값==>"); // 1
		start = s.nextInt();
		System.out.printf("합계의 끝값==>"); // 20
		end = s.nextInt();
		System.out.printf("배수==>"); // 3
		basu = s.nextInt();
		
		i=start;
		while(i <= end) {
			if(i%basu == 0)
				hap+=i;
				i++;
			}
		System.out.printf("%d부터 %d까지의 %d배수의 합계==>%d\n",start,end,basu,hap);
		
		s.close();

			}
	
	}


//if((i>=start&&i<=end)) 
//	if(i%basu==0) 
//		hap=hap+i;
// 내가한것 틀렸지만 비슷