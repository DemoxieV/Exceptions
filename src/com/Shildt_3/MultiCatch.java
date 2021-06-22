package com.Shildt_3;

public class MultiCatch {
    public static void main(String[] args) {
        int a=88, b=0;
        int result;
        char chrs[]={'A','B','C'};

        for (int i = 0; i < 2; i++) {
            try{
                if(i==0)
                    result=a/b; //Генерирование ArithmeticException
                else
                    chrs[5]='X';//Генерирование ArrayIndexOutOfBoundsException
            }
            //перехват обоих исключений
            catch(ArithmeticException | ArrayIndexOutOfBoundsException exc){
                System.out.println("Перехваченное исключение: "+exc);
            }
        }
        System.out.println("После группового перехватчика исключений");
    }
}
