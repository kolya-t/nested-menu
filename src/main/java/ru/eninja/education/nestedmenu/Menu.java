package ru.eninja.education.nestedmenu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Menu {

    private static final String ROOT = "root";
    private static final String BACK = "back";
    private static final String ONE = "1";
    private static final String ONE_ONE = "11";
    private static final String ONE_ONE_ONE = "111";
    private static final String ONE_ONE_TWO = "112";
    private static final String ONE_TWO = "12";
    private static final String EXIT = "exit";

    private final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private boolean outerMenuIsWorking;
    private boolean oneMenuIsWorking;
    private boolean oneOneMenuIsWorking;
    private boolean oneTwoMenuIsWorking;
    private boolean oneOneOneMenuIsWorking;
    private boolean oneOneTwoMenuIsWorking;

    void run() throws IOException {
        outerMenuIsWorking = true;

        while (outerMenuIsWorking) {
            System.out.printf("\n\n%s:\n", "Outer menu");
            System.out.printf("%-5s : %s\n", ONE, "Открыть меню ONE");
            System.out.printf("%-5s : %s\n", EXIT, "Выход");
            System.out.print("> ");

            switch (reader.readLine().trim()) {
                case ONE:
                    showOneMenu();
                    break;
                case EXIT:
                    outerMenuIsWorking = false;
            }
        }
    }

    private void showOneMenu() throws IOException {
        oneMenuIsWorking = true;

        while (oneMenuIsWorking) {
            System.out.printf("\n\n%s:\n", "Menu ONE");
            System.out.printf("%-5s : %s\n", ONE_ONE, "Открыть меню ONE ONE");
            System.out.printf("%-5s : %s\n", ONE_TWO, "Открыть меню ONE TWO");
            System.out.printf("%-5s : %s\n", BACK, "Назад");
            System.out.printf("%-5s : %s\n", ROOT, "В начало");
            System.out.print("> ");

            switch (reader.readLine().trim()) {
                case ONE_ONE:
                    showOneOneMenu();
                    break;
                case ONE_TWO:
                    showOneTwoMenu();
                    break;
                case BACK:
                case ROOT:
                    oneMenuIsWorking = false;
            }
        }
    }

    private void showOneOneMenu() throws IOException {
        oneOneMenuIsWorking = true;

        while (oneOneMenuIsWorking) {
            System.out.printf("\n\n%s:\n", "Menu ONE ONE");
            System.out.printf("%-5s : %s\n", ONE_ONE_ONE, "Открыть меню ONE ONE ONE");
            System.out.printf("%-5s : %s\n", ONE_ONE_TWO, "Открыть меню ONE ONE TWO");
            System.out.printf("%-5s : %s\n", BACK, "Назад");
            System.out.printf("%-5s : %s\n", ROOT, "В начало");
            System.out.print("> ");

            switch (reader.readLine().trim()) {
                case ONE_ONE_ONE:
                    showOneOneOneMenu();
                    break;
                case ONE_ONE_TWO:
                    showOneOneTwoMenu();
                    break;
                case BACK:
                    oneOneMenuIsWorking = false;
                    break;
                case ROOT:
                    oneOneMenuIsWorking = false;
                    oneMenuIsWorking = false;
            }
        }
    }

    private void showOneTwoMenu() throws IOException {
        oneTwoMenuIsWorking = true;

        while (oneTwoMenuIsWorking) {
            System.out.printf("\n\n%s:\n", "Menu ONE TWO");
            System.out.printf("%-5s : %s\n", BACK, "Назад");
            System.out.printf("%-5s : %s\n", ROOT, "В начало");
            System.out.print("> ");

            switch (reader.readLine().trim()) {
                case BACK:
                    oneTwoMenuIsWorking = false;
                    break;
                case ROOT:
                    oneTwoMenuIsWorking = false;
                    oneMenuIsWorking = false;
            }
        }
    }

    private void showOneOneOneMenu() throws IOException {
        oneOneOneMenuIsWorking = true;

        while (oneOneOneMenuIsWorking) {
            System.out.printf("\n\n%s:\n", "Menu ONE ONE ONE");
            System.out.printf("%-5s : %s\n", BACK, "Назад");
            System.out.printf("%-5s : %s\n", ROOT, "В начало");
            System.out.print("> ");

            switch (reader.readLine().trim()) {
                case BACK:
                    oneOneOneMenuIsWorking = false;
                    break;
                case ROOT:
                    oneOneOneMenuIsWorking = false;
                    oneOneMenuIsWorking = false;
                    oneMenuIsWorking = false;
            }
        }
    }

    private void showOneOneTwoMenu() throws IOException {
        oneOneTwoMenuIsWorking = true;

        while (oneOneTwoMenuIsWorking) {
            System.out.printf("\n\n%s:\n", "Menu ONE ONE TWO");
            System.out.printf("%-5s : %s\n", BACK, "Назад");
            System.out.printf("%-5s : %s\n", ROOT, "В начало");
            System.out.print("> ");

            switch (reader.readLine().trim()) {
                case BACK:
                    oneOneTwoMenuIsWorking = false;
                    break;
                case ROOT:
                    oneOneTwoMenuIsWorking = false;
                    oneOneMenuIsWorking = false;
                    oneMenuIsWorking = false;
            }
        }
    }
}
