public class Student {
    private int id;
    private String name;
    private String classRoom;
    private double point;

    public Student() {
    }

    public Student(int id, String name, String classRoom, double point) {
        this.id = id;
        this.name = name;
        this.classRoom = classRoom;
        this.point = point;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
    }

    public double getPoint() {
        return point;
    }


    public void setPoint(double point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return id + " - " + name + " - " + classRoom + " - " + point;
    }
}
