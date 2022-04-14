package model;

import service.StaffService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        System.out.println("Nhập số lượng nhân viên: ");
        int n = sc.nextInt();
        sc.nextLine();
        Staff[] arrStaff = new Staff[n];
        StaffService staffService = new StaffService();
        do {

            menu();
            System.out.println("Select number: ");
            int choose = sc.nextInt();
            sc.nextLine();
            switch (choose){
                case 1:
                    for (int i = 0; i < arrStaff.length; i++){
                        arrStaff[i] = staffService.input();
                    }
                    break;
                case 2:
                    staffService.findId(arrStaff);
                    break;
                case 3:
                    staffService.findName(arrStaff);
                    break;
                case 4:
                    staffService.findGender(arrStaff);
                    break;
                case 5:
                    staffService.findAddress(arrStaff);
                    break;
                case 0:
                    flag = false;
                    break;
                default:
                    System.out.println("Please reselect");
                    break;
            }

        }while (flag);
    }
    public static void menu(){
        System.out.println("======== Menu ========");
        System.out.println("1. Nhập thông tin.");
        System.out.println("2.Tìm nhân viên theo id. ");
        System.out.println("3.Tìm nhân viên theo tên. ");
        System.out.println("4.Liệt kê nhân viên theo giới tính");
        System.out.println("5.Tìm các nhân viên có địa chỉ ở Hà Nội");
        System.out.println("0.Exit");

    }
}
