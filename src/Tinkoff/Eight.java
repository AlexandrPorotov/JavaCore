package Tinkoff;

import java.util.Arrays;
import java.util.Scanner;

public class Eight {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String firstInputString = scanner.nextLine();
        double[] meetingXY = Arrays.stream(firstInputString.split(" ")).mapToDouble(Double::parseDouble).toArray();

        System.out.println("X = " + meetingXY[0] + "; Y = " + meetingXY[1] + ";");

        /*Скорее всего задача решается при помощи рекурсии. Ищем центр маленькой фигуры и берем центр за угол 0.0
        * затем опять ищем ее центр и берем новый центр за угол 0.0
        * условие выхода, когда будет достигнута 5 цифра до 0.*/

        /*find X*/

        /*find Y*/


    }

}
