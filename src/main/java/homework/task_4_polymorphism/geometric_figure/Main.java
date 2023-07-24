package homework.task_4_polymorphism.geometric_figure;

public class Main {
    public static void main(String[] args) {
        //for myself:
        // Create an array of objects of 3 classes
        //thanks to polymorphism, we can store objects of different classes in an array and
        // call their method without explicit type casting.
        Figure[] figuresArray = new Figure[]{
                new Circle(10),
                new EquilateralTriangle(5),
                new Square(4)
        };

        System.out.print("Total area of all figures in array: ");
        System.out.format("%.2f",calculateTotalArea(figuresArray));
    }

    private static double calculateTotalArea(Figure[] figuresArray) {
        double sum = 0;
        for (Figure figure : figuresArray) {
            sum += figure.calculateArea();
        }
        return sum;
    }
}
