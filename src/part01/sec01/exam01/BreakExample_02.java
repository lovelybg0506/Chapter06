package part01.sec01.exam01;

public class BreakExample_02 {

	public static void main(String[] args) {

		while(true) {
			int num=(int)(Math.random()*6)+1;	// 1~6
			System.out.println(num);
			
			if(num == 6)
				break;
		
		}
		System.out.println("프로그램 종료");
	}

}
