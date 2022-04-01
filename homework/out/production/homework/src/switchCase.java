import java.util.Scanner;

public class switchCase {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("nhập tháng: ");
        int number = sc.nextInt();

//        switch (number){
//            case 2:
//                System.out.println("thứ hai");
//                break;
//            case 3:
//                System.out.println("thứ ba");
//                break;
//            case 4:
//                System.out.println("thứ tư");
//                break;
//            case 5:
//                System.out.println("thứ năm");
//                break;
//            case 6:
//                System.out.println("thứ sáu");
//                break;
//            case 7:
//                System.out.println("thứ bảy");
//                break;
//            case 8:
//                System.out.println("chủ nhật");
//                break;
//            case 9,10,11:
//                System.out.println("ok");
//                break;
//            default:
//                System.out.println("không có");
//
//
//
//        }
        switch (number){
            case 1,3,5,7,8,10,12:
                System.out.println("có 31 ngày");
                break;
            case  2:
                System.out.println("có 28 ngày");
                break;
            case 4,6,9,11:
                System.out.println("có 30 ngày");
                break;
            default:
                System.out.println("không có");
        }
    }
}
