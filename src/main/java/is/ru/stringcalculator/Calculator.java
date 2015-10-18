package is.ru.stringcalculator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {

    private static final String DELIMITERS = ",|\n";

    public static int add(String text) {
	return sum(extractNumbers(text));
    }

    public static int toInt(String string){
	return Integer.parseInt(string);
    }

    public static String[] extractNumbers(String string){
	String delimiters = ",|\n";
	
	if (string.isEmpty()){
            return new String[0];
        }
        else if (string.startsWith("//")){
	    Matcher m = Pattern.compile("//(\\[*.*\\]*)\n(.*)").matcher(string);
	    if (m.find()){
		delimiters = m.group(1);
		string = m.group(2);
	    }
	    
	    return string.split(delimiters);
	
	}
	
	else{
	    return string.split(delimiters);
	}
    }
   
    public static int sum(String[] numbers){
	int total = 0;
	for (String number : numbers){
	    total += toInt(number);
	}
	return total;
    }

}
