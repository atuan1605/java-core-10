import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            String str="";
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập vào chuỗi bạn muốn kiểm tra: ");
            String inputString = scanner.nextLine();
            int length = inputString.length();
            for ( int i = length - 1 ; i >= 0 ; i-- )
                str = str + inputString.charAt(i);
            if (inputString.equals(str))
                System.out.println("Đây là chuỗi palindrome!");
            else
                System.out.println("Đây không phải là chuỗi palindrome!");
        }
    }



