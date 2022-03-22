package JavaCore.streamApi.example;

import java.util.*;
import java.util.stream.Collectors;

//пример использования потоков (нужно знать про Лямбды и Анонимные классы).

public class MainApp {
    //1. Создаем класс сотрудника с полями и его конструктор.
    private static class Person {
        private String name;
        private String position;
        private int age;

        public Person(String name, String position, int age) {
            this.name = name;
            this.position = position;
            this.age = age;
        }
    }

    public static void main(String[] args) {
        //2. Создадим лист сотрудников.
        List<Person> persons = new ArrayList<>(Arrays.asList(
                new Person("Bob1","Engineer", 45),
                new Person("Bob2","Engineer", 37),
                new Person("Bob3","Manager", 31),
                new Person("Bob4","Manager", 34),
                new Person("Bob5","Engineer", 44),
                new Person("Bob6","CEO", 50)
        ));
        //3. Допустим мы хотим пройтись по всему списку и достать из него только инженеров
        List<Person> engineers = new ArrayList<>();
        for(Person p : persons) {
            if(p.position.equals("Engineer")) {
                engineers.add(p);
            }
        }
        //4. Затем мы хотим их отсортировать по возрасту.
        Collections.sort(engineers, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.age - o2.age;
            }
        });
        //5. В конце мы хотим получить список инженеров отсортированных по возрасту выведенных в консоль.
        List<String> engineersNames = new ArrayList<>();
        for (Person p : engineers) {
            engineersNames.add(p.name);
        }
        System.out.println(engineersNames); //[Bob1, Bob5, Bob2]
        // Задачу выполнили, однако много строк кода, несколько промежуточных листов и циклов.

        // Ее можно решить значительно проще, использовав Stream API.
        // Берем лист и открываем поток данных, (Образно говоря, у нас есть поток данных, который течет
        // и встречает на своем пути модификаторы. Пройдя через которые он изменяется.).

        List<String> engineersNames2 =  persons.stream()
                .filter(person -> person.position.equals("Engineer")) //условия фильтра пишем на лямбде
                .sorted((o1, o2) -> o1.age - o2.age) //сортируем по возрасту (компоратор записываем в лямбду)
                .map(person -> person.name) // из сотрудника получаем имя
                .collect(Collectors.toList()); // собираем все в лист
        System.out.println(engineersNames2);
    }
}
