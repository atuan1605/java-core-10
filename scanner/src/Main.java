import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println("Nhập tên của bạn: ");
       String name = sc.nextLine();// đầy đủ

       System.out.println("Tên sau khi nhập: " + name);

       System.out.println("nhập tuổi của bạn: ");
       int age = sc.nextInt();

       System.out.println("Tuổi sau khi nhập: " + age);

       System.out.println("Nhập điểm: ");
       double point =  sc.nextDouble();

       sc.nextLine();// chống trôi lệnh nhập chữ sau số

       System.out.println("Điểm: " + point);

       System.out.println("Nhập địa chỉ: ");
       String address = sc.nextLine();

       System.out.println("Địa chỉ " + address);

        // System.out.println("Nhập chiều cao: ");
        // double height = sc.nextDouble();

        // System.out.println("Nhập cân nặng: ");
        // double weight = sc.nextDouble();

        // double bmi = weight / (height*height);

        // System.out.println(" chỉ số BMI: " + bmi);

    }
}
