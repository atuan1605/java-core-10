public class Ex4    {


    public static void main(String[] args) {
        int count = 0;
        int i = 0;
        System.out.printf("10 số nguyên tố đầu tiên là: ");
        while (count < 10) {
            if (isPrimeNumber(i)) {
                System.out.print(i + " ");
                count++;
            }
            i++;
        }

        System.out.println("\nCác số nguyên tố nhỏ hơn 10 là: ");
        for(int a = 0; a < 10; a++){
            if (isPrimeNumber(a)) {
                System.out.printf(a + " ");
            }
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
