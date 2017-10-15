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
					if(num.contains("\n")){
						int s = 0;
						String ns[] = num.split("\n");
						for(String n : ns){
							s = s + Integer.parseInt(n);
						}
						sum = sum + s;
					}
					else{
						sum = sum + Integer.parseInt(num);	
					}
				}
				return sum;
			}
			return Integer.parseInt(numbers);
		}
	}
}