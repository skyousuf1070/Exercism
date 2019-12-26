class Leap {

    boolean isLeapYear(int year) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    	boolean leap = false;
    	if (year%4==0)
    	{
            if( year % 100 == 0)
            {
            	if ( year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }
            else
                leap = true;
        }
        else
            leap = false;
    	return leap;
	}
}