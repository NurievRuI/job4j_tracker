package ru.job4j.oop;

public class Ball {
    public void tryRun(boolean condition) {
        if (condition) {
            System.out.println("I am dead");
        } else {
            System.out.println("I am alive");
        }
    }
}
