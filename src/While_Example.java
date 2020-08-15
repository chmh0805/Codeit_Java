public class While_Example {
    public static void main(String[] args) {
    	
        int num = 10000;
        int key = 153;
        int i = 1;
        int result = 0;
        
        // 여기에 코드를 작성하세요.
        while (key * i < num) {
            result = key * i;
            i++;
        }
        
        System.out.println(result);
    }
}