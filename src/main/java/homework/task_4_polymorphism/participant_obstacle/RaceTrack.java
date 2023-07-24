package homework.task_4_polymorphism.participant_obstacle;

public class RaceTrack extends Obstacle {
    private final int length;

    public RaceTrack(String obstacleName, int lenght) {
        super(obstacleName);
        this.length = lenght;
    }

    @Override
    public boolean isOvercome(Participant participant, Obstacle obstacle) {
        if (!participant.isActive()) {
            return false;
        }
        if (participant instanceof Man || participant instanceof Cat || participant instanceof Robot) {
            if (participant.getLimitRun() >= length) {
                System.out.println(participant.name + " ran the racetrack " + obstacle.obstacleName + " on distance " + length + " m");
                return true;
            } else {
                System.out.println(participant.name + " couldn't ran the racetrack " + obstacle.obstacleName + " on distance " + length + " m");
                participant.setActive(false);
                return false;
            }
        }
        return true;
    }
}
