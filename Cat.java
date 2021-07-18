package HomeWork1;

public class Cat {
    private String name;
    private int limitRun;
    private int limitJump;

    public Cat(String name, int limitRun, int limitJump) {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void run(){
        System.out.println(name + ": кот бежит");
    }
    public void jump(){
        System.out.println(name + ": кот прыгает");
    }
}
