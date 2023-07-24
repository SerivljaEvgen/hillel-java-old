package homework.task_4_polymorphism.geometric_figure;

import static java.lang.Math.sqrt;

public class EquilateralTriangle implements Figure{

    private double side;

    public EquilateralTriangle(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return ((side*side*sqrt(3))/4);
    }
}
