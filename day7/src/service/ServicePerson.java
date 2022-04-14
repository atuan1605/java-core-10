package service;

import model.Person;

import java.util.Scanner;

public class ServicePerson {
    public Person input() {
        Scanner sc = new Scanner(System.in);

        Person person = new Person();

        System.out.println("Nhập id: ");
        person.setId(sc.nextLine());
        System.out.println("Nhập tên: ");
        person.setName(sc.nextLine()) ;
        System.out.println("Nhập địa chỉ: ");
        person.setAddress(sc.nextLine()) ;
        System.out.println("Nhập email: ");
        person.setEmail(sc.nextLine()) ;

        return person;

    }
}
