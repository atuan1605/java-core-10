import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Nhập số phần tử của mảng: ");
            n = sc.nextInt();
        }while (n <= 0);

        int all[]= new int[n];

        System.out.println("Nhập các phần tử cho mảng: ");
        for (int i = 0; i < n; i++){
            int a = i + 1;
            System.out.println("Nhập phần tử thứ " + a + ": ");
            all[i] = sc.nextInt();
        }
        for (int i = 0; i < all.length; i++){
            if(all[i] % 2 == 0) {
                all[i] += 1;
            }
        }
        System.out.println("mảng sau khi thay đổi là: ");
        for (int i = 0; i < all.length; i++){
            System.out.printf(+ all[i] + "\t");
        }




    }
}
