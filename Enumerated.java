public class Enumerated {
    enum Size { SMALL, MEDIUM, LARGE, EXTRA_LARGE };

    public static void main(String[] args) {
        System.out.println(Size.EXTRA_LARGE);
        for (Size i : Size.values()) {
            System.out.println(i);
        }
    }
}
