package TaskL7_Exercise_1;

public class Bowl {
    private int food;

    public Bowl(int food) {
        this.food = food;
    }

    public void decreaseFood(int amount) {
        food -= amount;
    }

    public void addFood(int amount) {
        if (amount <= 0) {
            System.out.println("Количество добавляемой еды должно быть положительным.");
            return;
        }
        food += amount;
    }

    public int getFood() {
        return food;
    }
}

