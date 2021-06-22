package com.Shildt_2;
//ошибка деления на ноль - обрабатывается локалько в методе genException()
//попытка обращения за пределы массива - исключение генерируется повторно и перехватывается в main()
public class ReThrowDemo {
    public static void main(String[] args) {
        try{
            ReThrow.genException();
        }
        catch (ArrayIndexOutOfBoundsException exc){
            //Повторный перехват исключения (повторно сгенерированное исключение)
            System.out.println("Фатальная ошибка - "+"выполнение программы прервано!");
        }
    }
}
