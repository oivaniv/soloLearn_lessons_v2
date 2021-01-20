package Quiz.Shapes;

public class Circle extends Shape {

    Circle(int y) {
        width = y;
    }

    @Override
    void area() {
        System.out.println(Math.PI * width * width);
    }
}
