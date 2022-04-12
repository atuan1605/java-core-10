import StudentService.StudentService;
import model.Student;

public class Apps {
    public static void main(String[] args) {
//        Student s1 = new Student();
//        Student s2 = new Student();
//        //gọi tới phương thức nhập dữ liệu
//        s1.input();
//        s2.input();
//
//        //gọi tới phương thức in dữ liệu
////        s1.output();
////        s2.output();
//
//        System.out.println(s1);
//        System.out.println(s2);
//
        //Sử dụng class studentService
//         StudentService service = new StudentService();
//         Student s3 = service.creatStudent();
//        System.out.println(s3);

        Student[] arrStudent = new Student[3];
        Student s = new Student(1,"tuấn", 8 ,9);
        arrStudent[0] = s;
        arrStudent[1] = new Student(2, "linh", 7,9);
        arrStudent[2] =new Student(2, "cường", 9,10);

        for (int i = 0; i < arrStudent.length; i++){
            System.out.println(arrStudent[i]);
        }


        System.out.println("==================================");
        //for each
        for (Student student: arrStudent){
            System.out.println(student);
        }

        System.out.println("tìm theo tên");
        for (Student student: arrStudent){
            if(student.name.equalsIgnoreCase("tuấn")){
                System.out.println(student);
            }
        }
        System.out.println("những người có điểm thực hành bằng 8: ");
        for (Student student: arrStudent){
            if(student.)
        }


    }
}
