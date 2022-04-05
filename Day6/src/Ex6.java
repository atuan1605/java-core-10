import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {


            boolean flag;
            Scanner sc = new Scanner(System.in);
            do {
                String emailPattern = "^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
                System.out.print("Nhập địa chỉ email:  ");
                String input = sc.next();
                flag = input.matches(emailPattern);
                if (!flag) System.out.println("Email không hợp lệ! Mời nhập lại. ");
            } while (!flag);
            System.out.println("Email hợp lệ!");

        do {
            String phonePattern = "^[0|\\+84][0-9]{8,10}$";
            System.out.print("Nhập số điện thoại:  ");
            String input1 = sc.next();
            flag = input1.matches(phonePattern);
            if (!flag) System.out.println("SĐT không hợp lệ! Mời nhập lại. ");
        } while (!flag);
        System.out.println("SĐT hợp lệ!");
    }
}
