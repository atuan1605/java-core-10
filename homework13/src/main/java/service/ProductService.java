package service;

import model.EnumCategory;
import model.Product;

import java.util.*;

public class ProductService {
    public ArrayList<Product> createProduct(){
        ArrayList<Product> list = new ArrayList<>();
        list.add(new Product(1, "iPad Pro 11 2021 ", "Ipad", 19999000,300,150,"APPLE", new EnumCategory[]{EnumCategory.APPLE}));
        list.add(new Product(2, "Tai nghe Beats Studio Buds ", "Tai nghe bluetooth", 3999000,180,303,"BEATS", new EnumCategory[]{EnumCategory.ACCESSORIES}));
        list.add(new Product(3, "MacBook Pro M1 ", "Laptop apple", 49490000,50,10,"APPLE", new EnumCategory[]{EnumCategory.APPLE, EnumCategory.LAPTOP}));
        list.add(new Product(4, "OPPO Reno7 Z 5G ", "Điện thoại", 10490000,40,10,"OPPO", new EnumCategory[]{EnumCategory.PHONE}));
        list.add(new Product(5, "iPhone 13 Pro Max 128GB ", "Điện thoại", 30490000,400,360,"APPLE", new EnumCategory[]{EnumCategory.APPLE,EnumCategory.PHONE}));
        list.add(new Product(6, "Chuột Magic Mouse 2 2022 ", "Chuột Máy tính", 2691000,20,5,"APPLE", new EnumCategory[]{EnumCategory.APPLE,EnumCategory.ACCESSORIES}));
        list.add(new Product(7, "Samsung Galaxy Fit2  ", "Đồng hồ", 690000,36,30,"SAMSUNG", new EnumCategory[]{EnumCategory.ACCESSORIES}));
        list.add(new Product(8, "Samsung Galaxy Watch 4 40mm ", "Đồng Hồ", 5490000,97,96,"SAMSUNG", new EnumCategory[]{EnumCategory.ACCESSORIES}));
        list.add(new Product(9, "Veger 10000mAh L10 PD&QC3.0 ", "Sạc dự phòng", 559000,40,25,"VEGER", new EnumCategory[]{EnumCategory.ACCESSORIES}));
        return list;
    }

    public void showList(ArrayList<Product> list){
        for (Product p : list){
            System.out.println(p);
        }
    }

    public ArrayList<Product> getListByCategory(ArrayList<Product> list, String a){
        ArrayList<Product> listCategory = new ArrayList<>();
        for (Product p : list){
            for (EnumCategory j : p.getCategory()){
                if (EnumCategory.valueOf(a).equals(j)){
                    listCategory.add(p);
                    break;
                }
            }
        }

        return listCategory;
    }

    public ArrayList<Product> getByCompany(ArrayList<Product> list, String b){
        ArrayList<Product> listCompany = new ArrayList<>();
        int a = 0;
        for(Product p : list){
            if (p.getCompany().contains(b)){
                a++;
                listCompany.add(p);
            }
        }
        System.out.println(b + ": " + a);
        return listCompany;
    }

    public ArrayList<Product> priceProduct(ArrayList<Product> list, long x, long y){
        ArrayList<Product> arrList = new ArrayList<>();
        if (y> 0){
            for (Product p : list){
                if (x < p.getPrice() && y > p.getPrice()){
                    list.add(p);
                }
            }
        }else{
            for (Product p : list){
                if (x < p.getPrice()){
                    list.add(p);
                }
            }
        }
        return arrList;
    }

    public ArrayList<Product> getByName(ArrayList<Product> list, String name){
        ArrayList<Product> listName = new ArrayList<>();
        int count = 0;
        for (Product p : list){
            if (p.getName().contains(name)){
                listName.add(p);
                count++;
            }
        }
        System.out.println("Number of products found: " + count);
        return listName;
    }

    public void showCompany(ArrayList<Product> list){
        TreeMap<String, Integer> map = new TreeMap<>();
        for (Product p: list){
            if (map.containsKey(p.getCompany())){
                map.put(p.getCompany(), map.get(p.getCompany())+1 );
            }else {
                map.put(p.getCompany(), 1);
            }
        }
        System.out.println(map);
    }





}
