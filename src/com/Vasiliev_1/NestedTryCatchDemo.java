package com.Vasiliev_1;
import java.util.*;
public class NestedTryCatchDemo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        char[] symbs;
        int size, index;

        try{ //внешний блок
            System.out.print("Укажите размер массива: ");
            size=input.nextInt();
            symbs=new char[size];
            System.out.print("| ");
            for (int k = 0; k < size; k++) {
                symbs[k]=(char)('A'+k);
                System.out.print(symbs[k]+" | ");
            }
            try{ //внутренний блок
                System.out.print("\nУкажите индекс: ");
                index=input.nextInt();
                System.out.println("Символ - "+symbs[index]);
            }
            //Если пользователь ввел некорректный индекс
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Такого элемента нет");
            }
            //Блок выполняется всегда
            finally {
                System.out.println("Массив создан успешно");
            }
            System.out.println("Для индекса указано числовое значение");
        }
        //Если пользователь ввел не число
        catch (InputMismatchException e){
            System.out.println("Ошибка: вы не ввели число");
        }
        //Если для массива указан отрицательный размер
        catch (NegativeArraySizeException e){
            System.out.println("Неверный размер массива");
        }
        System.out.println("Выполнение программы завершено");
    }
}
