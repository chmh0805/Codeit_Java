public class IfElse {
	public static void main(String[] args) {
		int temp = 30;
		/*
		if (temp < 10) {
			System.out.println("������ ��������.");
		} else {
			System.out.println("������ ���� ������.");
			
		}*/
		
		if (temp <= 5) {
			System.out.println("������ ���Ȱ� ������ ��������.");
		} else if (temp <= 10) {
			System.out.println("���Ȱ� ������ ��������.");
		} else if (temp <= 15) {
			System.out.println("������ ��������.");
		} else {
			System.out.println("������ ��������.");
		}
		
		int number = 13;
		if (number % 2 == 0) {
			System.out.println("even number");
		} else {
			System.out.println("odd number");
		}
		
		int x = 10;
		int y = 1;
		
		if (x != 10 || x % 2 != 0) {
			System.out.println(x);
		} else if (y == 1) {
			System.out.println(y);
		} 	else {
			System.out.println((x + y));
		}	
	}
}
