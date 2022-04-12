package StudentService;
//Class này sử dụng để xử lí các phương thức đối với Student
import model.Student;

import java.util.Scanner;

public class StudentService {


    //tạo đối tượng với Contructor mặc định
    public Student creatStudent(){

        Scanner sc = new Scanner(System.in);
        Student s = new Student();
        System.out.println("Nhập id: ");
        s.id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên; ");
        s.name = sc.nextLine();
        System.out.println("Nhập điểm lý thuyết: ");
        s.theoryPoint =sc.nextFloat();
        System.out.println("Nhập điểm thực hành: ");
        s.practicalPoint = sc.nextFloat();


        return s;
    }

    //tạo đối tượng với Contructor có tham số
    public Student creatNewStudent(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập id: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên; ");
        String name = sc.nextLine();
        System.out.println("Nhập điểm lý thuyết: ");
        float theoryPoint =sc.nextFloat();
        System.out.println("Nhập điểm thực hành: ");
        float practicalPoint = sc.nextFloat();

        Student s = new Student(id,name,theoryPoint,practicalPoint);

        return s;






    }
}
