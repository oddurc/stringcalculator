package is.ru.stringcalculator;

public class Calculator {

    public static int add(String text) {
	if (text.isEmpty()){
	    return 0;
	}
	else {
	    return toString(text);
	}
    }

    public static int toString(String string){
	return Integer.parseInt(string);
    }

}
