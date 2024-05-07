public class Employee {

    private String fullName;
    private String email;
    private String position;
    private int phone;
    private double salary;
    private int age;

    public Employee(String fullName, String email, String position, int phone, double salary, int age) {
        this.fullName = fullName;
        this.email = email;
        this.position = position;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void printInfoAboutEmployee() {
        System.out.println("Информация о сотруднике:\n" + "ФИО: " + fullName + ";\nДолжность: " + position +
                ";\nEmail: " + email + ";\nТелефон: " + phone + ";\nЗарплата: " + salary + ";\nВозраст: " + age);
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("Шут Евгений Иванович", "iv@yandex.ru", "Инженер",
                123456789, 100000, 25);
        employee1.printInfoAboutEmployee();


        Employee[] employeeArray = new Employee[5];
        employeeArray[0] = new Employee("Данута Дарья Владимировна", "ivk11@gmail.com", "Инженер",
                5421541, 100000, 25);
        employeeArray[1] = new Employee("Клин Павел Антонович", "dfd00iv@gmail.com", "Инженер",
                12356893, 80000, 20);
        employeeArray[2] = new Employee("Жук Андрей Иванович", "idd8v@gmail.com", "Инженер",
                33625412, 80000, 21);
        employeeArray[3] = new Employee("Жук Мария Ивановна", "iv_541@gmail.com", "Инженер",
                22222, 100000, 22);
        employeeArray[4] = new Employee("Савко Юлия Евгеньевна", "iv__852@gmail.com", "Инженер",
                55555, 100000, 21);
    }
}


