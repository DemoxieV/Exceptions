package com.Vasiliev_labs;
//Класс неконтролируемого исключения создается наследованием класса RuntimeException
public class MyMistake extends RuntimeException{
    private int code;
    MyMistake(int n){
        super();
        code=n;
    }
    public String toString(){
        String txt="Исключение класса MyMistake\n";
        txt+="Код ошибки: "+code+"\n";
        txt+="*******************************";
        return txt;
    }
}
