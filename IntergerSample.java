public class IntergerSample {
    public static void main(String[] args) {
        System.out.println(1L == 1);
        System.out.println(010 == 8);
        System.out.println(0xA == 10);
        System.out.println(0B10 == 2);

        byte a = 120;
        byte b = 120;
        byte x = 1;
        byte c = (byte) 240;
        System.out.println((byte)(a+b));
        System.out.println((byte) a + (byte) b);
        System.out.println((byte)a+b);
        System.out.println(c);
        int s = Byte.toUnsignedInt(a) + Byte.toUnsignedInt(b);
        System.out.println(s);
        System.out.println((byte) s);
    }
}
