package Quiz.Shapes;

public class Square extends Shape {

    Square(int x) {
        width = x;
    }

    @Override
    void area() {
        System.out.println(width * width);
    }
}
