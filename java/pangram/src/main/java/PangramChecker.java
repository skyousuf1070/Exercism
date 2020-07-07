import java.util.HashMap;

public class PangramChecker {

    public boolean isPangram(String input) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        String lowerCaseInput = input.toLowerCase();
        if (input.length() <= 0) {
            return false;
        } else {
            HashMap <Character, Integer> hm = new HashMap<Character, Integer>();
            for (int i=0; i<input.length(); i++) {
                char c = input.charAt(i);
                if(c==' ' || c=='_') {
                    continue;
                }
                System.out.println(c);
                if (!hm.containsKey(c) && ((int)c>=(int)'a' && (int)c<=(int)'z')) {
                    hm.put(c,1);
                }
            }
            System.out.println(hm.toString());
            if (hm.size()!=26) {
                System.out.println("Yes");
                return false;
            }
            return true;
        }
    }
}
