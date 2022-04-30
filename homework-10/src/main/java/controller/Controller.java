package controller;

import model.Book;
import service.BookService;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    public void admin(){
        Scanner sc = new Scanner(System.in);
        BookService service = new BookService();
        ArrayList<Book> list = new ArrayList<>();
        boolean flag = true;
        list = service.getAllList();

        while (flag){
            showMenu();
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:
                    service.showAllBooks(list);
                    break;
                case 2:
                    ArrayList<Book> list1 =service.getBookByTitle(list);
                    for (Book b: list1){
                        System.out.println(b);
                    }
                    break;
                case 3:
                    ArrayList<Book> list2= service.getBookByCategory(list);
                    for (Book b: list2){
                        System.out.println(b);
                    }
                    break;
                case 4:
                    service.sortByNumber(list);
                    service.showAllBooks(list);
                    break;
                case 5:
                    service.sortByRelease(list);
                    service.showAllBooks(list);
                    break;
                case 0:
                    flag = false;
                    break;
                default:
                    System.out.println("Please reselect!");
                    break;
            }
        }
    }

    public static void showMenu(){
        System.out.println("======================Menu======================");
        System.out.println("1. Show all list");
        System.out.println("2. Find book by title: ");
        System.out.println("3. Find book by category: ");
        System.out.println("4. Sort by number page");
        System.out.println("5. Sort by release year");
        System.out.println("0.Exit");
        System.out.println("Select [0-5]");
    }
}
