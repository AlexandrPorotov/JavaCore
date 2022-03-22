package JavaCore.cycles;

//Циклы в Java
// for
// while
// do while
// for each

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cycles {
    public static void main(String[] args) {
        //Цикл while еще называют цикл "пока" или "до тех пор пока".
        int i = 10;
        System.out.println("While");
        while (i > 0) { // Пока i больше 0, делай то что в {}
            i--;
            System.out.println(i);
        }

        //Цикл do while цикл while сначала проверяет условие, потом выполняет код (тело цикла),
        // а do..while сначала выполняет тело цикла, а потом проверяет условие, по этому тело цикла
        // выполнится, как минимум, 1 раз.
        int a = 10;
        System.out.println("do.. While");
        do {
            a--;
            System.out.println(a);
        } while (a > 0);

        //Цикл for, цикл со счетчиком. Так же может проходить по коллекции.
        System.out.println("for");
        for (int j = 0; j < 10; j++) {
            System.out.println(j);
        }
        System.out.println("for(Integer int : listOfInteger)");
        //Это и есть forEach
        List<Integer> listOfInteger = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        for (Integer integer : listOfInteger) { //Проход по каждому элементу коллекции
            System.out.println(integer);
        }


    }



}
