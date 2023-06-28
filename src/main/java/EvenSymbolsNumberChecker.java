import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class EvenSymbolsNumberCheckerLevel2 {


    public static HashSet<Character> symbolsChecker (ArrayList<String> str) {
        int counter = 0;
        int index = 0;
        HashSet<Character> chars = new HashSet<>();
        while (counter < 2 && index < str.size()) {
            String stringFromArray = str.get(index);
            Map<Character, Integer> letters = countCharacters(stringFromArray);

            HashSet<Character> evenSymbols = checkAllSymbolsEven(letters);

            if (!evenSymbols.isEmpty()) {
                chars.addAll(evenSymbols);
                counter += 1;
            }
            index++;
        }
        return chars;
    }

    private static Map<Character, Integer> countCharacters (String inputString) {
        Map<Character, Integer> letters = new HashMap<>();
        for (char ch : inputString.toCharArray()) {
            int count = letters.getOrDefault(ch, 0);
            letters.put(ch, count + 1);
        }
        return letters;
    }

    private static HashSet<Character> checkAllSymbolsEven (Map<Character, Integer> countedCharacters) {
        HashSet<Character> temp = new HashSet<>();
        for (Map.Entry<Character, Integer> pair : countedCharacters.entrySet()) {
            if (pair.getValue() % 2 == 0)
                temp.add(pair.getKey());
            else {
                temp.clear();
                break;
            }
        }
        return temp;
    }
}
