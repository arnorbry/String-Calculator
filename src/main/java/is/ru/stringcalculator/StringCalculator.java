package is.ru.stringcalculator;

public class StringCalculator{

	public static int add(String numbers){
		if(numbers.equals("")){
			return 0;
		}
		else{
			if(numbers.contains(",")){
				String nums[] = numbers.split(",");
				return Integer.parseInt(nums[0]) + Integer.parseInt(nums[1]);
			}
			return Integer.parseInt(numbers);
		}
	}
}