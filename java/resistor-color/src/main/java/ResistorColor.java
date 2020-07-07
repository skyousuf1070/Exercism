import java.util.ArrayList;
import java.util.Arrays;
class ResistorColor {
	String[] colorCodes = {"black","brown","red","orange","yellow","green","blue","violet","grey","white"};
	int indexOfColor;
    int colorCode(String color) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    	//return colorCodes.indexOf(color);
    	for (int i=0; i<colorCodes.length; i++) {
    		if(colorCodes[i].equals(color)) {
    			indexOfColor = i;
    		}
    	}
    	return indexOfColor;
    }

    String[] colors() {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    	return colorCodes;
    }
}
