public class Concatenation {
    public static void main(String[] args) {
        System.out.println(String.join("aaa", new String[]{"sample", "join"}));
        System.out.println(String.join("t", "a", "a", "s", "s"));
        System.out.println("repeated".repeat(3));
        System.out.println("String is immutable class");

        var str = "Hello";
        var str1 = "Hello";
        var str3 = str1;
        var str4 = new String("Hello");
        var str5 = new String("Hello");
        System.out.println(str == "Hello");
        System.out.println(str1 == "Hello");
        System.out.println(str1 == str);
        System.out.println(str3 == str);
        System.out.println(str3.substring(0) == "Hello");
        System.out.println(str3.substring(1) == "ello");
        System.out.println(str4);
        System.out.println(str4 == str);
        System.out.println(str4 == str5);
    }
}
