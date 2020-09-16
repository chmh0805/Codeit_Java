public class Array {
	public static void main(String[] args) {
		int[] intArray = new int[5]; // 배열에 담을 자료형(=int)에 해당하는 자료만 담을 수 있다.
		
		/* 배열을 만드는 방법
		 * (1) 선언과 동시에 빈 배열 생성
		 *  자료형[] 배열이름 = new 자료형[배열크기];
		 * 
		 * (2) 선언 후, 배열 생성
		 *  자료형[] 배열이름;
		 *  배열이름 = new 자료형[배열크기];
		 * 
		 * (3) 리터럴로 생성
		 *  자료형[] 배열이름 = {a, b, c, d, e};
		 *  이 경우, 배열의 크기는 자동으로 지정된다.
		 * 
		 */
		
		/* 앨리어싱 (Aliasing)
		 * [ex]
		 *  int[] arr1 = {1, 2, 3, 4, 5};
		 *  int[] arr2 = arr1;
		 *  
		 *  arr1[0] = 100;
		 *  System.out.println(arr2[0]); <- 실행하면 100이 나온다.
		 *  arr2 = arr1 시, 두 변수는 같은 주소를 가리키게 된다.
		 *  
		 *  arr1을 arr2에 새롭게 복사하고 싶으면 다음과 같이 작성한다.
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
