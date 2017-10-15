package is.ru.stringcalculator;

public class StringCalculator{

	public static int add(String numbers){
		if(numbers.equals("")){
			return 0;
		}
		else{
			if(numbers.contains(",")){
				String nums[] = numbers.split(",");
				int sum = 0;
				for(String num : nums){
					sum = sum + Integer.parseInt(num);
				}
				return sum;
			}
			return Integer.parseInt(numbers);
		}
	}
}