package is.ru.stringcalculator;

public class Calculator {

    private static final String DELIMITERS = ",|\n";

    public static int add(String text) {
	return sum(extractNumbers(text));
    }

    public static int toInt(String string){
	return Integer.parseInt(string);
    }

    public static String[] extractNumbers(String string){
	if (string.isEmpty()){
            return new String[0];
        }
        else{
	    return string.split(DELIMITERS);
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
