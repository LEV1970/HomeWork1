package HomeWork1;

public class Robot {
    private String name;
    private int limitRun;
    private int limitJump;

    public Robot(String name, int limitRun, int limitJump) {
        this.name = name;
        this.limitRun = limitRun;
        this.limitJump = limitJump;
    }

    public int getLimitRun() {
        return limitRun;
    }

    public void setLimitRun(int limitRun) {
        this.limitRun = limitRun;
    }

    public int getLimitJump() {
        return limitJump;
    }

    public void setLimitJump(int limitJump) {
        this.limitJump = limitJump;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void run(){
        System.out.println(name + ": робот бежит");
    }
    public void jump(){
        System.out.println(name + ": робот прыгает");
    }
}
