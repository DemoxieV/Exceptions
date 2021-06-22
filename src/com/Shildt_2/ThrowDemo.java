package com.Shildt_2;
//Генерирование исключения вручную
public class ThrowDemo {
    public static void main(String[] args) {
        try{
            System.out.println("До инструкции throw");
            throw new ArithmeticException(); //генерирование исключения
        }
        catch(ArithmeticException exc){
            System.out.println("Исключение перехвачено");
        }
        System.out.println("После блока try/catch");
    }
}
