package controller;

import model.Student;
import service.StudentService;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {

    public static void admin(){
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        StudentService service = new StudentService();
        ArrayList<Student> list = new ArrayList<>();
        boolean flag = true;
        while (flag){
            mainMenu();
            int choose = sc.nextInt();
            sc.nextLine();
            switch (choose){
                case 1:
                    list.add(service.createStudent());
                    break;
                case 2:
                    service.allStudent(list);
                    break;
                case 3:
                    student=service.findById(list);
                    service.deleteStudent(list, student);
                    break;
                case 4:
                    student=service.findById(list);
                    service.updatePoint(student);
                    break;
                case 5:
                    service.getStudentByClass(list);
                    break;
                case 6:
                    service.sortByName(list);
                    break;
                case 7:
                    service.sortByAge(list);
                    break;
                case 8:
                    service.sortByPoint(list);
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
    public static void mainMenu() {
        System.out.println("===============Menu===============");
        System.out.println("1.Add Student: ");
        System.out.println("2.Get all student: ");
        System.out.println("3.Delete student: ");
        System.out.println("4.Update point for student: ");
        System.out.println("5.Show student by classroom: ");
        System.out.println("6.Sort by name: ");
        System.out.println("7.Sort by age: ");
        System.out.println("8.Sort by point: ");
        System.out.println("0.Exit! ");
        System.out.println("Select [0-8]");
    }

}
