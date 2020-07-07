class Proverb {
	String[] listOfWords;
    Proverb(String[] words) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    	listOfWords = words;
    }

    String recite() {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    	int len = listOfWords.length;
    	String finalOutput = "";
    	if(len!=0) {
    		for (int i=0; i<len-1; i++)
    		{
    			String firstWord = listOfWords[i];
    			String secondWord = listOfWords[i+1];
    			finalOutput += "For want of a "+firstWord+" the "+secondWord+" was lost.\n";
    		}
    		String word = listOfWords[0];
    		finalOutput += "And all for the want of a "+word+".";
    	}
    	return finalOutput;
    }

}
