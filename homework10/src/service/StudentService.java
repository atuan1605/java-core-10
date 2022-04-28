package service;

import model.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class StudentService {
    Scanner sc = new Scanner(System.in);
    public Student createStudent(){
        Student student = new Student();
        System.out.println("Type ID:");
        student.setId(sc.nextInt());
        sc.nextLine();
        System.out.println("Type Name: ");
        student.setName(sc.nextLine());
        System.out.println("Type age: ");
        student.setAge(sc.nextInt());
        sc.nextLine();
        System.out.println("Type address: ");
        student.setAddress(sc.nextLine());
        System.out.println("Type point: ");
        student.setPoint(sc.nextDouble());
        sc.nextLine();

        return student;
    }

    public void allStudent(ArrayList<Student> list){
        for (Student p : list){
            System.out.println(p);
        }
    }

    public Student findById(ArrayList<Student> list){
        Student idStudent = new Student();
        System.out.println("Search Student by ID: ");
        int fId = sc.nextInt();
        sc.nextLine();
        for (Student p : list){
            if (p.getId()==fId){
                idStudent = p;
                break;
            }
        }
        return idStudent;
    }
    public void updatePoint(Student student){
        System.out.println("Repair point: ");
        student.setPoint(sc.nextDouble());
        sc.nextLine();
    }

    public void deleteStudent(ArrayList<Student> list, Student student){
        list.remove(student);
    }

    public void getStudentByClass(ArrayList<Student> list){
        System.out.println("Type classroom: ");
        String fClass= sc.nextLine();
        for (Student p :list){
            if (p.getClassroom().contains(fClass)){
                System.out.println(p);
            }
        }
    }

    public void sortByName(ArrayList<Student> list){
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getName().compareTo(o1.getName());
            }
        });
    }

    public void sortByAge(ArrayList<Student> list){
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getAge() > o1.getAge() ? 1 : -1;
            }
        });
    }
    public void sortByPoint(ArrayList<Student> list){
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getPoint() > o1.getPoint() ? 1 : -1;
            }
        });
    }
}
