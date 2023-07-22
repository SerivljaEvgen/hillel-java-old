package homework.task_2_oop;

public class Car {
    public void start() {
        startElectricity();
        startCommand();
        startFuelSystem();
    }

    private void startFuelSystem() {
        System.out.println("Electricity");
    }

    private void startCommand() {
        System.out.println("Command");
    }

    private void startElectricity() {
        System.out.println("FuelSystem");
    }

    public static void main(String[] args) {
        var car1 = new Car();
        car1.start();
    }


}
