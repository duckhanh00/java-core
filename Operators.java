import static java.lang.Math.floorMod;


public class Operators {
    public static void main(String[] args) {
        // System.out.println(1.0/0); // Infinity
        // System.out.println(1/0); // exception
        System.out.println(-7%3);
        System.out.println(7%-3);
        System.out.println(-7%-3);
        System.out.println(7%3);

        System.out.println(floorMod(-7,3));
        System.out.println(floorMod(7,-3));
        System.out.println(floorMod(-7,-3));
        System.out.println(floorMod(7,3));

        // System.out.println(1000000000*3); wrong result
        // System.out.println(Math.multiplyExact(1000000000, 3)); exception

        int i = 1;
        long l = 2;
        float f = 3f;
        double d = 4d;

        var r1 = i + l;
        var r2 = i + f;
        var r3 = i + d;
        var r4 = l + f;
        var r5 = l + d;
        var r6 = f + d;

        TypeTest.printByte((byte) 'a');
        TypeTest.printLong(r1);
        TypeTest.printFloat(r2);
        TypeTest.printDouble(r3);
        TypeTest.printFloat(r4);
        TypeTest.printDouble(r5);
        TypeTest.printDouble(r6);
        
        TypeTest.printFloat(r1);
        TypeTest.printDouble(r1);
        
        TypeTest.printDouble(r2);
        TypeTest.printDouble(r4);
    }
}

class TypeTest {
    static void printByte(byte x) {
        System.out.println(x + " is an byte");
    }
    static void printInt(int x) {
        System.out.println(x + " is an int");
    }

    static void printLong(long x) {
        System.out.println(x + " is an long");
    }
    static void printFloat(float x) {
        System.out.println(x + " is an float");
    }
    static void printDouble(double x) {
        System.out.println(x + " is an double");
    }
    static void printChar(char x) {
        System.out.println(x + " is an char");
    }
}
