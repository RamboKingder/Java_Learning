public class VaryArgsTest {

    public static void max(double...numbers){
        if(numbers.length == 0){
            System.out.println("No argument pass.");
        }

        double result = numbers[0];
        for(double x:numbers){
            if(x > result){
                result = x;
            }
        }

        System.out.println("The max value is " + result);
    }

    public static void main(String[] args) {

        double[] d = new double[]{1.2, 3.0, 0, 5.7, 9};
        max(d);

    }
}
