package homework.task_4_polymorphism.participant_obstacle;

public class Wall extends Obstacle {
    private final int height;

    public Wall(String obstacleName, int height) {
        super(obstacleName);
        this.height = height;
    }

    @Override
    public boolean isOvercome(Participant participant, Obstacle obstacle) {
        if (!participant.isActive()) {
            return false;
        }
        if (participant instanceof Man || participant instanceof Cat || participant instanceof Robot) {
            if (participant.getLimitJump() >= height) {
                System.out.println(participant.name + " overcame the wall " + obstacle.obstacleName + " of " + height + " m");
                return true;
            } else {
                System.out.println(participant.name + " couldn't overcame the wall " + obstacle.obstacleName + " of " + height + " m");
                participant.setActive(false);
                return false;
            }
        }
        return true;
    }
}
