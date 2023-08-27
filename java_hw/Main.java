package org.example.java_hw;

import org.example.java_hw.controller.Controller;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createNewToy(1, "robot", 4, 10);
        controller.createNewToy(2, "doll", 6, 30);
        controller.createNewToy(3, "teddy bear", 4, 40);
        controller.createNewToy(4, "car", 8, 20);

        controller.startGame();
        controller.getAndWriteToy();
        controller.getToysList();

        controller.changeWeight("doll", 70);
        controller.startGame();
        controller.getAndWriteToy();
        controller.getToysList();
    }
}
