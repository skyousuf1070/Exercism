class SumOfMultiples {
    int number;
    int[] set;
    SumOfMultiples(int number, int[] set) {
        this.number = number;
        this.set = set;
    }

    int getSum() {
        int sum = 0;
        for (int i=1; i<number; i++) {
            for (int j=0; j<set.length; j++) {
                int num = set[j];
                if (num!=0 && i%num == 0) {
                    sum += i;
                    break;
                }
            }
        }
        return sum;
    }

}
