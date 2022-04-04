import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 1;
        arr[2] = 4;
        arr[3] = 9;
        arr[4] = 2;

        System.out.println("số phần tử có trong mảng: " + arr.length);
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if(arr[i]% 2 ==0){

                System.out.println("index: " + i);
                count++;
            }
        }
        System.out.println("số phần tử chia hết cho 2 là: " + count);

        int max = arr[0];
        for (int i = 0; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println("phần tử lớn nhất " + max);

        for (int i = 0; i < arr.length; i++){
            for (int j = i +1; j< arr.length; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i]= arr[j];
                    arr[j]= temp;
                }
            }
        }
        System.out.println(" mảng sau khi sắp xếp");
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

//
//        String[] languages = new String[5];
//        languages[0] = "HTML/CSS";
//        languages[1] = "Java";
//        languages[4] = "JS";
//        languages[2] = "Kotlin";
//        languages[3] = "Ruby";
//
//        for (int i = 0; i < languages.length; i++){
//            System.out.println(languages[i]);
//        }

//        String[] name = {"Ngọc","linh","Tuấn"};
//        for (int i = 0; i< name.length; i++){
//            System.out.println(name[i]);
//        }
//
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("nhập số phần tử mảng");
//        int n = sc.nextInt();
//
//        double[] points = new double[n];
//        for (int i = 0; i < points.length; i++){
//            System.out.printf("nhập phần tử thứ %d: ", (i+1));// dùng dấu phảy
//            points[i] =sc.nextDouble();
//
//        }
//        System.out.println("Mảng số thực: ");
//        for(int i = 0; i < points.length; i++){
//            System.out.println(points[i] + "\t");
//        }



        String str ="nó chỉ dừng vòng lặp bên trong đó";
        String[] s = str.split(" ");
        System.out.println("trong chuỗi có bao nhiêu từ: " + s.length);
        for (int i = 0; i < s.length; i++){
            System.out.println(s[i]);
        }
    }
}
