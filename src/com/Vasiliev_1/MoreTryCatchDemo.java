package com.Vasiliev_1;
//Статический импорт - для обращения к методам без указания имени класса
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class MoreTryCatchDemo {
    public static void main(String[] args) {
        String input;
        char symbs[];
        int size, index;

        input=showInputDialog(null, "Укажите размер массива", "Символьный массив", QUESTION_MESSAGE);

        try{
            size=parseInt(input);
            symbs=new char[size];
            String txt="| ";
            for (int k = 0; k < size; k++) {
                symbs[k]=(char) ('A'+k);
                txt+=symbs[k]+" | ";
            }
            showMessageDialog(null,txt,"Символы из массива",INFORMATION_MESSAGE);

            input=showInputDialog(null, "Укажите индекс массива", "Индекс элемента массива", QUESTION_MESSAGE);
            index=parseInt(input);
            txt="Индекс - "+index+"\nСимвол - "+symbs[index];
            showMessageDialog(null, txt, "Символ", INFORMATION_MESSAGE);
        }
        //Пользователь отменил ввод или ввел нечисловое значение
        catch (NumberFormatException e){
            showMessageDialog(null,"Вы что-то не то ввели. Попробуйте ещё раз", "Ошибка", WARNING_MESSAGE);
        }
        //Пользователь указал неверный (отрицательный) размер массива
        catch (NegativeArraySizeException e){
            showMessageDialog(null,"Некорректный размер массива", "Ошибка создания массива", WARNING_MESSAGE);
        }
        //Пользователь указал неверное значение индекса элемента массива
        catch (ArrayIndexOutOfBoundsException e){
            showMessageDialog(null,"Такой элемент не существует", "Ошибка выбора индекса массива", WARNING_MESSAGE);
        }
    }
}
