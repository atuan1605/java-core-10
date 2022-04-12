package model;

public class Person {
    //tạo thuộc tính
    public String name;
    public int age;
    public String address;
    //static
    public static String school = "techmaster";

    // Constructor mặc định- ko có tham số
    public Person(){
        System.out.println("Gọi tới contructor mặc định");
    }

    // Contructor có tham số
    public Person(String ten, int tuoi, String diaChi){
        name = ten;
        age = tuoi;
        address =diaChi;
    }


    public void study(){
        System.out.println(name +" Gọi tới phương thức study()");
        school = "CNTT";
    }

    // không cần tjao phương thức vẫn có thể gọi đối tượng
    public static void method(){
        System.out.println("phương thức static");
    }
    static {
        System.out.println("khối static");
    }
}
