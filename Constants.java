import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Constants {
    public static final Double DOUBLE_VALUE = 12d;
    public static final int[] INTS = new int[10];
    public static void main(String[] args) {
        // uppercase
        final String A = "A";
        System.out.println(A);
        // A = "B" -> fail;
        final int[] I = new int[3];
        // I=null; -> fail
        var list = Stream.of(1, 2).collect(Collectors.toList());
        list.set(0,2);
        I[0]=9;
        I[1]=9;
        I[0]=7;
        for (int j : I) {
            System.out.println(j);
        }
        for (int i : INTS) {
            System.out.println(i);
        }
        int c = 0;

        for (int i = 0; i < 10; ++i) {
            INTS[i] = i;
            System.out.println(INTS[i]);
        }
        INTS[0] = 100;
        System.out.println(INTS[0]);
        System.out.println(c);
        System.out.println(c++);
        System.out.println(++c);
    }
}
