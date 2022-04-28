import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1,"Ngọc");
        hashMap.put(2,"Tùng");
        hashMap.put(3,"Linh");
        hashMap.put(4,"Ánh");
        hashMap.put(5,"Hoa");

        System.out.println(hashMap);

        hashMap.put(3,"Quân");
        System.out.println(hashMap);

        System.out.println(hashMap.get(1));
        hashMap.remove(1);

        System.out.println(hashMap);


        for (Map.Entry<Integer, String> entry: hashMap.entrySet()){
            System.out.println(entry.getKey() + " - " +entry.getValue());
        }
    }
}
