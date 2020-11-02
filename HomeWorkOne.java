package ru.geekbrains.lesson_one.homework_one;

public class HomeWorkOne {
    public static void main(String[] args) {
        task_one(5, 10, 15, 17);
        System.out.println(task10task20(5,6));
        isPositiveOrNegative(0);
        greetings("Денис");

    }
    public static void task_one(int a,int b,int c,float d){
        float result =(a * (b + (c / d)));
        System.out.println(result);
    }
    public static boolean task10task20(int a, int b){
        int c = a + b;
        return (10 <= c) && (c <= 20);
    }
    public static void isPositiveOrNegative(int x) {

        if(x >= 0) {
            System.out.println("Число " + x + " положительное");
        } else {
            System.out.println("Число " + x + " отризательное");
        }
    }
    public static void greetings(String name){
        System.out.println("Привет " + name );
    }


}
