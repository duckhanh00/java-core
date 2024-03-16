public class InitializingVariable {
    public static void main(String[] args) {
        int a;
        a = 1;
        System.out.println(a);
        int b;
//        System.out.println(b);
        var c = 1;
//        var d -> fail;

        // compare integer -128 -> 127
        Integer i1 = -128;
        Integer i2 = -128;
        System.out.println(i1==i2); // true

        final String A = "AB";
        final String B = new String("AB").intern();
        final String C = new String("AB");
        System.out.println(A==B); // true
        System.out.println(A==C); // false
        System.out.println(B==C); // false
    }
}
