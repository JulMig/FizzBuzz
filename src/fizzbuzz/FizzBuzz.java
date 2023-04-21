package fizzbuzz;


public class FizzBuzz {
	
	public static final String FIZZ = "fizz";

	public String fizzBuzz(int entree) {
		if (entree==3)
			return FIZZ;
		return Integer.toString(entree);
	}

}
