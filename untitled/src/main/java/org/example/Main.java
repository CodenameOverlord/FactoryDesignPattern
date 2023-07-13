package org.example;

import org.example.factory.Flutter;
import org.example.factory.UIFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Flutter flutter = new Flutter();
        UIFactory uiFactory = flutter.createUIFactory("Android");

    }
}