package homework.task_3_inheritance;

public abstract class Animal {
    private static int count; // comment for myself:
    // static defines a static variable that is associated with the class itself and not with a specific class object.

    public Animal() {
        count++;
    }

    public void run(double length) {
        System.out.println("Animal ran " + length + " m");
    }

    public void swim(double distance) {
        System.out.println("Animal swam " + distance + " m");
    }

    public abstract String name();

    public static int getCount() {
        return count;
    }
}
