package CodeWars;


//Решалось оказываться очень просто...

public class MorseCodeDecoder {

    public static void main(String[] args) {
        System.out.println(decode("  H E Y   J U D E  "));
    }
    public static String decode (String str) {
        String result = "";
        for (String word : str.trim().split("   ")) {
            for (String letter : word.split("\\s+")) {
                result += letter;
            }
            result += ' ';
        }
        return result.trim();
    }
}
