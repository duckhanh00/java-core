public class FloatingPointSample {
    public static void main(String[] args) {
        System.out.println(4.3F == 4.3D);
        System.out.println(4.125F == 4.125D);
        System.out.println(4.3D);
        System.out.println(4.3F);
        System.out.println(1.222E3 == 1222);
        System.out.println(0.125F == 0x1.0p-3);
        System.out.println(0.125D == 0x1.0p-3);
        System.out.println(0.125D == 0.125F);

        var f = Float.valueOf(4.3f);
        var d = Double.valueOf(4.3d);
        var fp = 4.3F;
        var dp = 4.3D;
        System.out.println(f.equals(d));
        System.out.println(fp == dp);

        var i = Integer.valueOf(4);
        var l = Long.valueOf(4);
        var ip = 1;
        var lp = 1L;
        System.out.println(i.equals(l));
        System.out.println(ip == lp);

        System.out.println(Double.NaN);
        System.out.println(Double.isNaN(Double.NaN));
        System.out.println(Double.isNaN(0.0D/0.0));
        System.out.println(0.0d/0.0);
    }
}
