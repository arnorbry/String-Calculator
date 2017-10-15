package is.ru.stringcalculator;

public class StringCalculator{

	public static int add(String numbers){
		if(numbers.equals("")){
			return 0;
		}
		else{
			return Integer.parseInt(numbers);
		}
	}
}