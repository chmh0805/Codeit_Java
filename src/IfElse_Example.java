public class IfElse_Example {
	public static void main(String[] args) {
		int a = 38, b = 27;
		
		if (a == b) {
			System.out.println("a�� b�� �����ϴ�. a = b = " + a);
		} else if (a != b) {
			System.out.println("a�� b�� ���� �ʽ��ϴ�.");
			if (a > b) {
				System.out.println("a�� b���� " + (a - b) + "��ŭ �� Ů�ϴ�.");
			} else {
				System.out.printf("b�� a���� %d��ŭ �� Ů�ϴ�.", b - a);
			}
		}
	}
}
