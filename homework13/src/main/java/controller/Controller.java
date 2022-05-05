package controller;

import model.Product;
import service.ProductService;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    public void admin(){
        Scanner sc  = new Scanner(System.in);
        ProductService service = new ProductService();
        ArrayList<Product> list = service.createProduct();
        boolean flag = true;
        while (flag){
            mainMenu();
            int choice = sc.nextInt();;
            sc.nextLine();
            switch (choice){
                case 1:
                    boolean flagCase1 = true;
                    while (flagCase1){
                        categoryMenu();
                        int choiceCase1 = sc.nextInt();
                        sc.nextLine();
                        switch (choiceCase1){
                            case 1:
                                service.showList(service.getListByCategory(list,"PHONE"));
                                break;
                            case 2:
                                service.showList(service.getListByCategory(list, "LAPTOP"));
                                break;
                            case 3:
                                service.showList(service.getListByCategory(list, "APPLE"));
                                break;
                            case 4:
                                service.showList(service.getListByCategory(list, "ACCESSORIES"));
                                break;
                            case 0:
                                flagCase1= false;
                                break;
                            default:
                                System.out.println("Please Reselect!");
                                break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("Type company: ");
                    String b = sc.nextLine().toUpperCase();
                    service.showList(service.getByCompany(list,b));
                    break;
                case 3:
                    System.out.println("Category: ");
                    String type = sc.nextLine().toUpperCase();
                    ArrayList<Product> listCategory = service.getListByCategory(list, type);
                    boolean flagCase3 = true;
                    while (flagCase3){
                        priceMenu();
                        int choicePrice = sc.nextInt();
                        sc.nextLine();
                        switch (choicePrice){
                            case 1:
                            service.showList(service.priceProduct(listCategory, 2000000,0));
                            break;
                            case 2:
                                service.showList(service.priceProduct(listCategory,2000000,4000000 ));
                                break;
                            case 3:
                                service.showList(service.priceProduct(listCategory,4000000,7000000 ));
                                break;
                            case 4:
                                service.showList(service.priceProduct(listCategory, 7000000,13000000));
                                break;
                            case 5:
                                service.showList(service.priceProduct(listCategory,13000000,0));
                                break;
                            case 0:
                                flagCase3 = false;
                                break;
                            default:
                                System.out.println("please reselect");
                                break;
                        }
                    }
                    break;
                case 4:
                    System.out.println("Type Name: ");
                    String name = sc.nextLine();
                    service.showList(service.getByName(list, name));
                    break;
                case 5:
                    service.showCompany(list);
                    break;
                case 0:
                    flag = false;
                    break;
                default:
                    System.out.println("Please reselect");
                    break;
            }
        }
    }

    public static void mainMenu(){
        System.out.println("================= MENU =================");
        System.out.println("1. Get products by category");
        System.out.println("2. Get products by company");
        System.out.println("3. Get products by price and category");
        System.out.println("4. Get products by name");
        System.out.println("5. Show company");
        System.out.println("0. Exit");
        System.out.println("Please select [0 - 5]");
    }
    public static void categoryMenu(){
        System.out.println("======================Category======================");
        System.out.println("1. PHONE");
        System.out.println("2. LAPTOP");
        System.out.println("3. APPLE");
        System.out.println("4. ACCESSORIES");
        System.out.println("0. Exit");
        System.out.println("Please select [0 - 4]");
    }

    public static void priceMenu(){
        System.out.println("==============PRICE==============");
        System.out.println("1. Price under 2000000 ");
        System.out.println("2. Price from 2000000 to 4000000 ");
        System.out.println("3. Price from 4000000 to 7000000 ");
        System.out.println("4. Price from 7000000 to 13000000");
        System.out.println("5. Price over 13000000");
        System.out.println("0. Exit");
        System.out.println("Please select [0 - 5]");

    }
}
