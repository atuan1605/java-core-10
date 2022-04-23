import java.util.ArrayList;
import java.util.Scanner;

public class PersonService {
    public ArrayList<Person> getAllPerson(){
        ArrayList<Person> list = new ArrayList<>();

        list.add(new Person(1,"Quang", 28,"hà nội"));
        list.add(new Person(2,"Tuấn", 26,"hà nội"));
        list.add(new Person(3,"Minh", 25,"hà nội"));
        list.add(new Person(4,"Huy", 21,"hà nội"));
        return list;


    }
    public void show(ArrayList<Person> list){
        for (Person p: list){
            System.out.println(p);
        }
    }


//    tjap đối tương person
    public Person createPerson(){
        Scanner sc = new Scanner(System.in);
        Person p = new Person();
        System.out.println("nhập tên: ");
        p.setName(sc.nextLine());
        System.out.println("nhập tuổi");
        p.setAge(Integer.parseInt(sc.nextLine()));//ép kiểu int
        System.out.println("nhập địa chỉ");
        p.setAddress(sc.nextLine());
        return p;
    }

    //thêm đối tượng person vào ArrayList
    public boolean addPerson(ArrayList<Person> list, Person p){
        return list.add(p);
    }


    //tìm đối tượng theo id
    public Person findPersonById(ArrayList<Person> list, int id){
        Person fPerson = null;
        for (Person p : list){
            if (p.getId()==id){
                fPerson=p;
            }
        }
        return fPerson;
    }
    //Xóa đối tượng khỏi danh sách
    public void removePerson(ArrayList<Person> list, Person person){
        list.remove(person);
    }

    //cập nhật địa chỉ
    public  void updateAddress(Person p, String address ){
        p.setAddress(address);

    }
}
