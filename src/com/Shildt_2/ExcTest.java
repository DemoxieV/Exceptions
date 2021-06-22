package com.Shildt_2;
//Использование методов класса Throwable
public class ExcTest {
    static void genException(){
        int nums[]=new int[4];

        System.out.println("До генерации исключения");
        //Генерирование исключения - выход индекса за пределы массива
        nums[7]=10;
        System.out.println("Эта строка не будет отображаться");
    }
}
