public class BitwiseOperator {
    public static void main(String[] args) {
        int fourthBitFromRight = (0b10001 & 0b1000) | 0b1000;
        int fourthBitFromRight2 = (1 & 0b1000) | 0b1000;
        System.out.println(fourthBitFromRight);
        System.out.println(fourthBitFromRight2);
        System.out.println(0b01000);

        System.out.println(4>>1);
        System.out.println(4<<1);
        System.out.println(-0b11101>>>10);
        System.out.println(-0b11101>>10);

        System.out.println(16/2*4);
    }
}
