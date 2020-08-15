public class While {
	public static void main(String[] args) {
		int sum = 0, i = 1;
		
		while (sum < 10000) {
			sum += i;
			i++;
		}
			
		System.out.println(sum);
		System.out.println(i - 1);
		
		System.out.printf("1부터 %d까지 합은 %d입니다.", --i, sum);
	}
}
