import java.math.BigInteger;

class Grains {

    BigInteger grainsOnSquare(final int square) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        if (square<1 || square>64) {
            throw new IllegalArgumentException("square must be between 1 and 64");
        }
        /*BigInteger multiplier = new BigInteger("2");
        BigInteger result = multiplier.pow(square-1);
        return result;*/
        return new BigInteger("1").shiftLeft(square-1);
    }

    BigInteger grainsOnBoard() {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
     /*   BigInteger sum = new BigInteger("0");
        BigInteger num = new BigInteger("2");
        for (int exponent=0; exponent<64; exponent++) {
            sum = sum.add(num.pow(exponent));
            //System.out.println(num.pow(exponent));
        }
        return sum; */

        return new BigInteger("1").shiftLeft(64).subtract(new BigInteger("1"));
    }

}
