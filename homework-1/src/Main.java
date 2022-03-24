public class Main {

    public static void main(String[] args) {
        int a = 7;
        int b = 9;

        int c1 = a + b;
        int c2 = a - b;
        int c3 = b - a;
        int c4 = a * b;
        double c5 = (double) a / b;
        double c6 = (double) b / a;

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);

        int i = 1;
        int x = 2 + i++;
        int y = 2 + ++i;
        System.out.println("Kết quả của x là " + x);
        System.out.println("Kết quả của y là " + y);
        System.out.println(x != y ? "Vì vậy i++ khác ++i" : "Vì vậy i++ giống ++i");
        System.out.println(x > y? "i++ lớn hơn ++i" : "i++ nhỏ hơn ++i");

    }
}
