import java.util.*;
public class TestCalendar {
	public void gettime(){
		Calendar c = Calendar.getInstance();
		c.set(2001, 0                 , 20, 0, 0, 0);
		System.out.print(c.getTime());
	}	
}
