package JavaCore.streamApi.anonClass;

/* Анонимный класс в Java, один из видов внутреннего класса.
*  */

import JavaCore.streamApi.anonClass.AnonClassInterface;

public class AnonClass {

    public static void main(String[] args) {
        /* Создаем интерфейс с одним методом - технический интерфейс (интерфейс с контрактом в котором 1 метод)
        * затем создаем объект этого интерфейс и прямо в методе пишем реализацию метода интерфейса
        * на данный класс накладываются все ограничения внутренних классов. */
        AnonClassInterface insideClass = new AnonClassInterface() {
            @Override
            public void helloWorld() {
                System.out.println("Hello World!");
            }
        };
        insideClass.helloWorld();

        System.out.println(insideClass.getClass().getName()); //JavaCore.streamApi.anonClass.AnonClass$1
    }

    // Java не создает класс из интерфейса. За кулисами происходит следующее.
    //  public class AnonClass$1 implements AnonClassInterface {
    //      @Override
    //      public void helloWorld() {
    //          System.out.println("Hello World!");
    //      }
    //};
    // AnonClassInterface insideClass = new AnonClass$1();
}
