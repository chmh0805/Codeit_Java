public class While_Example {
    public static void main(String[] args) {
    	
        int num = 10000;
        int key = 153;
        int i = 1;
        int result = 0;
        
        // ���⿡ �ڵ带 �ۼ��ϼ���.
        while (key * i < num) {
            result = key * i;
            i++;
        }
        
        System.out.println(result);
    }
}