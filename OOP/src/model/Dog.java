package model;

public class Dog {

        public String breed;
        public String size;
        public int age;
        public String color;

    public Dog(String breed, String size, int age) {
        this.breed = breed;
        this.size = size;
        this.age = age;
    }

    public  void eat(){
            System.out.println("gọi phương thức cho cường");
    }
    public void sleep(){

    }
    public void run(){

    }
}
