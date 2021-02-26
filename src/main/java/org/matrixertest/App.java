package org.matrixertest;

import org.matrixertest.calculator.Calculator;
import org.matrixertest.filesaver.FileSaver;
import org.matrixertest.printer.Printer;

public class App {

    Calculator calculator;
    Printer printer;
    FileSaver fileSaver;


    public static void main(String[] args) {
        App app = new App();
        app.run();
    }

    boolean run() {
        calculator = new Calculator();
        calculator.addition(1, 2);

        printer = new Printer();
        printer.printInput("Some input");

        fileSaver = new FileSaver();
        fileSaver.saveSomeText("appfile");

        return true;
    }
}
