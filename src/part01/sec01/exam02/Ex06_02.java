package part01.sec01.exam02;

public class Ex06_02 {

	public static void main(String[] args) {
		// 1부터 10까지의 합
		
		int i=1;
		int hap=0;
		
		while(i<=10) {
			hap=hap+i;
			i++;
			
		}
		System.out.printf("1~10의 합 : %d\n",hap);  // 이 출력문이 while중괄호 안에 들어가면 누적값이 다 나옴
	}

}
