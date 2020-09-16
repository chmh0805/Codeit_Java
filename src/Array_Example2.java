public class Array_Example2 {
	public static void main(String[] args) {
		String[] fruitsArray = new String[5];
		
		fruitsArray[0] = "딸기";
		fruitsArray[1] = "당근";
		fruitsArray[2] = "수박";
		fruitsArray[3] = "참외";
		fruitsArray[4] = "메론";
		
		for (String fruit : fruitsArray) {
			System.out.println(fruit);
		}
		
	}
}
