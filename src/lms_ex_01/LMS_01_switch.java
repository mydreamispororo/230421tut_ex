package lms_ex_01;

/*
 	switch ~ case ~ break ~ (default);
 	: 조건 - 등호(==, >=, <=) 부등호를 쓸 수 없음
 */


public class LMS_01_switch {

	public static void main(StringEx[] args) {
		//T면 총점, A면 평균, 이 외에는 시스템 종료
		char sel = 'A';
		int i = 1;
		
		switch(i) {
			case 1:
				System.out.println("총점을 출력합니다.");
				break;
				
			case 2:
				System.out.println("평균을 출력합니다.");
				break;
				
			default:
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
		}

	}

}
