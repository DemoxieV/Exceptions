package com.Shildt_1;
//Исключение может быть сгенерировано одним методом, а перехвачено другим
public class ExcTest {
    static void genException(){
        int nums[]=new int[4];

        System.out.println("До генерации исключения");
        nums[7]=10; //попытка выйти за пределы массива nums[] - здесь генерируется исключение
        System.out.println("Эта строка не будет отображаться");
    }
}
