package controller;

import model.Movie;
import service.MovieService;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    public void admin(){
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        MovieService service = new MovieService();
        ArrayList<Movie> list = new ArrayList<>();
        list = service.getMovieList();

        while (flag){
            showMenu();
            System.out.println("Please type: ");
            int choose = sc.nextInt();
            sc.nextLine();
            switch (choose){
                case 1:
                    service.showAllList(list);
                    break;
                case 2:
                    service.sortByTitle(list);
                    service.showAllList(list);
                    break;
                case 3:
                    service.sortByLength(list);
                    service.showAllList(list);
                    break;
                case 4:
                    service.sortByView(list);
                    service.showAllList(list);
                    break;
                case 5:
                    service.countTitleInCategory(list);
                    break;
                case 0:
                    flag = false;
                    break;
                default:
                    System.out.println("Please reselect: ");
                    break;

            }
        }

    }


    public static void showMenu(){
        System.out.println("========================Menu========================");
        System.out.println("1. Show all Movies: ");
        System.out.println("2. Show Movies sorted by title: ");
        System.out.println("3. Show Movies sorted by length:");
        System.out.println("4. Show Movies sorted by view: ");
        System.out.println("5. Show how many movies each category has: ");
        System.out.println("0.Exit!");
        System.out.println("Select [0-5]");
    }
}
