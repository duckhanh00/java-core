public class Assignment {
    public static void main(String[] args) {
        int i = 1;
        i+=3.5;
        i = (int) (i + 3.5);
        System.out.println(i);

        int x = 1;
        int y = x += 5;
        System.out.println(x);
        System.out.println(y);

        int x1 = 1;
        x1 = x1 + 5;
        int y1 = x1;
        System.out.println(x1);
        System.out.println(y1);

        System.out.println(++x1);
        System.out.println(y1++);
        System.out.println(y1);

        System.out.println(isTest(0));
        System.out.println(isTest(1));
    }

    static boolean isTest(int x) {
        return x != 0 && 1 / x > x;
    }
}
