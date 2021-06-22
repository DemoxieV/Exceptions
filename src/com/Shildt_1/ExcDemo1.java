package com.Shildt_1;
//Демонстрация обработки исключений
public class ExcDemo1 {
    public static void main(String[] args) {
        int nums[]=new int[4];

        try{ //начало контролируемого блока кода
            System.out.println("До генерации исключения");
            nums[7]=10; //попытка выйти за пределы массива nums[] -> исключение -> переход к блоку catch
            System.out.println("Эта строка не будет отображаться");
        } //конец контролируемого блока кода
        catch (ArrayIndexOutOfBoundsException exc){ //Перехват ошибок выхода за пределы массива
            System.out.println("Выход за пределы массива!");
        } //выход из блока catch
        System.out.println("После инструкции catch");
    }
}
