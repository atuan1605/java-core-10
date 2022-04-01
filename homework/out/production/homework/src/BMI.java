import java.util.Scanner;

public class BMI {
    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);
        System.out.println("nhập chiều cao: ");
        double height = sc.nextDouble();

        System.out.println("nhập cân nặng: ");
        double weight = sc.nextDouble();

        double bmi = weight/(height*height);

        if(bmi < 18.5){
            System.out.println("gầy");
        }else if (bmi >= 18.5 && bmi <= 24.9){
            System.out.println("bình thường");
        }else {
            System.out.println("thừa cân");
        }
    }

}
