/* 
 * 1. Watch this smurf cartoon: https://www.youtube.com/watch?v=RqbpzEHuO2g
 * 2. In a Runner class, make a Handy Smurf. Use the methods below to make him eat, and print his name.
 * 
 * 5. Make a Papa Smurf and print his name, hat color and girl or boy.
 * 6. Make a Smurfette and print her name, hat color and girl or boy. */

public class Smurf {

	private String name;

	Smurf(String name) {
		this.name = name;
	}

	public String getName() {
		return ("My name is " + name + ".");
	}

	public void eat() {
		System.out.println(name + " Smurf is eating garbage");
	}

	/* Papa Smurf wears a red hat, all the others are white. */
	public String getHatColor() {
		// 3. Fill in this method
		
	if(name.equals("papa")){
		return "he wears a red hat";
	}
	else {
		return "this smurf wears a white hat";	}
	}

	/* Smurfette is the only female Smurf. */
	public String isGirlOrBoy() {
		// 4. Fill in this method
		if(name.equals("Smurffete")) {
			return "im a girl";
		}
		else {
			return"im a boy";
		}
		
	}

}


