import java.util.ArrayList;

public class TestSystem {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Hoa",20, "Hà Nội", 8));
        students.add(new Student("Hoa",20, "Hà Nội", 8));
        students.add(new Student("Hoa",20, "Hà Nội", 8));

        ArrayList<Teacher> teachers = new ArrayList<>();
        teachers.add(new Teacher("Ba",26,"Hà nội", 800000));
        teachers.add(new Teacher("Ba",26,"Hà nội", 800000));
        teachers.add(new Teacher("Ba",26,"Hà nội", 800000));

        System.out.println("Danh sách học sinh");
        showList(students);

        System.out.println("ccccccccccccccccccccccccccccccccccc");
        System.out.println("Danh sách giảng viên");
        showList(teachers);

    }

    public static void showList(ArrayList<? extends Person> list){
        for (Object o: list){
            System.out.println(o);
        }
    }
}
