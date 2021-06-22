package com.Shildt_labs;
//Интерфейс очереди для хранения символов с генерированием исключений
public interface ICharQ {
    //помещение символа в очередь
    void put(char ch) throws QueueFullException;

    //Извлечение символа из очереди
    char get() throws QueueEmptyException;
}
