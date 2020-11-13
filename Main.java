package ru.geekbrains.homework.lesson_four;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Переверзев","Тестер", "98123409", 55555, 28);



        Employee[] massEmp = new Employee[5];
        massEmp[0] = new Employee("Ivanov", "tester2", "899912312", 50000, 25);
        massEmp[1] = new Employee("Smirnov", "tester3", "89993212", 55000, 30);
        massEmp[2] = new Employee("Sidorov", "tester4", "899943123", 60000, 35);
        massEmp[3] = new Employee("Pushkin", "tester5", "899912312", 65000, 40);
        massEmp[4] = new Employee("Esenin", "tester6", "899912312", 75000, 45);

        for (Employee employee : massEmp)
            if (employee.getAge()>= 40) employee.checkEmp();




        }





}
