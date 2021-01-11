package OOP;

public class ReturnWithTwoParameters {

    static int maxValue (int a, int b){
        if (a>=b){
            return a;
        }
        else {
            return b;
        }
    }

    public static void main(String[] args) {
        int result = maxValue(12, 15);
        System.out.println("Max value is " + result);
    }
}
