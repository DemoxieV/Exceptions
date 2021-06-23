package com.Vasiliev_1;
//Генерирование исключений вручную
public class ThrowDemo {
    public static void main(String[] args) {
        Exception me=new Exception("Искусственная ошибка"); //создается объект исключения - но ошибка пока не возникла
        try { //внешний блок
            System.out.println("Генерируется ошибка");
            try { //Генерирование исключения во внутреннем блоке - возникла ошибка
                throw me;
            }
            //перехват и обработка исключения во внутреннем блоке
            catch (Exception one) { //объектные переменные one и me ссылаются на один и тот же объект исключения
                System.out.println(one);
                System.out.println("А теперь ещё одна ошибка");
                throw one; //повторное генерирование исключения
            }
        } //перехват и обработка исключения во внешнем блоке
        catch(Exception two){
            System.out.println(two);
        }
        System.out.println("Выполнение программы завершено");
    }
}
