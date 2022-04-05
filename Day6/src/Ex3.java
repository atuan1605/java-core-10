import java.util.Random;

public class Ex3 {

    public static void main(String[] args) {
        Random rd = new Random();
        int n = rd.nextInt();
        boolean check = isPrimeNumber(n);
        System.out.println("Số ngẫu nhiên ra là " + n);
        if( check ) {
            System.out.println((int)n + " la so nguyen to" ) ;
        }
        else{
            System.out.println(n+ " khong phai la so nguyen to" ) ;
        }
    }
    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
