package com.Shildt_3;
//Использование ключевого слова throws
public class ThrowsDemo {
    public static char prompt(String str)
        throws java.io.IOException{
        System.out.print(str+": ");
        return (char) System.in.read();
    }

    public static void main(String[] args) {
        char ch;

        try{
            //В методе prompt() может быть сгенерировано исключение, поэтому его вызов в блоке try
            ch=prompt("Введите букву");
        }
        catch(java.io.IOException exc){
            System.out.println("Произошло исключение ввода-вывода");
            ch='X';
        }
        System.out.println("Вы нажали клавишу "+ch);
    }
}
