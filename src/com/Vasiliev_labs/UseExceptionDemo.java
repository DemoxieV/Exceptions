package com.Vasiliev_labs;

public class UseExceptionDemo {
    //Статический метод выбрасывает контролируемое исключение класса MyException
    static void alpha(int n)throws MyException{
        throw new MyException(n);
    }

    //Статический метод выбрасывает неконтролируемое исключение класса MyMistake
    static void bravo(int n){
        throw new MyMistake(n);
    }

    public static void main(String[] args) {
        try{
            alpha(123);
        }
        catch(MyException e){
            System.out.println(e);
        }

        try{
            bravo(321);
        }
        catch (MyMistake e){
            System.out.println(e);
        }
    }
}
