package JavaCore.philosophyJava.PathTwo;


import JavaCore.dataType.DataType;

/**
 * @author Alexandr Porotov
 * @version 1.00
 * @*/
public class Objects {

     /**
    <p>
      Глава 2
      <br>
      "ВСЕ ЯВЛЯЕТСЯ ОБЪЕКТОМ"
    </p>
    <p>
      ССЫЛКИ
    </p>
    <p>
    Почти все в Java является объектом.
    Вы обращаетесь с любыми данными как с объектом, и поэтому повсюду используется единый последовательный
    синтаксис.
    Хотя вы обращаетесь со всеми данными как с объектом, идентификатор, которым вы манипулируете, на самом деле
    представляет собой ссылку на объект.
    </p>
    <p>
     Телевизор - объект, дистанционный пульт управления - ссылка на объект.
    </p>
      <p>
    Так же пульт может существовать сам по себе, без телевизора. Таким образом, сам факт наличия ссылки
    еще не значит наличия объекта присоединенного к ней.
      </p>
    <br>
      <p>
    Пример - String s;
        </p>
      <br>
      <p>
    Создана ссылка, но не объект. При послании сообщений к s (вызове методов) произойдет ошибка.
    Соответственно, безопаснее инициализировать ссылки при их создании.
        </p>
      <br>
    String s = "Hello, World!";
    <br><br>
    <p>
    ВСЕ ОБЪЕКТЫ ДОЛЖНЫ СОЗДАВАТЬСЯ ЯВНО
    </p> <br>
    <p>
      </p>String s = new String("Hello, World!");
      </p> <br>
      <p>
    Это не только значит "Предоставьте мне новый объект String", но так же указывает как создать строку
    посредством передачи начального набора символов.
      </p>
    <br><br>
      <p>
    ГДЕ ХРАНЯТСЯ ДАННЫЕ
      </p> <br>
      <p>
    Полезно отчетливо представлять, что происходит во время работы программы, и в частности,
    как данные размещаются в памяти. Существует пять разных мест для хранения данных.
      </p>
      <ol>
      <li>Регистры.</li>
      <li>Стек.</li>
      <li>Куча.</li>
      <li>Постоянное хранилище.</li>
      <li>Внешнее хранилище.</li>
      </ol>
    <br>
      <p>
    Регистры - Это самое быстрое хранилище, потому что данные хранятся прямо внутри процессора.
    У вас нет прямого доступа к регистрам, вы не найдете ни малейших следов их поддержки в языке.
        </p><br>
      <p>
    Стек - Эта область хранения данных находится в общей оперативной памяти (RAM), но процессор
    предоставляет прямой доступ к ней с использованием указателя стека.
    Указатель стека перемещается вниз для выделения памяти или вверх для ее освобождения.
    Во время выполнения программы компилятор должен знать жизненный цикл объекта.
    Объекты не хранятся в стеке. Только ссылки и некоторые данные.
    Чрезвычайно быстрый и эффективный способ размещения данных.
      </p><br>
      <p>
    Куча - Пул памяти общего назначения (находится так же в RAM), в котором размещаются все объекты.
    Преимущество кучи в том, что компилятору необязательно знать как долго просуществуют находящиеся там объекты.
    Таким образом получаем преимущество в гибкости.
    Когда мы создаем новый объект используя ключевое слово new, в куче выделяется область памяти под него.
      </p><br>
      <p>
    Постоянное хранилище - Значения констант часто встраиваются прямо в код программы, тк они неизменны.
    Иногда такие данные могут размещаться в постоянной памяти (ORM).
      </p><br>
      <p>
    Внешнее хранилище - Если данные хранятся вне программы, они могут существовать и тогда, когда она не
    выполняется.
      </p><br><br>
      <p>
    ОСОБЫЙ СЛУЧАЙ: ПРИМЕТИВНЫЕ ТИПЫ
      </p><br>
      <p>
    Одна из групп типов, часто применяемых при программировании, требует особого обращения.
    При создании объекта с помощью new - особенно маленькой, простой переменной - недостаточно
    эффективно, так как new помещает объекты в кучу. В таких случаях Java создает "автоматическую" переменную,
    не являющейся ссылкой. Переменная напрямую хранит значение и размещается в стеке.
      </p><br>
      <p>
    В Java размеры всех переменных строго фиксированны.
    (более подробно разобрал в классе
      {@link DataType DataType.class})
      </p><br>

      <p>
      Массивы
      </p>
      <br>
      <p>
      Массивы в Java - гарантированно инициализируются, к ним невозможен доступ за пределами их границ.
      При объявлении массива объектов на самом деле создается массив ссылок, и каждая из этих ссылок автоматически
      инициализируется специальным значением, представленным ключевым словом null. Оно означает что ссылка
      на самом деле не указывает на объект. Вам необходимо присоединять объект к каждой ссылке перед тем, как
      ее использовать, или при попытке обращения по ссылке null во время исполнения программы произойдет ошибка.
      Таким образом, типичные ошибки при работе с массивами в Java предотвращаются заблаговременно.
      </p>
      <br>
      <p>
      ОБЪЕКТЫ НИКОГДА НЕ ПРИХОДИТСЯ УДАЛЯТЬ
      </p>
      <br>
      <p>

      </p>
    */
    public static void main(String[] args) {

    }
    /**<p>
     *     Метод создающий массив
     * @param capacity размерность
     * @return возвращает массив, размерностью равной capacity
     * </p>*/
    public static int[] newArray(int capacity) {
        return new int[capacity];
    }
}