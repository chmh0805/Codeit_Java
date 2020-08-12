public class Variables {
	public static void main(String[] args) {
		int age;
		age = 27;
		
		int num = 21;
		age = 26;
		
		// age = 22.4; 다른 자료형을 담을 수 없음.
		
		age = num;
		age = age + 1;
		
		System.out.print("Hello, I'm ");
		System.out.print(age);
		System.out.println(".");
		
		System.out.println(age + num);
		
		System.out.printf("Hi, I'm %d.", age);
		System.out.println(' ');
		boolean myBoolean = true;
		myBoolean = false;
		
		int myInt = 123;
		long myLong = 12345678910L; // long형은 숫자의 마지막에 L을 붙여준다.
		
		double myDouble = 3.14;
		System.out.println(myDouble);
		
		String myString = "Codeit!!";
		
		System.out.println("hello!");
		
		String hello = "Hello, I'm ";
		String dot = "."; // String은 클래스이다. (기본 자료형 x)
		
		System.out.println(hello);
		System.out.println(age);
		System.out.println(dot);
		
		char a1 = 'a';
		char a2 = 97;
		char a3 = '\u0061';
		char a4 = '가'; // char은 딱 글자 하나만 가능하며, 작은 따옴표로 글자를 둘러싸야 한다.
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		
		float f = 3.14f; // double(basic), float은 소수형이나, float을 사용 시 숫자 뒤에 f를 붙여줘야 한다.
		
		
	}
}
