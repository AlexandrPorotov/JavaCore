package Tinkoff;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Twelve {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sumString = scanner.nextLine();
        String inputCoin = scanner.nextLine();
        int sum = Integer.parseInt(sumString);
        String[] inputArray = inputCoin.split(" ");
        int[] array = Arrays.stream(inputArray).mapToInt(Integer::parseInt).toArray();

        ArrayList<Integer> resultList = new ArrayList<>();

        for (int i = 0; i <= sum; i++) {
            for (int j = 0; j <= sum; j++) {
                for (int k = 0; k <= sum; k++) {
                    int resultSum = 1 + array[0]*i +array[1]*j + array[2]*k;
                    if(resultSum <= sum) resultList.add(resultSum);
                }
            }
        }


        int count = resultList.size();
        System.out.println(count);
    }
}
