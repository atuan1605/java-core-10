package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Arrays;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Product {
    private int id;
    private String name;
    private String description;
    private long price;
    private int quantity;
    private int sellingQuantity;
    private String company;
    private EnumCategory[] category;

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", sellingQuantity=" + sellingQuantity +
                ", company='" + company + '\'' +
                ", category=" + Arrays.toString(category) +
                '}';
    }
}
