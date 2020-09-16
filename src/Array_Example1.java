public class Array_Example1 {
	public static void main(String[] args) {
		int[] intArray1 = new int[100];
		
		for (int i = 0; i < intArray1.length; i++) {
			intArray1[i] = i + 1;
		}
		
		for (int i = 0; i < intArray1.length; i++) {
			System.out.println(intArray1[i]);		
		}
		
		
		int[] intArray2 = new int[100];
		
		for (int i : intArray2) {
			System.out.println(i);
		}
		
	}
}
