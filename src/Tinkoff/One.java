package Tinkoff;

import java.util.Arrays;
import java.util.Scanner;

public class One {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputArray = input.split(" ");
        int[] array = Arrays.stream(inputArray).mapToInt(Integer::parseInt).toArray();

        int a = array[0];
        if (!(a >= 1 && a <= 100)) return;
        int b = array[1];
        if (!(b >= 1 && b <= 100)) return;
        int c = array[2];
        if (!(c >= 1 && c <= 100)) return;
        int d = array[3];
        if (!(d >= 1 && d <= 100)) return;

        if ( d <= b ) {
            System.out.println(a);
        } else {
            int path = Math.abs((d-b)*c);
            int result = a + path;
            System.out.println(result);
        }

    }
}
