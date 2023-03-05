package org.example;

public class Main {
    public static void main(String[] args) {
        //Напишите пример обработки нескольких исключений в одном блоке catch.
        try {
            System.out.println(divide(1, 0));
            //...

        } catch (IllegalArgumentException | NullPointerException e) {
            System.out.println(e.getClass() + " " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception" + " " + e.getMessage());
        }
    }

    private static int divide(int x, int y) {
        if (y == 0) {
            throw new IllegalArgumentException("divide by zero");
        }
        return x / y;
    }
}