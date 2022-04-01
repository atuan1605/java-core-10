import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        for (int i = 1; i <= 10; i++) {
//            if(i % 2== 0 ){
//                System.out.println(i);
//            }
//        }

//        int i = 0;// khởi tạo biến
//        while (i < 10){
//            System.out.println("xin chào");
//            i++;
//        }


//        Scanner sc = new Scanner(System.in);
//        int age = 0;
//        while (age <= 0){
//            System.out.println("nhập tuổi: ");
//            age = sc.nextInt();
//
//        }
//
//        System.out.println("tuổi của bạn là: " + age );
//


//        int i = 11;// điều kiện mà sai vẫn thực thi 1 lần
//        do {
//            System.out.println("xin chào");
//            i++;
//        }while (i < 10);


//        for (int i = 1; i <= 100; i++){
//            if (i % 5 ==0 && i % 3==0){
//                System.out.println("fizzBuzz");
//            }else if(i % 5==0){
//                System.out.println("Buzz");
//            }else if(i % 3 ==0){
//                System.out.println("Fizz");
//            }else {
//                System.out.println(i);
//            }
//        }

//        for (int i = 1; i <= 100; i++){
//            if(i % 3 ==0){
//                if (i % 5 ==0){
//                    System.out.println("FizzBuzz");
//                }else {
//                    System.out.println("fizz");
//                }
//            }else {
//                if (i % 5 ==0){
//                    System.out.println("Buzz");
//                }
//                else {
//                    System.out.println(i);
//                }
//            }
//        }

        Scanner sc = new Scanner(System.in);
        int a = 0;

        do {
            System.out.println("Nhập a:");
             a = sc.nextInt();

        } while (a == 0);

        System.out.println("nhập b:");
        int b = sc.nextInt();
        System.out.println("nhập c:");
        int c = sc.nextInt();

        double d = Math.pow(b, 2) - (4 * a * c);
        double x1 = (-b - Math.sqrt(d)) / (2 * a);
        double x2 = (-b + Math.sqrt(d)) / (2 * a);
        double x = (-b) / (2*a);


        if (d > 0) {
            System.out.println("phương trình có 2 nghiệm:" + "x1 =" + x1 + "x2 =" + x2);
        } else if (d < 0) {
            System.out.println("vô nghiêm");
        } else {
            System.out.println("phương trình có nghiệm kép: x =" + x);
        }


    }
}
