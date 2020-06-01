import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class LeapYearTest {

       
	@Test
	public void year1996() {
        LeapYear lp = new LeapYear(); //Create instance of Leap Year
       // boolean isLeapYear = isLeapYear(1996);
		assertEquals(true, lp.isLeapYear(1996)); //Test if year is leap year
    }
    
    @Test
    public void year1900(){
        LeapYear lp = new LeapYear();
        assertEquals(true, lp.isLeapYear(1900));

    }

    @Test
    public void year2000(){
        LeapYear lp = new LeapYear();
        assertEquals(true, lp.isLeapYear(2000));

    }



	
	

	

	
    
}