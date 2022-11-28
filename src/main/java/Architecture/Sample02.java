package org.example;

// Описание паттерна Observer - зависимость 1 объекта ко многим: при изменении сосотояния все зависящие оповещаются.

import java.util.ArrayList;
import java.util.Collection;

public class Sample02 {
    public static void main(String[] args) {
        MyLogObserver1 myLogObserver1 = new MyLogObserver1();
        MyLogObserver2 myLogObserver2 = new MyLogObserver2();

        MyLogFileWriter myLogFileWriter = new MyLogFileWriter();
        myLogFileWriter.RegisterObserver(myLogObserver1);
        myLogFileWriter.RegisterObserver(myLogObserver2);

        myLogFileWriter.writeString("Hello!");

        myLogFileWriter.RemoveObserver(myLogObserver2);

        myLogFileWriter.writeString("Hello!");
    }
}

/*Определим наблюдателей - заинтересованных в знании о записи данных в файл
они должны имплементировать некий интерфейс, к примеру FileObserver, чтобы быть наблюдателями*/

class MyLogObserver1 implements FileObserver{

    @Override
    public void updateState() {
        System.out.println("MyLogObserver1 -> Файл был изменен");
    }
}

class MyLogObserver2 implements FileObserver{

    @Override
    public void updateState() {
        System.out.println("MyLogObserver2 -> Файл был изменен");
    }
}

/*
Интерфейс наблюдателя
*/

interface FileObserver{
    void updateState();
}


class MyLogFileWriter implements FileChanger{
    // Коллекция типа FileObserver благодаря интерфейсу FileObserver объединяет разные типы наблюдателей и
    // содержит ссылки на них
    private Collection<FileObserver>observers = new ArrayList<>();

    public void writeString(String str){
        //TODO: обращение к файлу, добавление строки к нему
        NotifyAll(); // уведомить всех observers об изменениях в файл
    }

    @Override
    public void RegisterObserver(FileObserver o) {
        observers.add(o);
    }

    @Override
    public void RemoveObserver(FileObserver o) {
        observers.remove(o);
    }
    // Пройти по каждому члену коллекции FileObserver и вызвать на нем метод updateState
    @Override
    public void NotifyAll() {
        for (FileObserver o : observers) {
            o.updateState();
        }
    }
}

/*
Интерфейс для имплементации в целевом классе MyLogFileWriter для наделения его способностью работать с наблюдателями -
сообщать им об изменениях - как бы добавление наблюдателей, а также удаление и уведомление.
 */

interface FileChanger{
    // Регистрация нового наблюдателя
    void RegisterObserver(FileObserver o);
    void RemoveObserver (FileObserver o);
    void NotifyAll ();
}
