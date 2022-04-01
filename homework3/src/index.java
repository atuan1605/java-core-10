import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "Hello every one";
        System.out.println("Chuỗi đã cho: " + str);

        char ch = 'e';
        System.out.println("Kí tự cần đếm số lần xuất hiện: " + ch);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (ch == str.charAt(i)) {
                count++;
                System.out.println("Kí hiệu " + ch + " cần tìm có index là: " + i);
            }
        }
        System.out.println("Số lần xuất hiện của " + ch + " là " + count);



    }
}

