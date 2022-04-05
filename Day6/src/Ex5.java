import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {

        int m;
        int n;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Nhập vào số dòng của mảng:");
            m = scanner.nextInt();
            System.out.println("Nhập vào số cột của mảng:");
            n = scanner.nextInt();
        } while (m < 1 || n < 1);

        int A[][] = new int[m][n];
        int B[][] = new int[m][n];

        int C[][] = new int[m][n];

        System.out.println("Nhập các phần tử cho mảng a:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + i + "," + j + "] = ");
                A[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Nhập các phần tử cho mảng B");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("B[" + i + "," + j + "] = ");
                B[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Mảng A");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println("\n");
        }

        System.out.println("Mảng B");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(B[i][j] + "\t");
            }
            System.out.println("\n");
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }




        int sum =0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    sum += A[i][j];
                }
            }
        }
        System.out.println("Tổng các phần tử nằm trên đường chéo chính = " + sum);





        System.out.println("\nTổng 2 mảng là");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(C[i][j] + "\t");
            }
            System.out.println("\n");
        }

    }
}
