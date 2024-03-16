import java.util.Arrays;

public class CodePointCodeUnit {
    public static void main(String[] args) {
        var str = "Helloꄒ";
        var str2 = "HelloA";
        var c = Character.toString(70000);
        System.out.println(c);
        System.out.println(str.length());
        System.out.println(str.charAt(5));
        System.out.println(str.codePointCount(0, 6));
        System.out.println(str2.codePointCount(0, 6));
        System.out.println(str.offsetByCodePoints(0, 6));

        var codeUnits = "\uD804\uDD70";
        var codeUnit1 = "\uD804";
        var codeUnit2 = "\uDD70";
        System.out.println(codeUnits);
        System.out.println(codeUnits.length());
        System.out.println(str.codePointCount(0, codeUnits.length()));
        System.out.println(codeUnits.charAt(0));
        System.out.println(codeUnits.charAt(1));
        System.out.println(codeUnit1);
        System.out.println(codeUnit2);
        var sumCode = codeUnit1 + codeUnit2;
        System.out.println(sumCode);
        codeUnits.codePoints().forEach(System.out::println);
        System.out.println(codeUnits.codePointAt(0));
        System.out.println(codeUnits.codePointAt(1));
        System.out.println(Character.toString(56688));
        System.out.println(Character.toString(127866));

        var codePoints = "\uD804\uDD70\uD83C\uDF7A";
        var arr = codePoints.codePoints().toArray();
        codePoints.codePoints().forEach(System.out::println);
        for (int i : arr) {
            System.out.println(i);
        }
        System.out.println(codePoints);
        System.out.println("number characters: " + codePoints.codePoints().count());
        System.out.println("string length: " + codePoints.length());
        System.out.println(Arrays.toString(codePoints.codePoints().toArray()));

        System.out.println(new String(new int[]{70000,127866}, 0, 2));
        System.out.println(new String(new int[]{70000,127866}, 0, 2));
        System.out.println(new String(new int[]{70000,127866}, 0, 1));
    }
}
