package org.example;

import java.sql.PreparedStatement;

public class Main {
    public static double main(String[] args) {

        //Напишите пример перехвата и обработки исключения в блоке try-catch-метода.
        double DivNumbers ( int a, int b){
            double res = 0;
            try {
                res = a / b;
            } catch (ArithmeticException e) {
                System.out.println("Делить на ноль нельзя.");
            }
            return res;
        }
    }