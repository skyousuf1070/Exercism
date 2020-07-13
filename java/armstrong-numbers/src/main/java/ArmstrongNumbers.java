class ArmstrongNumbers {

    private int orderOf(int number) {
        int order = 0;
        while (number > 0) {
            order++;
            number = number / 10;
        }
        return order;
    }

    public boolean isArmstrongNumber(int numberToCheck) {
        int number = numberToCheck;
        int order = orderOf(numberToCheck);
        int generatedNumber = 0;
        while (number > 0) {
            int remainder = number % 10;
            generatedNumber += Math.pow(remainder, order);
            number = number / 10;
        }
        return generatedNumber == numberToCheck;
    }

}
