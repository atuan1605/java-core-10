import model.Person;

public class Main {

    public static void main(String[] args) {
        //tạo đối tượng mới p1
        Person p1 = new Person();
        p1.name = "Linh";
        p1.age = 20;
        p1.address = "Hà Nội";


        System.out.println(p1.name + " - " + p1.age + " - " + p1.address + " "+ Person.school);
        p1.study();
        System.out.println(p1.name + " - " + p1.age + " - " + p1.address +" "+ Person.school);
        Person p2 = new Person();
        p2.name = "Tuấn";
        p2.age = 26;
        p2.address = "HN";
        System.out.println(p2.name + " - " + p2.age + " - " + p2.address);
        p2.study();


        //Contructor có tham số
        Person p3 = new Person("Tuấn", 25, "Hà Nội");
        System.out.println(p3.name + " - " + p3.age + " - " + p3.address);

        p3.age = 26;
        System.out.println("cập nhật tuổi");
        System.out.println(p3.name + " - " + p3.age + " - " + p3.address);

//        model.Dog d1 = new model.Dog();
//        d1.breed = "Neapolitan Mastill";
//        d1.size = "lagre";
//        d1.age = "5 years";
//        d1.color = "black";
//        System.out.println(d1.breed + " - " + d1.size + " - " + d1.age);
//
//        model.Dog d2 = new model.Dog();
//        d2.breed = "Maltese";
//        d2.size = "Small";
//        d2.age = "2 years";
//        d2.color = "White";
//
//        model.Dog d3 = new model.Dog();
//        d3.breed = "Chow Chow";
//        d3.size = "Midium";
//        d3.age = "3 years";
//        d3.color = "Brown";


    }
}
