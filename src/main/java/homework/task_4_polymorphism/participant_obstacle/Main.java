package homework.task_4_polymorphism.participant_obstacle;

public class Main {
    public static void main(String[] args) {

        Participant[] participants = {
                new Cat("Barsik"),
                new Man("Mad Max"),
                new Robot("Terminator")
        };

        Obstacle[] obstacles = {
                new RaceTrack("FURY ROAD", 100),
                new Wall("WALL OF FAME", 9)
        };


        for (Participant member : participants) {
            boolean inAction = true;
            for (Obstacle obstacle : obstacles) {
                if (!obstacle.isOvercome(member, obstacle)) {
                    inAction = false;
                    break;
                }
            }
            if (!inAction) {
                System.out.println(member.name + " is out.");
            } else {
                System.out.println(member.name + " overcame all obstacles!");
            }

        }
    }
}
