package homework.task_4_polymorphism.participant_obstacle;

public abstract class Obstacle {

    protected String obstacleName;

    public Obstacle(String obstacleName) {
        this.obstacleName = obstacleName;
    }

    public abstract boolean isOvercome(Participant participant, Obstacle obstacle);
}
