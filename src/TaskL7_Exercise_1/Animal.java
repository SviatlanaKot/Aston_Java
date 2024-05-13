package TaskL7_Exercise_1;

public class Animal {
    private static int animalCount = 0;
    protected int runLimit;
    protected int swimLimit;

    public Animal() {
        animalCount++;
    }

    public void run(int distance) {
        if (distance <= runLimit) {
            System.out.println(getClass().getSimpleName() + " пробежал " + distance + " м.");
        } else {
            System.out.println(getClass().getSimpleName() + " не может пробежать " + distance + " м.");
        }
    }

    public void swim(int distance) {
        if (distance <= swimLimit) {
            System.out.println(getClass().getSimpleName() + " проплыл " + distance + " м.");
        } else {
            System.out.println(getClass().getSimpleName() + " не может проплыть " + distance + " м.");
        }
    }

    public static int getAnimalCount() {
        return animalCount;
    }
}

