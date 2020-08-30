public class For {
	public static void main(String[] args) {
		int sum = 0; // sum은 for문 밖에서 정해졌으므로 밖에서도 사용가능 !
		for (int i = 1; i <= 5; i++) { // i는 for문 안에서 정해졌으므로 for문 밖에서는 사용불가 !
			sum += i;
		}
		System.out.println(sum);
	}
}
