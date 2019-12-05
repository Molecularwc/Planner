package application;

public class ValidTime {
	
	static boolean valid = false;
	
	public ValidTime()
	{
		
	}
	
	public static boolean checkTime(String digits) {
		if(digits == null || digits.isEmpty())
			return valid;
		for(char c : digits.toCharArray()) {
			if(Character.isDigit(c)) {
				valid = true;
			}else if(!Character.isDigit(c)) {
				valid = false;
				break;
			}
		}
		return valid;
	}
	
	public static boolean checkTimeStamp(char ts) {
		switch(ts) {
			case 'A':
			case 'a':
				valid = true;
				break;
			case 'P':
			case 'p':
				valid = true;
				break;
			default:
				valid = false;
				break;
		}
		return valid;
	}

}
