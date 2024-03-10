public class CharSample {
    public static void main(String[] args) {
        System.out.println("™");
        System.out.println("\u2122");
        System.out.println("\u2122" == "™");
        System.out.println('\u2122');
        System.out.println('\u0000');
        System.out.println('™');
        var c = Character.getType('a');
        var c1 = Character.getType('\u2122');
        var c2 = Character.BYTES;
        var a = Character.valueOf('a');
        var tm = Character.valueOf('\u2122');
        var tm2 = "™";
        System.out.println(c2);
        System.out.println(a.charValue());
        System.out.println(tm.charValue());
        System.out.println(Character.charCount(a));
        System.out.println(Character.charCount(tm));
        System.out.println(tm2.getBytes().length);
        System.out.println("A".getBytes().length);
        System.out.println("0001 length: " + "\u0001".getBytes().length);
        System.out.println("0010 length: " + "\u0010".getBytes().length);
        System.out.println("0100 length: " + "\u0100".getBytes().length);
        System.out.println("1000 length: " + "\u1000".getBytes().length);
        System.out.println('\u1000');
        System.out.println("F000: " + "\uF000");
        System.out.println("FFFF: " + "\uFFFF");
        System.out.println("6771: " + "\u6771");
        System.out.println("10400: " + "\u10400");
        System.out.println(Character.toString(0XF000));
        System.out.println(Character.toString(1114111).equals(Character.toString(0X10FFFF)));
    }
}
