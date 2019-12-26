import java.util.ArrayList;
import java.util.Arrays;

class ResistorColorDuo {
    int value(String[] colors) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        ArrayList<String> colorCodes = new ArrayList<String>(Arrays.asList("black","brown","red","orange","yellow",
                "green","blue","violet","grey","white"));
        int finalOutput = 0;
        int multiplier = 10;
        for (int i=0; i<2; i++) {
            int colorCode = colorCodes.indexOf(colors[i]);
            finalOutput += colorCode*multiplier;
            multiplier/=10;
        }
        return finalOutput;
    }
}
