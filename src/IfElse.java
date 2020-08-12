public class IfElse {
	public static void main(String[] args) {
		int temp = 30;
		/*
		if (temp < 10) {
			System.out.println("자켓을 입으세요.");
		} else {
			System.out.println("자켓을 입지 마세요.");
			
		}*/
		
		if (temp <= 5) {
			System.out.println("내복과 긴팔과 자켓을 입으세요.");
		} else if (temp <= 10) {
			System.out.println("긴팔과 자켓을 입으세요.");
		} else if (temp <= 15) {
			System.out.println("긴팔을 입으세요.");
		} else {
			System.out.println("반팔을 입으세요.");
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
