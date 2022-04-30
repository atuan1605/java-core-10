public class ArrayDemo<E> {
    public static void main(String[] args) {
        String[] sArr = {"a","b","c","d"};
        showSArr(sArr);

        int[] iArr = {1,2,3,4,5};
        showIArr(iArr);

    }
    //áp dụng cho mảng string
    public  static void showSArr(String[] arr){
        for (String s: arr){
            System.out.println(s);
        }
    }
    //áp dụng cho amng int
    public static void showIArr(int[] arr){
        for (int i : arr){
            System.out.println(i);
        }
    }

    public static <E> void showArr(E[] arr){
        for (E p: arr){
            System.out.println(p);
        }
}
}
