package part01.sec01.exam02;

public class Ex06_05 {

	public static void main(String[] args) {
		int a=100;
		
		while(a==200) {
			System.out.println("while문 내부에 들어왔습니다.");
		}

		do {
			System.out.println("do~while문 내부에 들어왔습니다.");
		}while(a==200); //선 처리 후 나중 비교 / true면 무한루프, false면 1번만 출력, 선처리후 나중비교이기 때문
						// 조건의 참과 거짓에 상관없이 최소 한번은 실행된다.
	}

}
