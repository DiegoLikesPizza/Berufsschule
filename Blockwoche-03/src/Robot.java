public class Robot {

    private int eyes;
    private String name;
    private String task;

    public Robot () {}

    public Robot(int eyes, String name) {
        this.eyes = eyes;
        this.name = name;
    }

    // GETTERS
    public int getEyes() {
        return eyes;
    }
    public String getName() {
        return name;
    }
    public String getTask() {
        return task;
    }

    // SETTERS
    public void setEyes(int eyes) {
        this.eyes = eyes;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setTask(String task) {
        this.task = task;
    }
}