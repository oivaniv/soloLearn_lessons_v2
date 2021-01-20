package moreOnClasses.typeCasting;

public class B_task extends A_task {

    public void print() {
        System.out.println("B");
    }

    public static void main(String[] args) {
        A_task object = new B_task();
        B_task b = (B_task) object;
        b.print();
    }
}
