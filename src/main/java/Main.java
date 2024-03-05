import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(containsPalindrome("civic"));
    }

    static boolean containsPalindrome(String sampleString) {
        if (sampleString.isEmpty()) {
            return false;
        }
        if (sampleString.length() == 1) {
            return true;
        }
        HashMap<Character, Integer> charCount = getCharacterIntegerHashMap(sampleString);
        int totalCount = 0;
        for (int value : charCount.values()) {
            totalCount += value;
        }
        return totalCount <= 1;
    }

    private static HashMap<Character, Integer> getCharacterIntegerHashMap(String sampleString) {
        HashMap<Character, Integer> charCount = new HashMap<>();
        for (char element : sampleString.toCharArray()) {
            if (charCount.containsKey(element)) {
                if (charCount.get(element) == 1) {
                    charCount.put(element, 0);
                }
                else {
                    charCount.put(element, 1);
                }
            }
            if (! charCount.containsKey(element)) {
                charCount.put(element, 1);
            }
        }
        return charCount;
    }
}
