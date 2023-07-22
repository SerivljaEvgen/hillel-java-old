package homework.task_3_inheritance;

public class Cat extends Animal {
    private String catName;

    public Cat(String catName) {
        this.catName = catName;
    }

    @Override
    public String name() {
        return catName;
    }

    @Override
    public void run(double length) {
        if (length > 200) {
            System.out.println(length + " m run is too much for the cat " + name());
        } else {
            System.out.println("Cat " + name() + " ran " + length + " m");
        }
    }


    @Override
    public void swim(double distance) {
        System.out.println("Cat can't swim");
    }
}
