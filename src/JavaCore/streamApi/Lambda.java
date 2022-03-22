package JavaCore.streamApi;

import JavaCore.streamApi.anonClass.AnonClassInterface;

public class Lambda {

    //Лямбда - это упрощенное написание внутреннего анонимного класса.
    //Пример (пример анонимного класса указан в JavaCore.streamApi.AnonClass).
    //Лямбда - это попытки сохранения методов в переменные и передача методов в методы.
    //В лямбду можно свернуть только функциональный интерфейс

    public static void main(String[] args) {

        AnonClassInterface anonClassInterface = () -> {
            System.out.println("Hello World");
        };
        anonClassInterface.helloWorld();

        //Через интерфейс Runnable - создаем анонимный класс и при помощи лямбды записываем реализацию.
        Runnable r1 = () -> {
            System.out.println(1);
        };
        Runnable r2 = () -> {
            System.out.println(2);
        };
        //В метод передаем записанную выше при помощи лямбды реализацию метода тех. интерфейса.
        new Thread(r1).start();
        new Thread(r2).start();

        //Вывод в консоль -
        //Hello World
        //1
        //2
    }
}

