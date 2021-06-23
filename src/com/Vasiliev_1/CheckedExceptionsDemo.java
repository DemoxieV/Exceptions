package com.Vasiliev_1;
//Контролируемые исключения
public class CheckedExceptionsDemo {
    //Метод выбрасывает контролируемое исключение
    static void alpha(int n) throws Exception{
        String txt="Метод alpha() с аргументом "+n;
        throw new Exception(txt);
    }
    //Метод выбрасывает неконтролируемое исключение
    static void bravo(int n){
        String txt="Метод bravo() с аргументом "+n;
        try {
            if(n>0){
                //Генерирование контролируемого исключения
                throw new Exception(txt);
            }
            else{
                //Генерирование неконтролируемого исключения
                throw new RuntimeException(txt);
            }
        }
        //Обработка неконтролируемого исключения
        catch(RuntimeException e){
            //Повторное генерирование неконтролируемого исключения
            throw e;
        }
        //Обработка контролируемого исключения
        catch (Exception e){
            System.out.println("Обработка ошибки в bravo():");
            System.out.println(e.getMessage());
            System.out.println("******************************");
        }
    }

    //Метод для вызова при обработке исключений. Аргументом передается объект исключений
    static void catchMe(Exception e){
        System.out.println("Обработка ошибки в main():");
        System.out.println(e.getMessage());
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        try{ //контролируемое исключение класса Exception
            alpha(123);
        }
        catch(Exception e){
            catchMe(e);
        }

        try{ //При вызове метода не выбрасывается исключение
            bravo(123);
        }
        catch(Exception e){
            catchMe(e);
        }

        try{ //Неконтролируемое исключение класса RuntimeException
            bravo(-1);
        }
        catch(Exception e){
            catchMe(e);
        }

    }
}
