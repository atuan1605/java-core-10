package controller;

import model.EnumCategory;
import model.Movie;
import model.Serial;
import service.MovieService;
import service.SerialService;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    public void admin(){
        Scanner sc = new Scanner(System.in);
        MovieService movieService = new MovieService();
        SerialService serialService = new SerialService();

        ArrayList<Movie> listMovie = movieService.createMovieList();
        ArrayList<Serial> listSerial = serialService.createSerialList();

        boolean flag = true;

        while (flag){
            mainMenu();
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 1:
                    movieService.sortByRelease(listMovie);
                    movieService.showAllMovieList(listMovie);
                    break;
                case 2:
                    movieService.showAllMovieList(movieService.getMovieByName(listMovie));
                    break;
                case 3:
                    movieService.showAllMovieList(movieService.getMovieByCategory(listMovie));
                    break;
                case 4:
                   movieService.getTopView(listMovie);
                   break;
                case 5:
                    serialService.showAllSerial(serialService.getCompleteMovie(listSerial));
                    break;
                case 6:
                    movieService.showAllMovieList(movieService.getMovieByYear(listMovie));
                    break;
                case 7:
                    EnumCategory[] enumCategory = new EnumCategory[]{EnumCategory.COMEDY,EnumCategory.FANTASY};
                    movieService.showAllMovieList(movieService.getMovieByCategory2(listMovie,enumCategory));
                    break;
                case 0:
                    flag = false;
                    break;
                default:
                    System.out.println("please reselect!");
                    break;
            }
        }
    }

    public static void mainMenu(){
        System.out.println("==================Menu==================");
        System.out.println("1. Show all List");
        System.out.println("2. Find Movie by name: ");
        System.out.println("3. Find Movie by category: ");
        System.out.println("4. Top 3 most watched movies: ");
        System.out.println("5. Show completed Movies:");
        System.out.println("6. Movies released this year:");
        System.out.println("7. Find Movie by category (from 2 or more): ");
        System.out.println("0. Exit");
        System.out.println("Select [0-7]");
    }

}
