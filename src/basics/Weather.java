package basics;

public class Weather {
	public static void main(String[] args) {
		// What to wear based on the weather (temperature and sun condition)
		int temperature = 61;
		String sunCondition = "Not Sunny";
		
		if (temperature > 80) {
			System.out.println("Weather is plesant");
		} 
		else if (temperature > 60 && sunCondition == "Sunny"){			
			System.out.println("T is a little cooler");
		}	
		else if (temperature > 60 && sunCondition != "Sunny"){
			System.out.println("T overcast maybe");
		}		
		else {
			System.out.println("T is really cold! I am freezing");
		}
		
	}
}
