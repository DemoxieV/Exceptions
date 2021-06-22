package com.Shildt_2;

public class ThrowableMethDemo {
    public static void main(String[] args) {
        try{
            ExcTest.genException();
        }
        catch(ArrayIndexOutOfBoundsException exc){
            //перехват исключения
            System.out.println("Стандартное сообщение: ");
            System.out.println(exc);
            System.out.println("\nСтек вызовов: ");
            exc.printStackTrace();
        }
        System.out.println("После инструкции catch");
    }
}
