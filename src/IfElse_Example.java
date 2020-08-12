public class IfElse_Example {
	public static void main(String[] args) {
		int a = 38, b = 27;
		
		if (a == b) {
			System.out.println("a와 b가 같습니다. a = b = " + a);
		} else if (a != b) {
			System.out.println("a와 b는 같지 않습니다.");
			if (a > b) {
				System.out.println("a가 b보다 " + (a - b) + "만큼 더 큽니다.");
			} else {
				System.out.printf("b가 a보다 %d만큼 더 큽니다.", b - a);
			}
		}
	}
}
