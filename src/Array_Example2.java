public class Array_Example2 {
	public static void main(String[] args) {
		String[] fruitsArray = new String[5];
		
		fruitsArray[0] = "����";
		fruitsArray[1] = "���";
		fruitsArray[2] = "����";
		fruitsArray[3] = "����";
		fruitsArray[4] = "�޷�";
		
		for (String fruit : fruitsArray) {
			System.out.println(fruit);
		}
		
	}
}
