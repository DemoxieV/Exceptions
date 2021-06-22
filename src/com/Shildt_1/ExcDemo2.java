package com.Shildt_1;

public class ExcDemo2 {
    public static void main(String[] args) {
        try {
            ExcTest.genException();
        } catch (ArrayIndexOutOfBoundsException exc) { //Перехват ошибок выхода за пределы массива
            System.out.println("Выход за пределы массива!");
        } //выход из блока catch
        System.out.println("После инструкции catch");
    }
}
