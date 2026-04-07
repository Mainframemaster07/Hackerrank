import java.io.IOException;
import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.Scanner;

class Result {
	public static String findDay(int month, int day, int year) {
		Calendar cal = Calendar.getInstance();
		cal.set(year, month - 1, day);
		return new DateFormatSymbols().getWeekdays()[cal.get(Calendar.DAY_OF_WEEK)].toUpperCase();
		 return LocalDate.of(year, month, day).getDayOfWeek().toString();
	}

}
public class Solution {
	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		int month = s.nextInt();
		int day = s.nextInt();
		int year = s.nextInt();
		String res = Result.findDay(month, day, year);
		System.out.println("result : " + res);
		s.close();
	}
}
