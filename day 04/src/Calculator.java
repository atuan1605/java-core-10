import java.util.Scanner;

public class Calculator {

    public void sum(){ // tạo 1 phương thức riêng
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a: ");
        int a = sc.nextInt();
        System.out.println("nhập b: ");
        int b = sc.nextInt();

        int c = a+b;
        System.out.println("Tổng: " + c);
    }


    public void minus(int a, int b){
        System.out.println("Trừ " + (a - b));
    }
}
