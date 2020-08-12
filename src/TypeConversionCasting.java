public class TypeConversionCasting {
	public static void main(String[] args) {
		System.out.println("Type Casting");
		System.out.println("바꾸고자 하는 형이 기존의 형보다 적은 데이터를 담을 수 있는 자료형의 경우");
		System.out.println("값 혹은 변수 앞에 (자료형)을 적어주면 강제적으로 형을 변환시킨다.");
		
		int x = 3;
		double y = x;
		
		double a = 3.14;
		int b = (int) a;
		
		int c = 9;
		int d = 5;
		System.out.println((double) c / d);
		
		
	}
}
