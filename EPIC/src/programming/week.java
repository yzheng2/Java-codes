package programming;


	
	import java.io.*; 
import java.util.*; 
import java.text.*; 

	public class week { 
	public static void main (String[] args) { 
	String dt = "09/13/2012"; 
	printWeek(dt); 
	} 
	static void printWeek(String str) { 
	SimpleDateFormat ft = new SimpleDateFormat("MM/dd/yyyy"); 
	SimpleDateFormat sft = new SimpleDateFormat("E MM/dd/yyyy"); 
	try {	
	Date date = ft.parse(str); 

	Calendar cal = new GregorianCalendar(); 
	cal.setTime(date); 
	int temp = cal.get(Calendar.DAY_OF_WEEK); 
	System.out.println(temp); 
	while (temp > 0) { 
	cal.add(Calendar.DATE, -1); 
	temp--; 
	} 
	while (temp < 7) { 
	cal.add(Calendar.DATE, 1); 
	System.out.println(sft.format(cal.getTime())); 
	temp++; 
	} 
	} catch(ParseException e) { 
	System.out.println("Unparsable"); 
	}	

	} 

	}


