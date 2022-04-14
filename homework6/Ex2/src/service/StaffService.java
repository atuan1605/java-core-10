package service;

import model.Staff;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.logging.SimpleFormatter;

public class StaffService {
    Scanner sc = new Scanner(System.in);


    public Staff input() {
        Staff staff = new Staff();
        String idType = "^NV[0-9]+$";
        String phoneType = "^[0|+84][0-9]{9}$";
        String emailType = "^[a-zA-Z][\\w-]+[@]([a-z]+.[a-z]+|[a-z]+.[a-z]+.[a-z]+)$";
        boolean flag = true;

        do {
            System.out.println("Nhập id: ");
            staff.setId(sc.nextLine());
        } while (staff.getId().matches(idType) == false);

        System.out.println("Nhập tên: ");
        staff.setName(sc.nextLine());

        do {
            System.out.println("Nhập giới tính [ 1 or 2 ]:" + "\n" + "1.Male" + "\n" + "2.Female");
            int type = sc.nextInt();
            sc.nextLine();
            switch (type) {
                case 1:
                    System.out.println("Giới tính của bạn là: Nam");
                    break;
                case 2:
                    System.out.println("Giới tính của bạn là: Nữ");
                    break;
                default:
                    flag = false;
                    break;
            }
        } while (flag == false);

        System.out.println("Nhập ngày sinh: ");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        staff.setBirthday(LocalDate.parse(sc.nextLine(),formatter));


        do {
            System.out.println("Nhập số điện thoại: ");
            staff.setPhone(sc.nextLine());
        } while (staff.getPhone().matches(phoneType) == false);

        do {
            System.out.println("Nhập email: ");
            staff.setEmail(sc.nextLine());
        } while (staff.getEmail().matches(emailType) == false);

        System.out.println("Nhập địa chỉ: ");
        staff.setAddress(sc.nextLine());

        return staff;
    }

    public void findId(Staff[] arrStaff) {
        System.out.println("Nhập id cần tìm: ");
        String findId = sc.nextLine();
        for (int i = 0; i < arrStaff.length; i++) {
            if (arrStaff[i].getId().contains(findId)) {
                System.out.println(arrStaff[i]);
            }
        }
    }

    public void findName(Staff[] arrStaff) {
        System.out.println("Nhập tên cần tìm: ");
        String findName = sc.nextLine();
        for (int i = 0; i < arrStaff.length; i++) {
            if (arrStaff[i].getName().contains(findName)) {
                System.out.println(arrStaff[i]);
            }
        }
    }

    public void findGender(Staff[] arrStaff) {
        boolean flag = true;
        do {
            System.out.println("Nhập giới tính cần tìm [ 1 or 2 ]:" + "\n" + "1.Male" + "\n" + "2.Female");
            int type = sc.nextInt();
            switch (type) {
                case 1:
                    for (int i = 0; i < arrStaff.length; i++) {
                        if (arrStaff[i].getGender().name().equals("MALE")) {
                            System.out.println(arrStaff[i]);
                        }
                    }
                    break;
                case 2:
                    for (int i = 0; i < arrStaff.length; i++) {
                        if (arrStaff[i].getGender().name().equals("FEMALE")) {
                            System.out.println(arrStaff[i]);
                        }
                    }
                default:
                    flag = false;
                    break;
            }
        } while (flag == false);
    }

    public void findAddress(Staff[] arrStaff){
        System.out.println("Các nhân viên có địa chỉ ở Hà Nội: ");
        for (int i = 0; i < arrStaff.length; i++){
            if (arrStaff[i].getAddress().contains("Hà Nội")){
                System.out.println(arrStaff[i]);
            }
        }
    }

}
