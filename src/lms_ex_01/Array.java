package lms_ex_01;

public class Array {

	public static void main(StringEx[] args) {
		//학생 100명의 국어점수를 저장하시오. 변수 score(scores)
		int[] scores = new int[5]; //인덱스 번호는 0번부터 시작 0,1,2...
		scores[0] = 100;
		scores[1] = 40;
		scores[2] = 80; 
		scores[3] = 80; 
		scores[4] = 80; 

		/*
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		System.out.println(scores[2]);                    
		*/                                 
	 
		//배열은 0번부터 시작
		int total = 0;
		
		System.out.println(scores.length);
		
		int tot = 0;
		for(int i = 0; i < scores.length; i++ ) {  //데이터타입 인덱스이름; 인덱스이름 < 배열개수; i++
			tot = tot + scores[i];
			
//			//하나씩 출력하기
//			System.out.println(scores[i]);                         
//			
//			//합계구하기       
//			total += scores[i];
		}                                     
//		System.out.println(total);
		System.out.println(tot);
		System.out.println();
		System.out.println("향상된 for(for each)");
		System.out.println();

		int result = 0;
		for(int jumsu : scores) {
			result = result + jumsu; //result += jumsu;
		}
		System.out.println("배열 값의 합 : " + result);		
		
		
	}

}
