public class Operators {
	public static void main(String[] args) {
		String myString = "Hello " + "Codeit!!";
		System.out.println("Hello, I'm " + 27 + ".");
		
		System.out.println("���� ������");
		int a = 9;
		double b = 5;
		System.out.println(a + " + " + b + " = " + (a + b));
		System.out.println(a + " - " + b + " = " + (a - b));
		System.out.println(a + " x " + b + " = " + (a * b));
		System.out.println(a + " / " + b + " = " + (a / b)); // a�� b�� ���� ��(������ �Ҽ� �� ������ �Ҽ�������)
		System.out.println(a + " % " + b + " = " + (a % b)); // a�� b�� ���� ������
		// ���� �ٸ� �ڷ����� ������ ��ũ�� �� ���� �ڷ����� ������� ���´�.
		
		System.out.println("�� ������");
		System.out.println(3 + " > " + 2 + " : " + (3 > 2));
		System.out.println(3 + " < " + 2 + " : " + (3 < 2));
		System.out.println(3 + " >= " + 2 + " : " + (3 >= 2));
		System.out.println(3 + " <= " + 2 + " : " + (3 <= 2));
		System.out.println(3 + " == " + 2 + " : " + (3 == 2));
		System.out.println(3 + " != " + 2 + " : " + (3 != 2)); // a�� b�� �ٸ��� (!=)
		
		System.out.println("�Ҹ� ������ - and");
		System.out.println("true && true : " + (true && true));
		System.out.println("true && false : " + (true && false));
		System.out.println("false && true : " + (false && true));
		System.out.println("false && false : " + (false && false));
		
		System.out.println("�Ҹ� ������ - or");
		System.out.println("true || true : " + (true || true));
		System.out.println("true || false : " + (true || false));
		System.out.println("false || true : " + (false || true));
		System.out.println("false || false : " + (false || false));
		
		System.out.println("�Ҹ� ������ - not");
		System.out.println("!true : " + !true);
		System.out.println("!false : " + !false);
		
		System.out.println("���� ������");
		System.out.println("-a : " + -a);
		System.out.println("++a : " + ++a);
		System.out.println("--a : " + --a);
		
		System.out.println("The result is " + "\"" + false + "\"" + ".");
		// "�� ����Ʈ�� �� ǥ���ϰ��� �ϴ� "�տ� \�� �ٿ��ش�.
		// ���ڿ��� ���ڸ� ���ϸ� ���ڰ� ���ڿ���, ���ڿ��� �Ҹ��� ���ϸ� �Ҹ��� ���ڿ��� �ڵ����� �ٲ��.
		System.out.println("������ ��ŷ");
		System.out.println("���� --------------------------------------- ------����");
		System.out.println("double  -  float  -  long  -  int  -  short  -  byte");
		System.out.println("��ŷ ���� : ���� ���� �� �ִ� ����");
	}
}
