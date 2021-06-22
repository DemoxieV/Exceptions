package com.Shildt_3;
//Экспериментирую
import java.util.Scanner;
public class TestThrows {
    public static int prompt(String str)
        throws java.io.IOException{
        int n;
        Scanner input=new Scanner(System.in);
        System.out.print(str+": ");
        n= input.nextInt();
        return n;
    }

    public static void main(String[] args) {
        int n;

        try{
            //В методе prompt() может быть сгенерировано исключение, поэтому его вызов в блоке try
            n=prompt("Введите цифру");
        }
        catch(java.io.IOException exc){
            System.out.println("Произошло исключение ввода-вывода");
            n=0;
        }
        System.out.println("Вы нажали клавишу "+n);
    }
}
