package ru.geekbrains.homework.lesson_four;

public class Employee{
    private String fio;
    private String position;
    private String phone;
    private int salary;
    public int age;

    public Employee(String fio, String position, String phone, int salary, int age) {
        this.fio = fio;
        this.position = position;
        this.phone = phone;
        this.salary = salary;
        this.age = age;


    }
    public  void checkEmp(){
        System.out.println(fio + " " + position + " " + phone + " " + salary + " " + age);
    }



    public int getAge() {
        return age;
    }


}


