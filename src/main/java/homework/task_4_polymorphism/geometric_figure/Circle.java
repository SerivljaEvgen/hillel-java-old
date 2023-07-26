package homework.task_4_polymorphism.geometric_figure;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Circle implements Figure{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return PI* pow(radius,2);
    }


}
