import java.util.Scanner;

public class BookService {

    public void input(){
        Scanner sc = new Scanner(System.in);
        Book books = new Book();
        System.out.println("Nhập id: ");
        books.id =Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tiêu đề: ");
        books.tittle=sc.nextLine();
        System.out.println("Nhập mô tả: ");
        books.description =sc.nextLine();
        System.out.println("nhập tên tác giả: ");
        books.author = sc.nextLine();
        System.out.println("Nhập thể loại: ");
        books.category = sc.nextLine();
        System.out.println("Năm xuất bản: ");
        books.publishingYear = sc.nextInt();

    }
}
