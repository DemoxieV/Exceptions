package com.Vasiliev_1;
//Статический импорт - для обращения к методам без указания имени класса
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class TryCatchDemo {
    public static void main(String[] args) {
        String input;
        int num;

        input=showInputDialog(null, "Введите число", "Число", QUESTION_MESSAGE);
        try { //блок контроллируемого кода
            //Попытка преобразовать текст в число
            num=parseInt(input);
            showMessageDialog(null,"Числа "+(num-1)+", "+num+" и "+(num+1),"Числа", INFORMATION_MESSAGE);
        }
        //Обработка ошибок, код выполняется, если в контрольном блоке возникла ошибка
        catch(RuntimeException e){ //Создается объект, который содержит информацию о возникшей ошибке
            //можно написать как в учебнике - catch(Exception e){ - но это дольше, выйгрыш RuntimeException в 413 мс
            showMessageDialog(null,"Что-то пошло не так...", "Ошибка", ERROR_MESSAGE);
        }
    }
}
