import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//	 Calculator calculator = new Calculator();// tạo đối tượng
//        // <tên class> <Tên biến tham chiếu> = new <tên class>
//
//
//        // gọi phương thức sum()
//        calculator.sum();
//
//        //gọi phương thức trừ
//        calculator.minus(6,4);

        Bmi bmi = new Bmi();
//        bmi.BmiCalculator();
//        bmi.bmiCalculator2(4.5,40);

//        double bmiResult = bmi.bmiCalculator3(1.5,40);
//        System.out.println(bmiResult);
//
//        System.out.println(bmi.result(1.5));
        circle circle = new circle();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập bán kính: ");
        double r = sc.nextDouble();

        System.out.println("chu vi hình tròn là" + circle.perimeter(r));
        System.out.println("Diện tích hình tròn là: " + circle.area(r));
    }
}
