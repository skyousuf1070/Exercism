class IsbnVerifier {

    boolean isValid(String stringToVerify) {
        boolean isStringValid = false;
        String delimiter = "-";
        String[] parsedString = stringToVerify.split(delimiter);

        int len = 0;
        int counter = 10;
        int sum = 0;
        for (String str: parsedString) {
            int addedChars = 0;
            for(int i=0; i<str.length(); i++) {
                String checkDigit = Character.toString(str.charAt(i));
                try {
                    int digit = Integer.parseInt(checkDigit);
                    sum +=digit*counter;
                    counter--;
                    addedChars++;
                } catch (NumberFormatException e) {
                    if (checkDigit.equals("X") && (str.endsWith("X"))) {
                        sum += 10*counter;
                        counter--;
                        addedChars++;
                    } else {
                        break;
                    }
                }
            }
            len += addedChars;
        }

        if(sum%11==0 && len==10) {
            isStringValid = true;
        }
        return isStringValid;
    }

}
