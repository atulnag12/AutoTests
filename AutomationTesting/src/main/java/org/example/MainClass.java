package org.example;

public class MainClass {
    public String sayHello() {
        return "Hello, world!";
    }

    public static void main(String[] args) {
        MainClass mainClass = new MainClass();
        System.out.println(mainClass.sayHello());
    }
}

