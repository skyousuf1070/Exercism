class Darts {
    double x, y;
    Darts(double x, double y) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        this.x = x;
        this.y = y;
    }

    int score() {
        double dartSum = Math.sqrt(x*x+y*y);
        if(dartSum>=0 && dartSum<=1) {
            return 10;
        } else if(dartSum>1 && dartSum<=5) {
            return 5;
        } else if(dartSum>5 && dartSum<=10) {
            return 1;
        } else {
            return 0;
        }
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

}
