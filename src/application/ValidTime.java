package application;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidTime {
	
	private static Pattern pattern;
	private static Matcher matcher;
	
	private static final String TIME_PATTERN = "(([1][0-2]):[0-5][0-9]|([0-1][0-9]):[0-5][0-9]|([1-9]):[0-5][0-9]|[1][0-2]|[0-1][0-9]|[1-9][0-5][0-9]|[1-9])(\\s)?(?i)(a|p)";
	
	public ValidTime()
	{
		pattern = Pattern.compile(TIME_PATTERN);
	}
	
	public static boolean checkTime(final String digits) {
		if(digits.isEmpty())
		{
			return true;
		}
		matcher = pattern.matcher(digits);
		return matcher.matches();
	}
}
