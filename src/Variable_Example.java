public class Variable_Example {
	public static void main(String[] args) {
		// 변수 정의
		String name;
		int year;
		int month;
		int day;
		boolean married;
		
		// 값 대입
		name = "코드잇";
		year = 2015;
		month = 7;
		day = 20;
		married = false;
		
		// 자기소개
		System.out.print("이름: ");
		System.out.println(name);
		System.out.printf("생일: %d년 %d월 %d일", year, month, day);
		System.out.println("");
		System.out.print("결혼: ");
		System.out.println(married);
	}
}
