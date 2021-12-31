package JavaAdvanced;


public class GenericMethodTest {

    // 泛型方法，用于输出各种类型的数组元素
    public static < E > void printArray(E[] inputArray){
        for(E element:inputArray){
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.5, 6.2, 4.2, 5.6, 9.9};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};

        System.out.println("整型数组元素为：");
        printArray(intArray);

        System.out.println("\n双精度小数型数组元素为：");
        printArray(doubleArray);

        System.out.println("\n字符型数组元素为：");
        printArray(charArray);

    }
}
