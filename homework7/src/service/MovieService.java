package service;

import model.Movie;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MovieService {
    Scanner sc = new Scanner(System.in);

    public Movie addMovie(){
        Movie movie = new Movie();

        System.out.println("Nhập tên id: ");
        movie.setId(sc.nextInt());
        sc.nextLine();

        System.out.println("Nhập tiêu đề: ");
        movie.setTitle(sc.nextLine());

        System.out.println("Nhập thể loại: ");
        movie.setCategory(sc.nextLine());

        System.out.println("Nhập tên đạo diễn: ");
        movie.setDirector(sc.nextLine());

        System.out.println("Nhập ngày công chiếu(dd/MM/yyyy): ");
        DateTimeFormatter date = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        movie.setPremiereDate(LocalDate.parse(sc.nextLine(),date));

        System.out.println("Nhập thời lượng (minutes): ");
        movie.setTime(sc.nextInt());
        sc.nextLine();

        return movie;
    }

    public void getAllMovie(Movie[] arrMovie){
        System.out.println("Thông tin phim: ");
        for (Movie i : arrMovie){
            System.out.println(i);
        }

    }

    public void findTitle(Movie[] arrMovie){
        System.out.println("Nhập tiêu đề cần tìm: ");
        String title = sc.nextLine();
        for (Movie i : arrMovie){
            if (i.getTitle().contains(title)){
                System.out.println(i);
            }
        }
    }

}
