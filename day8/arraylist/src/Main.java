import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<>();
        //không áp dụng với kiểu nguyên thủy
        ArrayList<Integer> inList = new ArrayList<>();
//        int = Integer
        ArrayList<Double> doubleArrayList = new ArrayList<>();
//        char = Character
        ArrayList<Character> characterArrayList = new ArrayList<>();

//        Thêm phần tử vào arrayList
        strList.add("Java");//index0
        strList.add("HTML");//index1
        strList.add("Python");//index2
        strList.add("ruby");//index3

//        In thông tin phần tử
        for(String s : strList){
            System.out.println(s);
        }

        strList.set(1,"MySQL");
        System.out.println("Danh sách sau khi cập nhật");
        for(String s : strList){
            System.out.println(s);
        }
//
//        //Xóa
//        strList.remove("Java");
//        System.out.println("danh sách sau khi xóa Java");
//        for(String s : strList){
//            System.out.println(s);
//        }
//
//        strList.remove(1);
//        System.out.println("danh sách sau khi xóa Index 1");
//        for(String s : strList){
//            System.out.println(s);
//        }
//
//        System.out.println("Số phần tử: " + strList.size());

        //sắp xếp
        Collections.sort(strList);

        System.out.println("Danh sách sau khi sắp xếp: ");
        for(String s : strList){
            System.out.println(s);
        }

        //Lấy phần tử
        System.out.println("phần tử có index = 2 là:" +strList.get(2));

        for (int i = 0; i < strList.size(); i++){
            if(strList.get(i).contains("y")){
                System.out.println(strList.get(i));
            }
        }

        //kiểm tra có chứa phần tử hay k?
        System.out.println(strList.contains("Ruby"));


        ArrayList<String> strList2 = new ArrayList<>();
        strList2.add("C/C++");
        strList2.add("PHP");
        strList2.addAll(strList);
        System.out.println(strList2);

        System.out.println("====================================================================");
        ArrayList<Integer> integers = new ArrayList<>();

        for (int i = 1; i <=10;i++){
            integers.add(i);
        }
        System.out.println(integers);
        System.out.println("số phần tử là:" + integers.size());

        int count =0;
        for (int i : integers){
            if (i%2==0){
                System.out.print(i+ "\t");
                count++;
            }

        }
        System.out.println("\nSố phần tử chẵn là: " + count);




    }
}
