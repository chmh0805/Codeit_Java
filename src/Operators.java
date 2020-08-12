public class Operators {
	public static void main(String[] args) {
		String myString = "Hello " + "Codeit!!";
		System.out.println("Hello, I'm " + 27 + ".");
		
		System.out.println("숫자 연산자");
		int a = 9;
		double b = 5;
		System.out.println(a + " + " + b + " = " + (a + b));
		System.out.println(a + " - " + b + " = " + (a - b));
		System.out.println(a + " x " + b + " = " + (a * b));
		System.out.println(a + " / " + b + " = " + (a / b)); // a를 b로 나눈 몫(정수와 소수 간 연산은 소수점까지)
		System.out.println(a + " % " + b + " = " + (a % b)); // a를 b로 나눈 나머지
		// 서로 다른 자료형의 연산은 랭크가 더 높은 자료형의 결과값을 갖는다.
		
		System.out.println("비교 연산자");
		System.out.println(3 + " > " + 2 + " : " + (3 > 2));
		System.out.println(3 + " < " + 2 + " : " + (3 < 2));
		System.out.println(3 + " >= " + 2 + " : " + (3 >= 2));
		System.out.println(3 + " <= " + 2 + " : " + (3 <= 2));
		System.out.println(3 + " == " + 2 + " : " + (3 == 2));
		System.out.println(3 + " != " + 2 + " : " + (3 != 2)); // a와 b가 다르다 (!=)
		
		System.out.println("불린 연산자 - and");
		System.out.println("true && true : " + (true && true));
		System.out.println("true && false : " + (true && false));
		System.out.println("false && true : " + (false && true));
		System.out.println("false && false : " + (false && false));
		
		System.out.println("불린 연산자 - or");
		System.out.println("true || true : " + (true || true));
		System.out.println("true || false : " + (true || false));
		System.out.println("false || true : " + (false || true));
		System.out.println("false || false : " + (false || false));
		
		System.out.println("불린 연산자 - not");
		System.out.println("!true : " + !true);
		System.out.println("!false : " + !false);
		
		System.out.println("단항 연산자");
		System.out.println("-a : " + -a);
		System.out.println("++a : " + ++a);
		System.out.println("--a : " + --a);
		
		System.out.println("The result is " + "\"" + false + "\"" + ".");
		// "를 프린트할 땐 표시하고자 하는 "앞에 \을 붙여준다.
		// 문자열과 숫자를 더하면 숫자가 문자열로, 문자열과 불린을 더하면 불린이 문자열로 자동으로 바뀐다.
		System.out.println("숫자형 랭킹");
		System.out.println("강함 --------------------------------------- ------약함");
		System.out.println("double  -  float  -  long  -  int  -  short  -  byte");
		System.out.println("랭킹 기준 : 값을 가질 수 있는 범위");
	}
}
