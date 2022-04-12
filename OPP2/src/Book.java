import java.util.Scanner;
//viết chương trình quản lý sách với các thông tin sau:
// id, tittle, description, author, category, publishingYear
//Thực hiện các công việc: thêm sách mới, in sách ra màn hình
public class Book {
    public int id;
    public String tittle;
    public String description;
    public String author;
    public String category;
    public int publishingYear;

    public Book(){
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", tittle='" + tittle + '\'' +
                ", description='" + description + '\'' +
                ", author='" + author + '\'' +
                ", category='" + category + '\'' +
                ", publishingYear=" + publishingYear +
                '}';
    }
}
