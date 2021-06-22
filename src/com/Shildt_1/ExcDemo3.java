package com.Shildt_1;
//Обработка исключения и продолжение выполнения программы - деление на ноль
public class ExcDemo3 {
    public static void main(String[] args) {
        int number[]={4,8,16,32,64,128};
        int denom[]={2,0,4,4,0,8};

        for (int i = 0; i < number.length; i++) {
            try{
                System.out.println(number[i]+" / "+ denom[i]+" равно "+number[i]/denom[i]);
            }
            catch (ArithmeticException exc){
                //Перехват исключения деления на ноль
                System.out.println("Попытка деления на ноль");
            }
        }
    }
}
