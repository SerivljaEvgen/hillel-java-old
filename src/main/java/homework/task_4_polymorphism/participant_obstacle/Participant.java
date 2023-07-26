package homework.task_4_polymorphism.participant_obstacle;

public abstract class Participant {

    protected String name;
    protected boolean isActive;

    public Participant(String name) {
        this.name = name;
        this.isActive = true;
    }

    public void run() {
        System.out.println("run");
    }

    public void jump() {
        System.out.println("jump");
    }

    public boolean isActive(){
        return isActive;
    }

    public void setActive(boolean active){
        isActive = active;
    }

    public int getLimitRun(){
        return 0;
    }
    public int getLimitJump(){
        return 0;
    }


}
