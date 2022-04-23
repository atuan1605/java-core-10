package controller;

import model.Product;
import service.ProductService;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    public static void showMenu() {
        System.out.println("==========Menu==========");
        System.out.println("1.Add product: ");
        System.out.println("2.Show all product: ");
        System.out.println("3.Get product by Name: ");
        System.out.println("4.Get product by ID: ");
        System.out.println("5.Show products have quantity less than 5: ");
        System.out.println("6.Show product by price");
        System.out.println("0.Exit: ");
        System.out.println("Enter your select: [0 - 6]");
    }

    public static void createProductMenu() {
        System.out.println("1.Add product: ");
        System.out.println("0.Exit");
        System.out.println("Enter your select: [0 - 1]");
    }

    public static void updateAndDeleteMenu() {
        System.out.println("1.Delete Product: ");
        System.out.println("2.Update Product: ");
        System.out.println("0.Exit");
        System.out.println("Enter your choose: ");
    }

    public static void priceMenu() {
        System.out.println("1.Cheaper than 50000: ");
        System.out.println("2.From 50000 to 100000: ");
        System.out.println("3.Expensive than 100000: ");
        System.out.println("0.Exit");
        System.out.println("Enter your select.");
    }

    public void admin() {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        ArrayList<Product> list = new ArrayList<>();
        ProductService productService = new ProductService();

        while (flag) {
            showMenu();
            int choose = sc.nextInt();
            sc.nextLine();
            switch (choose) {
                case 1:
                    boolean flagCreate = true;
                    while (flagCreate) {
                        createProductMenu();
                        int chooseCreate = sc.nextInt();
                        sc.nextLine();
                        switch (chooseCreate) {
                            case 1:
                                list.add(productService.createProduct());
                                break;
                            case 0:
                                flagCreate = false;
                                break;
                            default:
                                System.out.println("Please reselect");
                                break;
                        }
                    }
                    break;
                case 2:
                    productService.allProduct(list);
                    break;
                case 3:
                    ArrayList<Product> listName = productService.getProductByName(list);
                    for (Product p : listName) {
                        System.out.println(p);
                    }
                    break;
                case 4:
                    Product showProductById = productService.getProductById(list);
                    System.out.println(showProductById);
                    boolean flagID = true;
                    while (flagID) {
                        updateAndDeleteMenu();
                        int chooseForID = sc.nextInt();
                        sc.nextLine();
                        switch (chooseForID) {
                            case 1:
                                productService.deleteProduct(showProductById, list);
                                break;
                            case 2:
                                productService.updateProduct(showProductById);
                                break;
                            case 0:
                                flagID = false;
                                break;
                            default:
                                System.out.println("Please reselect");
                                break;
                        }
                    }
                    break;
                case 5:
                    ArrayList<Product> showProductQuantityLess5 = productService.getProductQuantityLess5(list, 5);
                    for (Product p : showProductQuantityLess5) {
                        System.out.println(p);
                    }
                    break;
                case 6:
                    boolean flagPrice = true;
                    ArrayList<Product> listPrice = new ArrayList<>();
                    while (flagPrice) {
                        priceMenu();
                        int choosePrice = sc.nextInt();
                        sc.nextLine();
                        switch (choosePrice) {
                            case 1:
                                listPrice = productService.getProductPrice1(list);
                                for (Product p : listPrice) {
                                    System.out.println(p);
                                }
                                break;
                            case 2:
                                listPrice = productService.getProductPrice2(list);
                                for (Product p : listPrice) {
                                    System.out.println(p);
                                }
                                break;
                            case 3:
                                listPrice = productService.getProductPrice3(list);
                                for (Product p : listPrice) {
                                    System.out.println(p);
                                }
                                break;
                            case 0:
                                flagPrice = false;
                                break;
                            default:
                                System.out.println("Please reselect");
                                break;
                        }
                    }
                    break;
                case 0:
                    flag = false;
                    break;
                default:
                    System.out.println("please reselect");
                    break;
            }
        }

    }
}

