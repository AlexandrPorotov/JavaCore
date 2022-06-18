package JavaCore.philosophyJava.PathThree;

import java.util.Date;
import java.util.Random;

/**
 * @author Alexandr Porotov
 * @version 1.00
 * @see <a href = https://github.com/AlexandrPorotov?tab=repositories>Мой GitHub</a>
 * <p>
 * В этом классе при помощи коментариев, записан конспект третей главы "Операторы"
 * </p>
 * <p>
 * Книга - "Филасофия Java" Брюс Эккель
 * </p>
 *  */
public class Operators {
    /**
     * Синонимия
     * */
    public static void main(String[] args) {
        print("Hello, today - " + new Date());

        //пример синонимии
        Tank t1 = new Tank();
        Tank t2 = new Tank();
        t1.level = 2;
        t2.level = 30;
        print("t1.level = " + t1.level);
        print("t2.level = " + t2.level);
        t1 = t2;
        /*после того как мы в переменную t1 записали ссылку на объект t2, t1 и t2 стали
        указывать на один объект
        A t1 вскоре будет удален сборщиком мусора.*/
        print("t1 = t2");
        print("t1.level = " + t1.level);
        print("t2.level = " + t2.level);

        /* Output:
        t1.level = 2
        t2.level = 30
        t1 = t2
        t1.level = 30
        t2.level = 30
         */

        /*Такая же ситуация может произойти если мы меняем переменную вызывая метод.*/
        Letter x = new Letter();
        x.c = 'a';
        print("1: x.c: " + x.c);
        Letter.f(x); //здесь мы перезаписываем значение c.
        print("2: x.c: " + x.c);

        /* Output:
        1: x.c: a
        2: x.c: z
        */
    }
    /**
     * <p>Метод упрощающий вывод сообщений в консоль</p>
     * @param inputString строка которую необходимо вывести в консоль
     */
    public static void print(String inputString) {
        System.out.println(inputString);
    }

}

/**
 * <p>Класс для демонстрации синонимии имен</p>
 * <p>Синонимия - ситуация когда мы можем перезаписать в переменную ссылку на один и тот же объект</p>*/
class Tank {
    int level;
}
/**
 * <p>Класс для демонстрации синонимии имен, при передаче аргументов методу</p>*/
class Letter {
    char c;
    /**
     * Метод присваивает внутреннему полю объекта класс Letter, значение "z".
     * @param x Letter.class*/
    public static void f(Letter x) {
        x.c = 'z';
    }
}

/**
 * <p>Математические операторы</p>*/
class MathOps {
    /**
     * <p>
     *     Основные математические операторы остаются неизменными почти во всех языках программирования
     * </p>
     * <ul>
     *     <li>Сложение (+)</li>
     *     <li>Вычитание (-)</li>
     *     <li>Деление (/)</li>
     *     <li>Умножение (*)</li>
     *     <li>Остаток от деления нацело (%)</li>
     * </ul>
     * <p>
     *     В Java так же используется укороченная форма записи для того, чтобы одновременно
     *     произвести операцию и присваивание.
     * </p>
     * <p>
     *     Например, что бы прибавить 4 к переменной x и присвоить результат x, используется x += 4;
     * </p>
     * <p>
     *     Следующей пример показывает использование математических операторов
     * @see MathOps#main(String[]) MathOps.Class
     * </p>
     */
    public static void main(String[] args) {
        //Создание и раскрутка генератора случайных чисел
        Random rand = new Random(47);
        int i,j,k;
        //Выбор значения от 1 до 100:
        j = rand.nextInt(100) + 1;
        System.out.println("j : " + j);
        k = rand.nextInt(100) + 1;
        System.out.println("k : " + k);
        i = j + k;
        System.out.println("j + k : " + i);
        i = j - k;
        System.out.println("j - k : " + i);
        i = k / j;
        System.out.println("k / j : " + i);
        i = k * j;
        System.out.println("k * j : " + i);
        i = k % j;
        System.out.println("k % j : " + i);
        j %= k;
        System.out.println("k %= j : " + j);

        // Можно применять ко всем примитивам
    }
}

/**
 * <p>
 *     Унарные операторы
 * </p>*/
class UnoOps {

}