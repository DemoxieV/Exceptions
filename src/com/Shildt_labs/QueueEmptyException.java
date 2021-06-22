package com.Shildt_labs;
//Исключение для ошибок, связанных с пустой очередью, в случае попытки удалить элемент из пустой очереди
public class QueueEmptyException extends Exception{

    public String toString(){
        return "\nОчередь пуста";
    }

}
