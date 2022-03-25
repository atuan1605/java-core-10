import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập tên của bạn: ");
        String name = sc.nextLine();

        System.out.println("Tên sau khi nhập: " + name);

        System.out.println("Nhập tuổi của bạn: ");
        int age = sc.nextInt();

        System.out.println("Tuổi sau khi nhập: " + age);
        sc.nextLine();

        System.out.println("Nhập giới tính của bạn: ");
        String gender = sc.nextLine();

        System.out.println("Giới tính sau khi nhập: "+ gender);


        System.out.println("Nhập địa chỉ: ");
        String address = sc.nextLine();

        System.out.println("Địa chỉ: " + address);

        System.out.println("Nhập số điện thoại của bạn: ");
        int telephoneNumber = sc.nextInt();
        int firstNumber = 0;

        System.out.println("Số điện thoại sau khi nhâp: " + firstNumber + telephoneNumber);

        System.out.println("Nhập địa chỉ email của bạn: ");
        String email = sc.nextLine();

        System.out.println("Địa chỉ email sau khi nhập: "+ email);


    }
}
