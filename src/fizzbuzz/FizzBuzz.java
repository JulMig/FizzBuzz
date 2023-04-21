package fizzbuzz;


public class FizzBuzz {
	
	private int[] nombresSpeciaux = {3,5};
	private String[] valeursSpeciales = {"fizz", "buzz"};


	public String fizzBuzz(int entree) {
		for (int i = 0; i < nombresSpeciaux.length; i++) {
			if(entree % nombresSpeciaux[i] == 0) {
				return valeursSpeciales[i];
			}
		}
		return Integer.toString(entree);
	}

}
