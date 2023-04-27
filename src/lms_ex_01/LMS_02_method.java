/*
 	프로그램명 : 학사행정관리시스템 - 성적관리
 	작성자 : 홍길동
 	작성일자 : 2023.04.21
 	내용 : 기본타입 변수, 조건문을 활용한 프로그램 작성
 	
 	primitive type : 소문자를 시작하는 자료형은 무조건
 	reference type : 그 외 전부 객체
 	
 	- 정수형은 int, 실수형은 double, true or false는 boolean : 스택에 변수값 저장
 	
*/
package lms_ex_01;

import java.util.Scanner;

public class LMS_02_method {

	public static void main(StringEx[] args) {
		/*
		 	1. 국어, 영어, 수학 점수를 입력 받아 총점 및 평균을 산출하시오.
		 		- 변수 이름은 kor, eng, math, total, avg
		 		- 국어, 영어, 수학, 총점은 정수, 평균은 실수가 출력 되도록 하시오.
		 		- 조건으로 T를 입력하면 총점, A를 입력하면 평균이 산출이 되도록 하시오.
		 		- 조건은 char 타입 또는 String을 이용하시오.
		
				** 프로그래밍의 변수 또는 객체는 꼭 초기화 작업을 하고 사용
					- 메모리를 비우고 초기값을 설정하고 사용
					- 초기값을 뭐를 입력해야되는지?
					객체는 null 그 외 기본 타입은 상황에 맞게
		 */
		int kor, eng, math, total;
		double avg;
		
		kor = 50;
		eng = 50;
		math = 50;
		
		total = 0;		
		avg = 0.0;
		
		char sel = 'T'; //String sel = "T"; 로 입력 가능
		
	
		//정수 또는 실수 같은 숫자는 같다를 ==
		//같지 않다는 !=
		//문자(String)의 값이 같다는 equals
		//A = B;	B를 A에 집어 넣어라
		if(sel == 'T') { //if(sel.equals("T")
			//총점
			//글자와 숫자를 연결(붙일 때는) +
			//숫자 + 숫자 = 합
			disp();
			
			total = add(kor, eng, math);
			System.out.println(total + "점");
		} else {
			disp();
			avg = (kor + eng + math) / 3;
			
			System.out.println(avg);
		}

	}
	
	//화면출력 메소드
	public static void disp() {
		System.out.println("=======코리아아이티 성적관리시스템=======");
	}
	
	//kor + eng;
	//객체지향 : 메소드 오버로딩(이름은 같지만 타입이나 매개변수를 다르게 해서 표현하는 것)
	//overloading
	public static int add(int a, int b) {
		return a + b;
	}
	
	public static double add(double a, double b, double c) {
		return a + b + c;
	}
	
	public static int add(int a, int b, int c) {
		return a + b + c;
		
	}
	
	//기업 타이틀 메소드로 구현하기 : 반복 작업 또는 유지 보수를 편하게 하기 위해서
	//접근제한자 static void 메소드 이름() {내용} : 화면에 출력하는 결과가 sysout
	//접근제한자 static int 메소드 이름() {return 내용} : 화면에 출력하는 결과가 정수면
	//접근제한자 static double 메소드 이름() {return 내용} : 화면에 출력하는 결과가 실수면
	//접근제한자 static String 메소드 이름() {return 내용} : 화면에 출력하는 결과가 문자열이면

}








