package com.Shildt_3;

//Использование блока finally
public class UseFinally {
    public static void genException(int what) {
        int t;
        int nums[] = new int[2];

        System.out.println("Получено: " + what);
        try {
            switch (what) {
                case 0:
                    t = 10 / what; //сгенерировать ошибку деления на 0
                    break;
                case 1:
                    nums[4]=4;//сгенерировать ошибку обращения к массиву
                    break;
                case 2:
                    return;//возврат из блока try

            }
        }
        catch (ArithmeticException exc){
            //перехват исключения
            System.out.println("Попытка деления на нуль");
            return;//возврат из блока catch
        }
        catch (ArrayIndexOutOfBoundsException exc){
            //перехват исключения
            System.out.println("Соответствующий элемент не найден");
        }
        finally { //этот блок выполняется независимо от того, каким образом завершается блок try/catch
            System.out.println("Выход из блока try");
        }
    }
}
