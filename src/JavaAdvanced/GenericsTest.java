package JavaAdvanced;

public class GenericsTest {
    public static <E> void printArray(E[] inputArray){
        for(E x : inputArray){
            System.out.printf("%s ", x);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] nums = {1, 2, 3, 4, 5};
        Character[] chs = {'A', 'B', 'C', 'D', 'E'};
        printArray(nums);
        printArray(chs);
    }
}
