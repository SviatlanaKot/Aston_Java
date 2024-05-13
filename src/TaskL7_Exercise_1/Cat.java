package TaskL7_Exercise_1;

public class Cat extends Animal {
    private boolean fullness;

    public Cat() {
        super();
        runLimit = 200;
        swimLimit = 0;
        fullness = false;
    }

    public void eat(Bowl bowl, int amount) {
        if (amount <= 0) {
            System.out.println("Количество еды должно быть положительным.");
            return;
        }
        if (amount <= bowl.getFood()) {
            bowl.decreaseFood(amount);
            fullness = true;
            System.out.println("Кот покушал.");
        } else {
            System.out.println("В миске недостаточно еды.");
        }
    }

    public boolean isFull() {
        return fullness;
    }
}

