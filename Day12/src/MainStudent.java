import java.util.*;

public class MainStudent {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1, "ma","10A",6));
        students.add(new Student(1, "tuấn","11A",6.5));
        students.add(new Student(1, "hoàng","12A",7));
        students.add(new Student(1, "đạt","11A",8));
        students.add(new Student(1, "an","10A",9));

        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        for (Student p : students){
            System.out.println(p);
        }

        System.out.println();

        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getPoint()>o2.getPoint() ? 1:-1;
            }
        });

        for (Student p : students){
            System.out.println(p);
        }

        Map<String, Integer> map = new HashMap<>();
        for (Student s: students){
            if(map.containsKey(s.getClassRoom())){
                map.put(s.getClassRoom(), map.get(s.getClassRoom()) + 1);
            }else {
                map.put(s.getClassRoom(),1);
            }
        }
        System.out.println("đếm số ng trg 1 lớp" + map);
    }


}
