package service;

import model.Serial;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class SerialService {
    Scanner sc = new Scanner(System.in);

    public Serial addSerial(){
        Serial serial = new Serial();
        System.out.println("Nhập tên id: ");
        serial.setId(sc.nextInt());
        sc.nextLine();

        System.out.println("Nhập tiêu đề: ");
        serial.setTitle(sc.nextLine());

        System.out.println("Nhập thể loại: ");
        serial.setCategory(sc.nextLine());

        System.out.println("Nhập tên đạo diễn: ");
        serial.setDirector(sc.nextLine());

        System.out.println("Nhập ngày công chiếu(dd/MM/yyyy): ");
        DateTimeFormatter date = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        serial.setPremiereDate(LocalDate.parse(sc.nextLine(),date));

        System.out.println("Nhập số tập: ");
        serial.setEpisodes(sc.nextInt());
        sc.nextLine();

        System.out.println("Nhập thời lượng trung bình (minutes): ");
        serial.setAverageTime(sc.nextInt());
        sc.nextLine();
        return serial;

    }

    public void getAllSeral(Serial[] arrSerial ){
        System.out.println("Thông tin phim: ");
        for (Serial i : arrSerial){
            System.out.println(i);
        }
    }

    public void findTitle(Serial[] arrSerial){
        System.out.println("Nhập tiêu đề cần tìm: ");
        String title = sc.nextLine();
        for (Serial i : arrSerial){
            if(i.getTitle().contains(title)){
                System.out.println(i);
            }
        }
    }

}
