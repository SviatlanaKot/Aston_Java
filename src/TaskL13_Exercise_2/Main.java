package TaskL13_Exercise_2;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Ivanov", "555-456-7890");
        phoneBook.add("Ivanov", "029-765-4321");
        phoneBook.add("Petrov", "555-555-5555");
        phoneBook.add("Sidorov", "111-222-3333");
        phoneBook.add("Sovko", "564-582-6231");
        phoneBook.add("Sovko", "033-653-4524");
        phoneBook.add("Sovko", "048-542-6321");

        System.out.println("Номера для Ivanov: " + phoneBook.get("Ivanov"));
        System.out.println("Номера для Petrov: " + phoneBook.get("Petrov"));
        System.out.println("Номера для Sidorov: " + phoneBook.get("Sidorov"));
        System.out.println("Номера для Sovko: " + phoneBook.get("Sovko"));
    }
}
