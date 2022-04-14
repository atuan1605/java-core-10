import model.Movie;
import model.Serial;
import service.MovieService;
import service.SerialService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        System.out.println("Nhập số lượng phim: ");
        int x = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập số lượng serial: ");
        int y = sc.nextInt();
        sc.nextLine();

        MovieService movieService = new MovieService();
        SerialService serialService = new SerialService();

        Movie[] arrMovie = new Movie[x];
        Serial[] arrSerial = new Serial[y];

        do {
            menu();
            int choose = sc.nextInt();
            sc.nextLine();
            switch (choose){
                case 1:
                    for (int i = 0; i < arrMovie.length; i++){
                        arrMovie[i] = movieService.addMovie();
                    }
                    break;
                case 2:
                    for (int i = 0; i < arrSerial.length; i++){
                        arrSerial[i] = serialService.addSerial();
                    }
                    break;
                case 3:
                    System.out.println("1.Thông tin film: ");
                    for (Movie i : arrMovie){
                        System.out.println(i);
                    }
                    System.out.println("2.Thông tin Serial: ");
                    for (Serial i : arrSerial){
                        System.out.println(i);
                    }
                    break;
                case 4:
                    System.out.println("Enter film's title: ");
                    String findTitle = sc.nextLine();
                    for (Movie i : arrMovie){
                        if(i.getTitle().contains(findTitle)){
                            System.out.println(i + " (Movie)");
                        }
                    }

                    for (Serial i : arrSerial){
                        if(i.getTitle().contains(findTitle)){
                            System.out.println(i + " (Serial)");
                        }
                    }
                    break;
                case 0:
                    flag = false;
                    break;
                default:
                    System.out.println("Xin mời chọn lại");
                    break;
            }

        }while (flag);




    }
    public static void menu(){
        System.out.println("======== Menu ========");
        System.out.println("1. Add Movie");
        System.out.println("2. Add Serial");
        System.out.println("3. Show all film");
        System.out.println("4. Find film by title");
        System.out.println("0. Exit");
    }
}
