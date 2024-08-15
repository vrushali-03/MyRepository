package popUpDemo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class NewDemo {
	public static void main(String[] args) {
		
	
	String timeStamp= new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
	System.out.println(timeStamp);
	}
}
