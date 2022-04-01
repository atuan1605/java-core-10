import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);

//        int randomNumber = rd.nextInt(100);// điền số để giới hạn
//
//        System.out.println("số ngẫu nhiên: " + randomNumber);

//        boolean isCheck = true;
//        while (isCheck){
//            int randomNumber = rd.nextInt(100);
//
//            System.out.println("số ngẫu nhiên: " + randomNumber);
//
//            if (randomNumber>90){
//                isCheck = false;
//            }
//        }

        // viết chương trình sinh 1 số ngẫu nhiên thực hiện nhập 1 số từ bàn phím
        //  so sánh 2 số rdNumber với number
        // nếu number > rdNumber -> Bạn nhập số lớn hơn rồi, cho nhập lại
        // nếu number < rdNumber -> Bạn nhập số nhỏ hơn rồi, cho nhập lại
        // nếu number == rdNumber -> Chúc mừng bạn nhập đúng r
        int randomNumber = rd.nextInt(100);
        boolean isCheck = true;
        while (isCheck){

            System.out.println("nhập số bất kì: ");
            int number = sc.nextInt();

            if (randomNumber>number){
                System.out.println("Bạn nhập số nhỏ hơn rồi, cho nhập lại");
            } else if(randomNumber<number ){
                System.out.println("Bạn nhập số lớn hơn rồi, cho nhập lại");

            }else {
                System.out.println("đúng cmnr");
                isCheck = false;
            }
        }





    }
}
