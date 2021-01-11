package OOP.Static;

public class StaticLesson {
    public static void main(String[] args) {
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();
        Counter counter3 = new Counter(10, 20);

        System.out.println(Counter.count);

        counter1.count = 5;
        System.out.println(counter1.count);
        counter1.max = 10;


        counter1.count = 10;
        System.out.println(counter2.count);

        System.out.println(counter3.max);
        System.out.println(counter3.count);
    }
}
