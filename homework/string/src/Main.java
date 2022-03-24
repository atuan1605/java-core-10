import java.time.LocalDate;
import java.time.Month;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	//Sử dụng string literal;
        String name = "Tuấn";

        String title = "Cuốn theo chiều gió";

        //Sử dụng từ khóa new
        String address = new String("Hà Nội");

        String fullName = "tuấn";

        String city = new String("Hà Nội");

        System.out.println("Tôi tên là " + name);

        int size = name.length();
        System.out.println("chuỗi " + name + " là " + size);

        System.out.println("Độ dà của chuỗi " + address + " là " + address.length());

        System.out.println("Viết in hoa: " + name.toUpperCase());
        System.out.println("Viết thường: " + name.toLowerCase());

        System.out.println("So sánh hai chuỗi: "  + name.equals(fullName));// biến kiểu boolean

        String result = name.equals(title) ? "hai chuỗi giống nhau" : "hai chuỗi khác nhau";
        System.out.println(result);

        System.out.println(name == fullName);
        System.out.println(address == city);
        System.out.println(address.equals(city));// áp dụng để so sánh chuỗi

        System.out.println(" So sánh kong phân biệt chữ in hoa: " + name.equalsIgnoreCase(fullName));

        String str = "    Java      ";
        System.out.println("Chuỗi ban đầu " + str);
        System.out.println("Chuỗi sau khi loai bỏ khoảng trắng: " + str.trim());

        System.out.println("Thay chữ a thành chữ e: " + str.replace('a','e'));
        System.out.println(str.contains("a"));// tìm kiếm chữ

        System.out.println("ký tự u nằm ở index bao nhiêu: " + title.indexOf("u"));
        System.out.println("ký tự u nằm ở index cuối cùng: " + title.lastIndexOf("u"));

        System.out.println("Chữ ở index đầu tiên: " + title.charAt(0));

        System.out.println("Lấy ra chuỗi con: " + title.substring(10));
        System.out.println("Chuỗi con: " + title.substring(10,15));

        String s = "tuấn";

        String temp = String.valueOf(s.charAt(0));
//        System.out.println(temp.toUpperCase() + s.substring(1))
        String rs = temp.toUpperCase() + s.substring(1).toLowerCase();
        System.out.println(rs);

        Season muaDong = Season.WINTER;
        System.out.println(muaDong);

        Month thangHai = Month.FEBRUARY;
        System.out.println(thangHai);





    }
}
