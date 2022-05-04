package CodeWars;

import java.util.Arrays;

public class ToCamelCase {
    public static void main(String[] args) {
        //Выходные данные
        String s =  toCamelCase("the-stealth-warrior");
        System.out.println(s);
        String s1 =  toCamelCase("The_Stealth_Warrior");
        System.out.println(s1);
    }
    //Необходимо реализовать метод, который возвращает строку в стиле CamelCase
    /*Input
    the-stealth-warrior
    The_Stealth_Warrior
    Output
    theStealthWarrior
    TheStealthWarrior */
    static String toCamelCase(String s){
        //StringBuilder resultString = new StringBuilder();
        //Мое решение с разделением строки при помощи if, можно заменить более лаконичным
        //String regex = "";
        //if(s.contains("-"))  regex = "-";
        //if(s.contains("_"))  regex = "_";
        //String[] tmp = s.split(regex);
        String[] tmp = s.split("[-_]"); //В комментарии сверху старое решение.
        //resultString.append(tmp[0]); (Старое решение) Для того что бы пропустить первое слово, но добавить его в результат.

        //Старое решение, пропускаем первое слово из массива. В последующих словах делаем первую букву заглавной.
        //Тоже самое можно сделать при помощи stream.
        /*for(int i = 1; i<tmp.length; i++) {
            String firstSubString = tmp[i].substring(0,1).toUpperCase();
            String secondSubString = tmp[i].substring(1);
            resultString.append(firstSubString);
            resultString.append(secondSubString);
        }
        return resultString.toString();*/
        return Arrays
                .stream(tmp,1,tmp.length)
                .map(str->str.substring(0,1).toUpperCase() + str.substring(1))
                .reduce(tmp[0],String::concat);
    }
}
