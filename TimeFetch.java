package testngpackage;

import java.util.Date;

public class TimeFetch {
	public static void main(String[] args) {
		Date dt=new Date();
		System.out.println(dt.getTime());
		Date dt1=new Date(dt.getTime());
		System.out.println(dt1);
		String dateformate = dt1.toString();
		String month = dateformate.substring(4, 7);
		String day = dateformate.substring(8, 10);
		String hour = dateformate.substring(11, 13);
		String min = dateformate.substring(14, 16);
		String sec=dateformate.substring(17, 19);
		String newdateformate = ("M-")+month.concat("D-").concat(day).concat("H-").concat(hour).concat("min-").concat(min).concat("sec-").concat(sec);
		System.out.println(newdateformate);
		
		
	}

}
 