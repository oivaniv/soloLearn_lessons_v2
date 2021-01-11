package OOP;

public class ReturnMethod {

    public static int valueSum(int value1, int value2) {
        return value1 + value2;
    }

    public static void main(String[] args) {
        int sumAfterMethod = valueSum(2,5);
        System.out.println("The SUM is " + sumAfterMethod);
    }
}
