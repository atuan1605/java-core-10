package model;

public class Student extends Person{
    private String classroom;
    private  float point;

    public Student() {
    }

    public Student(String classroom, float point) {
        this.classroom = classroom;
        this.point = point;
    }
}
