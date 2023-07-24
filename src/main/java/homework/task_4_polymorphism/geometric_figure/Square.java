package homework.task_4_polymorphism.geometric_figure;

public class Square implements Figure {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side*side;
    }
}
