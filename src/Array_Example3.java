public class Array_Example3 {
	public static void main(String[] args) {
		int[] intArray = new int[30];
		
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = i + 1001;
		}
		
		String[] remainders = {"Zero", "One", "Two", "Three"};
		
		for (int i : intArray) {
			System.out.println(remainders[i % 4]);
		}
	}
}