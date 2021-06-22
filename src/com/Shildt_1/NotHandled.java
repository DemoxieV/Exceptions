package com.Shildt_1;
//Обработка ошибки средствами JVM (аварийный выход из проги)
public class NotHandled {
    public static void main(String[] args) {
        int nums[]=new int[4];

            System.out.println("До генерации исключения");
            nums[7]=10; //попытка выйти за пределы массива nums[] -> исключение, которое обработает JVM

    }
}
