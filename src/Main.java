import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập chiều dài: ");
        double length = sc.nextDouble();

        System.out.println("Nhập chiều rộng: ");
        double width = sc.nextDouble();

        double perimeter = (width + length) * 2;
        System.out.println("Chu vi hình chữ nhật là: " + perimeter);

        double area = width * length;
        System.out.println("Diện tích hình chữ nhật là: " + area);




    }
}
