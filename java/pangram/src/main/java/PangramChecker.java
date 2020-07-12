import java.util.ArrayList;

public class PangramChecker {

    public boolean isPangram(String input) {
        String lowerCaseInput = input.toLowerCase();
        ArrayList<Character> characters = new ArrayList<>();
        for (int i = 0; i < lowerCaseInput.length(); i++) {
            char character = lowerCaseInput.charAt(i);
            if (!characters.contains(character) && ((int) character >= (int) 'a' && (int) character <= (int) 'z')) {
                characters.add(character);
            }
        }
        return characters.size() == 26;
    }
}
