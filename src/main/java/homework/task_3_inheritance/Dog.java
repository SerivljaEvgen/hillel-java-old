package homework.task_3_inheritance;

public class Dog extends Animal {
    private final String dogName;

    public Dog(String dogName) {
        this.dogName = dogName;
    }

    @Override
    public String name() {
        return dogName;
    }

    @Override
    public void run(double length) {
        if (length > 500) {
            System.out.println(length + " m run is too much for the dog " + name());
        } else {
            System.out.println("Dog " + name() + " ran " + length + " m");
        }
    }

    @Override
    public void swim(double distance) {
        if (distance > 10) {
            System.out.println(distance + " m is too long swimming distance for the dog " + name());
        } else {
            System.out.println("Dog " + name() + " swam " + distance + " m");
        }
    }
}
