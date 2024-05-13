package TaskL7_Exercise_1;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();

        Cat[] cats = new Cat[3];
        for (int i = 0; i < cats.length; i++) {
            cats[i] = new Cat();
        }

        Bowl bowl = new Bowl(20);

        for (Cat cat : cats) {
            cat.eat(bowl, 10);
        }

        System.out.println("Сытость котов:");
        for (Cat cat : cats) {
            System.out.println("Кот " + (cat.isFull() ? "сыт" : "голоден"));
        }

        bowl.addFood(30);
        System.out.println("В миске осталось еды: " + bowl.getFood());

        System.out.println("Всего создано животных: " + Animal.getAnimalCount());
    }
}
