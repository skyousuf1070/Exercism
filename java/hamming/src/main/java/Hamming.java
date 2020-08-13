public class Hamming {
    private final String leftStrand;
    private final String rightStrand;

    public Hamming(String leftStrand, String rightStrand) {
        if (leftStrand.length()==0 && rightStrand.length()!=0) {
            throw new IllegalArgumentException("left strand must not be empty.");
        }
        if (rightStrand.length()==0 && leftStrand.length()!=0) {
            throw new IllegalArgumentException("right strand must not be empty.");
        }
        if (leftStrand.length()!=rightStrand.length()) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
        this.leftStrand = leftStrand;
        this.rightStrand = rightStrand;
    }

    public int getHammingDistance() {
        int hammingDistance = 0;
        if (leftStrand.length() == rightStrand.length() && rightStrand.length() != 0) {
            for (int i = 0; i < leftStrand.length(); i++) {
                if (leftStrand.charAt(i) != rightStrand.charAt(i)) {
                    hammingDistance++;
                }
            }
        }
        return hammingDistance;
    }
}
