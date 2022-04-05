public class Ex2 {
    public static void main(String[] args){
        String str ="You only live once, but if you do it right, once is enough";
        int count = 0;
        String[] strArr = str.split("\\s",0);
        for(String strArr1 : strArr){
            if(!strArr1.isEmpty()){
                count++;
            }
        }
        System.out.println("Số từ đếm được trong chuỗi là: " + count);

        int count1 = 0;
        char ch = 'o';
        for (int i = 0; i < str.length(); i++){
            if(ch == str.charAt(i)){
                count1++;
                System.out.println("Kí tự " + ch + " có số index là: " + i);
            }
        }
        System.out.println("Số lần xuất hiện của " + ch + " là: " + count1);
    }
}
