import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập họ và tên của bạn: ");
        String type = sc.nextLine();


        type = type.trim();
        type = type.replaceAll("\\s+", " ");


        char[] charArray = type.toCharArray();
        boolean space = true;

        for (int i = 0; i < charArray.length; i++) {
            if (Character.isLetter(charArray[i])) {
                if (space) {
                    charArray[i] = Character.toUpperCase(charArray[i]);
                    space = false;
                }
            } else {
                space = true;
            }
        }

        type = String.valueOf(charArray);

        System.out.println("Chuỗi sau khi chuẩn hóa là: " + type);

    }
}
