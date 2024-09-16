package principal;

public class main {
    public static void main(String[] args) {
        int nums = 20;
        
        int num1 = 1;
        int num2 = 1;
        
        System.out.print(num1 + " " + num2 + " ");
        
        
        for (int i = 3; i <= nums; i++) {
            int num3 = num1 + num2;
            System.out.print(num3 + " ");
            num1 = num2;
            num2 = num3;
        }
    }
}

