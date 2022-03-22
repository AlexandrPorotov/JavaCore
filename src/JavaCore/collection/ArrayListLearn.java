package JavaCore.collection;

/*ArrayList — реализует интерфейс List. Как известно, в Java массивы имеют фиксированную длину,
и после того как массив создан, он не может расти или уменьшаться. ArrayList может менять свой размер
во время исполнения программы, при этом необязательно указывать размерность при создании объекта.
 Элементы ArrayList могут быть абсолютно любых типов, в том числе и null.*/

import java.util.ArrayList;

public class ArrayListLearn {

    public static void main(String[] args) {
        /*Создание ArrayList
          ArrayList<Тип> имя =new ArrayList<Тип>(Размер);*/

        ArrayList<Object> arrayList = new ArrayList<>(); /*Может хранить любой объект*/

        /*Коллекции, в отличие от массивов, не могут хранить примитивные типы: только типы-классы.
        Поэтому если вам нужна коллекция с типом int, используйте вместо него тип-обертку — Integer.*/

        ArrayList<String> list = new ArrayList<>(); /*Создаем лист строк*/
        ArrayList<String> list2 = new ArrayList<>(); /*Для примера добавления коллекции в коллекцию*/
        list2.add("example");

        /*Внутри ArrayList хранится обычный массив*/
        /*у ArrayList’a есть специальный механизм по работе с ним:
        Когда этот внутренний массив заполняется, ArrayList создает внутри себя новый массив.
        Его размер = (размер старого массива * 1,5) +1.
        Все данные копируются из старого массива в новый
        Старый массив удаляется сборщиком мусора.*/

        /*Добавление элементов, новый элемент добавляется в конце списка*/
        /* методы add()
        1	void add(int index, Object element)
            Вставляет указанный элемент в указанный индекс позиции в этом списке.
            Выбрасывает IndexOutOfBoundsException, если указанный индекс выходит за допустимые пределы
            (index < 0 || index > size()).
        2	boolean add(Object o)
            Добавляет указанный элемент в конец этого списка.
        3	boolean addAll(Collection c)
            Добавляет все элементы в указанной коллекции в конец этого списка в том порядке,
            в котором они возвращаются итератором указанной коллекции. Вызывает NullPointerException,
            если указанная коллекция имеет значение null (нулевая).
        4	boolean addAll(int index, Collection c)
            Вставляет все элементы указанной коллекции в этот список, начиная с указанной позиции.
            Вызывает NullPointerException, если указанная коллекция имеет значение null.
         */

        String string1 = "Object String1";

        list.add(0,"String number one"); /* Добавляем строку в индекс 0*/
        list.add("String number two"); /* Добавляем строку в конец списка */
        list.add(string1); /* Добавляем объект строку */
        list.addAll(list2); /* Добавляем список в конец списка*/
        list.addAll(2,list2); /* Добавляем список в индекс 2*/

        System.out.println(list); /*[String number one, String number two, example, example]*/

        /* boolean contains(Object o)
           Возвращает true, если этот список содержит указанный элемент.
           Если точнее, то возвращает true тогда и только тогда, когда этот список содержит
           хотя бы один элемент e такой, что (o==null ? e==null : o.equals(e)).
         */

        System.out.println(list.contains("String number 2")); /* false */
        System.out.println(list.contains("String number two")); /* true */
        System.out.println(list.contains(string1)); /* true */

        /* void ensureCapacity(int minCapacity)
           Увеличивает емкость этого экземпляра ArrayList, если это необходимо, чтобы гарантировать,
           что он может удерживать, по крайней мере, количество элементов, заданных аргументом
           минимальной емкости.
         */

        list2.ensureCapacity(10);

        /*Object get(int index)
        Возвращает элемент в указанной позиции в этом списке. Вызывает IndexOutOfBoundsException,
        если указанный индекс выходит за допустимые пределы (index < 0 || index >= size()).
         */
        String one = list.get(0);
        String two = list.get(1);
        System.out.println(one + " " + two); /*String number one String number two*/

        /*int indexOf(Object o)
          Возвращает индекс в этом списке первого упоминания указанного элемента или -1,
          если List не содержит этот элемент.*/

        int numberOfElement = list.indexOf(string1);
        System.out.println(numberOfElement); /* 3 */
        int numberOfElement2 = list.indexOf("String number one");
        System.out.println(numberOfElement2); /* 0 */

        /*int lastIndexOf(Object o)
        Возвращает индекс в этом списке последнего упоминания указанного элемента или -1,
        если List не содержит этот элемент.
         */

        int start = list.indexOf("example");
        int end = list.lastIndexOf("example");
        System.out.println("start - " + start + ". end - " + end); /*start - 2. end - 4*/

        /*Object remove(int index)
        Удаляет элемент в указанной позиции в этом списке. Вызывает IndexOutOfBoundsException,
        если индекс выходит за допустимые пределы (index < 0 || index >= size()).
         */

        list.remove(3);

        /*protected void removeRange(int fromIndex, int toIndex)
        Удаляет из этого списка все элементы, индекс которых находится между fromIndex,
        включительно, и toIndex, исключительно.
         */

        /*Object set(int index, Object element)
        Заменяет элемент в указанной позиции в этом списке указанным элементом.
         Вызывает IndexOutOfBoundsException, если указанный индекс выходит за допустимые
         пределы (index < 0 || index >= size()).
         */
        list.set(0,"Заменил строку при помощи .set()");
        System.out.println(list);

        /* .size() - возвращает кол-во элементов в списке */
        System.out.println(list.size());

        /*Object[] toArray()
        Возвращает массив, содержащий все элементы в этом списке в правильном порядке.
        Вызывает NullPointerException, если указанный массив равен null (нулевой).*/

        String[] arrayString = new String[4];
        list.toArray(arrayString);
        System.out.println(arrayString[0]);


        /*	void clear()
            Удаляет все элементы из этого списка.*/
        list.clear();
        System.out.println(list); /* [] */






    }
}
