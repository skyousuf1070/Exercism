class ReverseString {

    String reverse(String inputString) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    	int len = inputString.length();
    	String outputString = "";
    	for (int i=len-1; i>=0; i--) {
    		outputString +=Character.toString(inputString.charAt(i));
    	}
    	return outputString;
    }
  
}