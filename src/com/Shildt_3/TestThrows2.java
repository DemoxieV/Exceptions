package com.Shildt_3;
//Экспериментирую ещё, пробую групповой перехват
import javax.swing.JOptionPane;

public class TestThrows2 {
    public static int prompt(String str)
        throws java.io.IOException{
        String i;
        int res;
        i=JOptionPane.showInputDialog(str);
        res=Integer.parseInt(i);
        return res;
    }

    public static void main(String[] args) {
        int n;
        String s;

        try{
            //В методе prompt() может быть сгенерировано исключение, поэтому его вызов в блоке try
            n=prompt("Введите число:");
            JOptionPane.showMessageDialog(null,"Вы ввели "+n,"Результат",JOptionPane.PLAIN_MESSAGE);
        }
        catch (final java.io.IOException | NumberFormatException exc){
            s="что-то не то";
            n=0;
            JOptionPane.showMessageDialog(null,"Вы "+s+" ввели","Результат",JOptionPane.ERROR_MESSAGE);
        }
    }
}
