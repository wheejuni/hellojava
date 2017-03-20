package hellojava;

public class UnitConverter {
	private UnitConverter(){}
	static UnitConverter launchUnitConv(){
		return new UnitConverter();
	}
	
	static double KILOGRAMS_PER_POUND = 0.45359237; 
	static double CENTIMETERS_PER_INCH = 2.54;
	static double POUNDS_PER_KILOGRAM = 2.204623;
	static double INCHES_PER_CENTIMETER = 0.393701;
	
	  public static double toPounds(double kilograms) {
		  return kilograms * POUNDS_PER_KILOGRAM;
	        
	    }

	    public static double toKilograms(double pounds) {
	        return pounds * KILOGRAMS_PER_POUND;
	    }

	    public static double toCentimeters(double inches) {
	        return inches * CENTIMETERS_PER_INCH;
	    }

	    public static double toInches(double centimeters) {
	        return centimeters * 0.393701;
	    }

	    public static double toFahrenheit(double celsius) {
	        return celsius * (9 / 5) + 32;
	    }

	    public static double toCelsius(double fahrenheit) {
	        return (fahrenheit - 32) * (5 / 9); 
	    }

}
