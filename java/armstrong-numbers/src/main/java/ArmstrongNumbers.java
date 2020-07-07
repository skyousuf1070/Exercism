class ArmstrongNumbers {

	int findNoOfDigits(int n) {
		int count = 0;
		while(n>0) {
			count++;
			n = n/10;
		}
		return count;
	}

	boolean isArmstrongNumber(int numberToCheck) {
		int n = numberToCheck;
		int count = findNoOfDigits(numberToCheck);
		int generatedNum = 0;
		while(n>0) {
			int remainder = n%10;
			generatedNum += Math.pow(remainder,count);
			n = n/10;
		}
		return generatedNum==numberToCheck;
	}

}
