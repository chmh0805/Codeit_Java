public class Array {
	public static void main(String[] args) {
		int[] intArray = new int[5]; // �迭�� ���� �ڷ���(=int)�� �ش��ϴ� �ڷḸ ���� �� �ִ�.
		
		/* �迭�� ����� ���
		 * (1) ����� ���ÿ� �� �迭 ����
		 *  �ڷ���[] �迭�̸� = new �ڷ���[�迭ũ��];
		 * 
		 * (2) ���� ��, �迭 ����
		 *  �ڷ���[] �迭�̸�;
		 *  �迭�̸� = new �ڷ���[�迭ũ��];
		 * 
		 * (3) ���ͷ��� ����
		 *  �ڷ���[] �迭�̸� = {a, b, c, d, e};
		 *  �� ���, �迭�� ũ��� �ڵ����� �����ȴ�.
		 * 
		 */
		
		/* �ٸ���� (Aliasing)
		 * [ex]
		 *  int[] arr1 = {1, 2, 3, 4, 5};
		 *  int[] arr2 = arr1;
		 *  
		 *  arr1[0] = 100;
		 *  System.out.println(arr2[0]); <- �����ϸ� 100�� ���´�.
		 *  arr2 = arr1 ��, �� ������ ���� �ּҸ� ����Ű�� �ȴ�.
		 *  
		 *  arr1�� arr2�� ���Ӱ� �����ϰ� ������ ������ ���� �ۼ��Ѵ�.
		 *  int[] arr1 = {1, 2, 3, 4, 5};
		 *  int[] arr2 = arr1.clone();
		 *  
		 *  arr1[0] = 100;
		 *  System.out.println(arr1[0]); # 100
		 *  System.out.println(arr2[0]); # 1
		 */
		
		intArray[0] = 2;
		intArray[1] = 3;
		intArray[2] = 5;
		intArray[3] = 7;
		intArray[4] = 11;
		
		System.out.println(intArray[2]);
		System.out.println(intArray[2] + intArray[4]);
		
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		
	}
}
