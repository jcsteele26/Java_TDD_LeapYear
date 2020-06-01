public class LeapYear{

    public boolean isLeapYear(int year) {
		if ((year % 4 == 0) || ((year % 400 == 0)) && (year % 100 == 0)) {
            return true;
        } else {
            return false;
        }
    }
    
    //public boolean isDivisibleByFour(int year){
//
//        return (year % 4 == 0);
//    }	
	
}