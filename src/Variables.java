public class Variables {
	public static void main(String[] args) {
		int age;
		age = 27;
		
		int num = 21;
		age = 26;
		
		// age = 22.4; �ٸ� �ڷ����� ���� �� ����.
		
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
		long myLong = 12345678910L; // long���� ������ �������� L�� �ٿ��ش�.
		
		double myDouble = 3.14;
		System.out.println(myDouble);
		
		String myString = "Codeit!!";
		
		System.out.println("hello!");
		
		String hello = "Hello, I'm ";
		String dot = "."; // String�� Ŭ�����̴�. (�⺻ �ڷ��� x)
		
		System.out.println(hello);
		System.out.println(age);
		System.out.println(dot);
		
		char a1 = 'a';
		char a2 = 97;
		char a3 = '\u0061';
		char a4 = '��'; // char�� �� ���� �ϳ��� �����ϸ�, ���� ����ǥ�� ���ڸ� �ѷ��ξ� �Ѵ�.
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		
		float f = 3.14f; // double(basic), float�� �Ҽ����̳�, float�� ��� �� ���� �ڿ� f�� �ٿ���� �Ѵ�.
		
		
	}
}
