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
            }
        }
        System.out.println("Số lần xuất hiện của " + ch + " là " + count);

        int e1 = str.indexOf('e');
        int e2 = str.indexOf('e',5);
        int e3 = str.indexOf('e',7);
        int e4 = str.indexOf('e',10);
        System.out.println("e có index là: "+ e1 +" " +e2 + " " +e3 + " " +e4);

    }
}

