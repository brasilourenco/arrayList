package com.lourenco;

import java.util.Scanner;

public class Logic {

    private Scanner scanner;
    private Methods methods;

    public Logic() {
        scanner = new Scanner(System.in);
        methods = new Methods();
    }

    public void runner() {

        while (true) {

            if (methods.emptyList()) {
                System.out.println("You have nothing to do, go take a rest.");
            } else {
                System.out.println("You have some tasks: ");
                for (int i = 0; i < methods.list().length; i++) {
                    if (methods.list()[i] != null) {
                        System.out.println(methods.list()[i]);
                    }
                }
            }

            System.out.println("Hello! \n" + "enter 1 for add a task \n" + "enter 2 for remove a task \n" + "enter 3 for exit \n");
            byte input = scanner.nextByte();
            scanner.nextLine();

            if (input == 1) {
                if (methods.fullList()) {
                    System.err.println("Your list is full, delete something for continue!");
                } else {
                    System.out.println("Write your task: ");
                    String taskAdd = scanner.nextLine();
                    methods.addItem(taskAdd);
                }
            } else if (input == 2) {
                System.out.println("Insert the index of the item you want to remove: ");
                int indexRemove = scanner.nextInt();
                methods.removeItemById(indexRemove);
            } else if (input == 3) {
                System.exit(0);
            } else {
                System.err.println("ERROR! \n" + "INVALID NUMBER.");
            }
        }
    }
}
