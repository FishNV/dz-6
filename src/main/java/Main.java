import java.util.ArrayList;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("мама");
        arrayList.add("тато");
        arrayList.add("їжїж");
        arrayList.add("йойо");

        HashSet<Character> received = EvenSymbolsNumberChecker.symbolsChecker(arrayList);

        for (Character ch : received) {
            System.out.println(ch);
        }

    }
}

