package homework.task_4_polymorphism.participant_obstacle;

public class Robot extends Participant {

    public Robot(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(name + " ran the racetrack");
    }

    @Override
    public void jump() {
        System.out.println(name + " jump over the wall");
    }

    @Override
    public int getLimitRun() {
        return 100000;
    }

    @Override
    public int getLimitJump() {
        return 10;
    }
}
