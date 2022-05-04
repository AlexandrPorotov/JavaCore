package Tinkoff;

import java.util.Scanner;

public class Five {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long l = scanner.nextLong();
        long r = scanner.nextLong();

        int count = 0;

        int length = Long.toString(r).length();

        StringBuilder number = new StringBuilder();

        for (int i = 0; i < length ; i++) {
            long a = Long.parseLong(number.append(1).toString());
            for (long j = 1; j <= 9 ; j++) {
                if(l <= (j*a) && r >= (j*a)) {
                    count++;
                }
            }
        }
        System.out.println(count);



    }


}
