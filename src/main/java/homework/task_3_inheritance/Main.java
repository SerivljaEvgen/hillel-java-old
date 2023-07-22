package homework.task_3_inheritance;

public class Main {
    public static void main(String[] args) {
        Animal cat1 = new Cat("Barsik");
        cat1.run(100);
        cat1.swim(50);

        Animal cat2 = new Cat("Pushok");
        cat2.run(250);

        Cat cat3 = new Cat("Just Red cat");
        System.out.println();

        Animal dog1 = new Dog("Patron");
        dog1.run(500);
        dog1.swim(5);

        Dog dog2 = new Dog("Bobik");
        dog2.run(1000);
        dog2.swim(100);

        System.out.println("\nCount of created cats, dogs and animals: " + Animal.getCount());
    }
}
