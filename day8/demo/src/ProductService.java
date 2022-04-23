import java.util.ArrayList;
import java.util.Scanner;

public class ProductService {
    public Product addProduct(){
        Scanner sc = new Scanner(System.in);
        Product product = new Product();

        System.out.println("Nhập id: ");
        product.setId(sc.nextInt());
        sc.nextLine();
        System.out.println("Nhập tên sản phẩm: ");
        product.setName(sc.nextLine());
        System.out.println("Nhập mô tả: ");
        product.setDescription(sc.nextLine());
        System.out.println("Nhập số lượng:");
        product.setQuantity(sc.nextDouble());
        sc.nextLine();
        System.out.println("Nhập giá bán: ");
        product.setPrice(sc.nextLong());
        sc.nextLine();
        System.out.println("Nhập đơn vị tính: ");
        product.setUnit(sc.nextLine());

        return product;
    }

    public void showProduct(ArrayList<Product> list){
        for (Product p : list){
            System.out.println(p);
        }

    }

    public Product
}
