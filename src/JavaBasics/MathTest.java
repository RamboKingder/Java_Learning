public class MathTest {


    public static void test(double d){
        System.out.println("Math.floor(" + d + ") = " + Math.floor(d));
        System.out.println("Math.round(" + d + ") = " + Math.round(d));
        System.out.println("Math.ceil(" + d + ") = " + Math.ceil(d));
    }

    public static void main (String[] args)
    {

        System.out.println("90 度的正弦值：" + Math.sin(Math.PI/2));
        System.out.println("0度的余弦值：" + Math.cos(0));
        System.out.println("60度的正切值：" + Math.tan(Math.PI/3));
        System.out.println("1的反正切值： " + Math.atan(1));
        System.out.println("π/2的角度值：" + Math.toDegrees(Math.PI/2));
        System.out.println(Math.PI);

        double[] num = {1.4, 1.5, 1.6, -1.4, -1.5, -1.6};
        for(double x: num){
            test(x);
        }

    }
}
