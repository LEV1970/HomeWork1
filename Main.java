package HomeWork1;

import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик", 15, 1);
        Robot robot1 = new Robot("Вердер", 20, 5);
        Treadmill[] treadmills = {new Treadmill(15, 1), new Treadmill(10, 2),
                new Treadmill(20, 3)};
        for (Treadmill treadmill : treadmills) {
            if (cat1.getLimitRun() > treadmill.getLength()) {
                System.out.println("Кот " + cat1.getName() + " успешно пробежал дорожку №" + treadmill.getNumber());
            } else {
                System.out.println("Кот " + cat1.getName() + " не смог пробежать дорожку №" + treadmill.getNumber());
            }
        }
        Human[] humans = {new Human("Петя", 20, 1), new Human("Коля", 15,
                1),};
        for (Human human : humans) {
            for (Treadmill treadmill : treadmills) {
                if (human.getLimitRun() > treadmill.getLength()) {
                    System.out.println("Человек " + human.getName() + " успешно пробежал дорожку №" +
                            treadmill.getNumber());
                } else {
                    System.out.println("Человек " + human.getName() + " не смог пробежать дорожку №" +
                            treadmill.getNumber());
                }
            }
        }
        Wall[] walls = {new Wall(0.2f), new Wall(4.99999f), new Wall(5.00001f)};
        for (Wall wall : walls) {
            if (robot1.getLimitJump() > wall.getHeight()) {
                System.out.println("Робот " + robot1.getName() + " перепрыгнул стену высотой " + wall.getHeight() + "м");
            } else {
                System.out.println("Робот " + robot1.getName() + " не смог перепрыгнуть стену высотой "+
                        wall.getHeight()+ "м");
            }
        }
    }
}
