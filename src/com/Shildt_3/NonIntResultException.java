package com.Shildt_3;
//Использование специально создаваемого исключения
public class NonIntResultException extends Exception{
    int n;
    int d;

    NonIntResultException(int i, int j){
        n=i;
        d=j;
    }

    public String toString(){
        return "Результат операции "+n+" / "+d+" не является целым числом";
    }
}
