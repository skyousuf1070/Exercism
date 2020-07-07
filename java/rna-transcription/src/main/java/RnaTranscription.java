class RnaTranscription {

    String transcribe(String dnaStrand) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        String rnaStrand = "";
        for (int i=0; i<dnaStrand.length(); i++) {
            char necleostide = dnaStrand.charAt(i);
            if(necleostide=='G') {
                rnaStrand+="C";
            } else if(necleostide=='C') {
                rnaStrand+="G";
            } else if (necleostide=='T') {
                rnaStrand+="A";
            } else if(necleostide=='A') {
                rnaStrand += "U";
            }
        }
        return rnaStrand;
    }

}
