package JavaCore.streamApi.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Exp2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
        System.out.println(list);
        list.stream().filter(n -> n % 2 == 0).forEach(n -> System.out.println(n));

        list.stream().map(z -> { //в мапере у нас поток заходит с типом int а выходит с типом string
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < z; i++) {
                stringBuilder.append("A");
            }
            return stringBuilder.toString();
        }).forEach(str -> System.out.println(str));

        List<Integer> noSortedList = new ArrayList<>(Arrays.asList(6,2,33,54,75,26,17,38));
        noSortedList.stream().sorted().limit(3).forEach(System.out::println);
        Optional<Integer> opt = noSortedList.stream().filter(n -> n<7).findFirst();
        //Optional возвращает либо тот тип который мы указали, либо null. Так же есть много удобных методов
        opt.ifPresent(n -> System.out.println(n));

        //(n -> System.out.println(n)) можно заменить на System.out::println , получается говорим следующе
        // у нас есть поток объектов n  и каждый этот объект передадим в метод println
        //:: - ссылка на метод

        //Как записывать в лямбду - пример.
        //Мы вызвали у объекта list метод .stream(). затем .filter(), в фильтр нам необходимо передать экземпляр
        //анонимного класса с реализацией 1го метода. Т.е. реализацию тех. интерфейса. Выглядит она следующим образом
        //
        //list.stream().filter(new Predicate<Integer>() { - можем убрать, тк мы и так знаем что это объект интерфейса
        //    @Override - тоже можем убрать, тк мы знаем что нам надо переоопределить 1 метод.
        //    public boolean test(Integer integer) { - здесь нам нужно оставить только (), тк метод принимает аргументы в итоге остается n
        //        return integer % 2 == 0; - убираем фигурные скобки и получаем только наше условие.
        //    }
        //})
        //n -> n % 2 == 0 передаем в метод n и пропускаем только n % 2 == 0.
        // но так же если мы кликнем по анонимному классу, правой кнопкой мыши, идея может за нас все свернуть в лямбду
    }
}
