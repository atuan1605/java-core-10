import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập họ và tên của bạn: ");
        String type = sc.nextLine();


        type = type.trim();
        type = type.replaceAll("\\s+", " ");


        char[] charArray = type.toCharArray();


        for (int i = 0; i < charArray.length; i++) {
            if (Character.isLetter(charArray[i])) {
                charArray[i] = Character.toUpperCase(charArray[i]);
            }
        }

        type = String.valueOf(charArray);

        System.out.println("Chuỗi sau khi chuẩn hóa là: " + type);

    }
}
