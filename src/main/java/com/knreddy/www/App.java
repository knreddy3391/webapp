package com.knreddy.www;

import javafx.scene.control.CheckBox;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        App ap = new App();
        System.out.println(ap.checkAge(15));
        System.out.println(ap.checkAge(30));
    }

    public String checkAge(int age) {
        String output = "";
        if (age > 18) {
            output = "Age is greater than 18";
        } else {
            output = "My age is less thatn 18";
        }
        return output;
    }
}
