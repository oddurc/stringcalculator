package is.ru.stringcalculator;

public class Calculator {

    public static int add(String text) {
	if (text.isEmpty()){
	    return 0;
	}
	else if(text.contains(",")){
	    String[] numbers = text.split(",");
	    int total = 0;
	    for (String number : numbers){
		total += toInt(number);
	    }
	    
	    return total;
	}

	else {
	    return toInt(text);
	}
    }

    public static int toInt(String string){
	return Integer.parseInt(string);
    }

}
