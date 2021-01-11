package OOP.Static;

public class Counter {
    public static int count = 0;
    public int max;

    Counter() {
        max=1;
        count++;
    }
    Counter(int a, int b){
        int max = a;
        int count = b;
    }
}
