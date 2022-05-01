package fuzzySearch;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {


    private static final String path = "E:\\PROJECTS\\JavaCore\\src\\fuzzySearch\\input.txt";
    private static List<String> firstList;
    private static List<String> secondList;
    private static String containsString;

    public static void main(String[] args) {

        try {
        splitInputList(readFile(path));
        writeFile(equalList(firstList,secondList));
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public static List<String> readFile(String filePath) throws IOException {

       return  Files.readAllLines(Paths.get(filePath));

    }

    public static void writeFile(List<String> inputList) throws IOException {
        FileWriter writer = new FileWriter("output.txt");
        for(String s: inputList) {
            writer.write(s + System.lineSeparator());
        }
        writer.close();
    }

    public static List<String> equalList(List<String> firstList, List<String> secondList){
        List<String> result = new ArrayList<>();

        for(String s:firstList){
            if(findContains(s,secondList)) {
                result.add(s + ":" + containsString);
            } else if(firstList.size() == 1 && secondList.size() == 1) {
                result.add(firstList.get(0) + ":" + secondList.get(0));
            } else {
               result.add(s + ":?");
            }
        }
        return result;
    }

    public static void splitInputList (List<String> list) {

        int n = Integer.parseInt(list.get(0));
        int m = Integer.parseInt(list.get(n+1));
        if(n >= m){
            firstList = list.stream().skip(1).limit(n).toList();
            secondList = list.stream().skip(n+2).limit(m).toList();
        } else {
            secondList = list.stream().skip(1).limit(n).toList();
            firstList = list.stream().skip(n + 2).limit(m).toList();
        }

    }

    public static boolean findContains (String s, List<String> list){
        boolean result = false;
            for (String s1:list){
                if(chekString(s) | chekString(s1)){
                    if(equalString(s,s1)) {
                        result = true;
                        containsString = s1;
                    }
                } else if (equalWord(s,s1)) {
                    result = true;
                    containsString = s1;
                }
            }

        return result;
    }

    public static boolean chekString(String inputString){
        return inputString.contains(" ");
    }

    public static List<String> splitString (String inputString){
        List<String> result = new ArrayList<>();
        result =  Arrays.stream(inputString.split(" ")).toList();
        if (inputString.contains(" с ")) {
            result = result.stream().filter(s -> s.length()>1).toList();
        }
        return result;
    }

    public static boolean equalString(String s, String s1) {
        List<String> splitS = new ArrayList<>();
        List<String> splitS1 = new ArrayList<>();
        int coincidences = 0;
        boolean result = false;
        if(chekString(s)) {
            splitS = splitString(s);
            for(String ss:splitS) {
                if(equalWord(ss,s1)){
                    coincidences++;
                }
            }
        }
        if(chekString(s1)) {
            splitS1 = splitString(s1);
            for(String ss1:splitS1) {
                if(equalWord(s,ss1)) {
                    coincidences++;
                }
            }
        }
        if(chekString(s) || chekString(s1)) {
            for(String ss:splitS){
                for (String ss1:splitS1){
                    if(equalWord(ss,ss1)){
                        coincidences++;
                    }
                }
            }
        }

        if(coincidences >= 1) {
            result = true;
        }
        return result;
    }

    public static boolean equalWord (String s, String s1) {
        int index = levenstain(s,s1);
        boolean result = false;
        int lengthDifferent  = Math.abs(s.length() - s1.length());
        if(index <= 3 && lengthDifferent<=3 && s.contains(s1.substring(0,3)) ) { //&& s.contains(s1.substring(0,2))
            result = true;
        }
        return result;
    }

    public static int levenstain(String str1, String str2) {
        // Массивы должны быть одинаковой длины, т.к. отражают две строки (или столбца) одной и той же таблицы (см. алгоритм расстояния Левенштейна)
        int[] Di_1 = new int[str2.length() + 1];
        int[] Di = new int[str2.length() + 1];

        for (int j = 0; j <= str2.length(); j++) {
            Di[j] = j; // (i == 0)
        }

        for (int i = 1; i <= str1.length(); i++) {
            System.arraycopy(Di, 0, Di_1, 0, Di_1.length);

            Di[0] = i; // (j == 0)
            for (int j = 1; j <= str2.length(); j++) {
                int cost = (str1.charAt(i - 1) != str2.charAt(j - 1)) ? 1 : 0;
                Di[j] = min(
                        Di_1[j] + 1,
                        Di[j - 1] + 1,
                        Di_1[j - 1] + cost
                );
            }
        }

        return Di[Di.length - 1];
    }

    private static int min(int n1, int n2, int n3) {
        return Math.min(Math.min(n1, n2), n3);
    }

}
