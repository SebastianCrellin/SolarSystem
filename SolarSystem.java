import java.util.ArrayList;

//If your mark for coursework 1 was less than 100% then you should write, in a block comment at the top of your code, how you have responded to feedback. That is, what issues in your first coursework - recorded in the marking rubric - you have improved.
//COMMENT
//Sorry, not level 2 because you don't check the pile index is in range - so try entering 99 as a pile number. 
//Also one-letter names: using i, j, k (probably not m...) for loop counters is one thing, but you use i as the 'player counter'. 
//Also why are only some strings constants? Some comments not so useful ('Strings') and avoid all caps.
//RESPONSE
//I have changed the usage of i to ListPointer to make the purpose clearer. And values which are capable of being Final Values have been made Final.
//All capitals have also been avoided and comments have been made more concise.
public class SolarSystem {

	private int arraySize;
	private ArrayList<Planet> SolarSystemList = new ArrayList<>();
	private String SolarString;
	private double luminosity;
	private String name;
	
	//A constructor is used to initialise objects.
	public SolarSystem(String name, double luminosity) {
		this.name = name;
		this.luminosity = luminosity;
	}

	// creates planet
	public void addPlanet(String name, double mass, double radius, double distance) {
		//add to arraylist
		SolarSystemList.add(new Planet(name, mass, radius, distance, luminosity));
	}

	// adds planet to list
	public void planetToList(Planet name) {
		SolarSystemList.add(name);
	}
	//calculates the number of planets in the arraylist
	public int numberOfPlanets() {
		arraySize = SolarSystemList.size();
		return arraySize;
	}
	
	
	//getter for luminosity
	public double getLuminosity() {
		return luminosity;
	}
	//Override is needed to override the toString preexisting method
	@Override
	public String toString() {
		String SysMess = name + " has luminosity: " + luminosity + "\n";
		
		for (int ListPointer=0; ListPointer < SolarSystemList.size(); ListPointer++) {
			SysMess = SysMess + SolarSystemList.get(ListPointer).toString();
		}
		return SysMess;
	}
	
	

	// mass, distance radius, gravity and, orbital period needs to be rounded as the
	// last step
	// in the calculation process - you may either store them in rounded form, or
	// round them before you output them.

	// If you run the test script for your operating system once you’ve created the
	// zip file you intend to submit you will be able
	// to check both that your code works and you’ve created the zip file correctly
	// - a HUGE number of people don't bother doing this,
	// and so don't find they have messed up the zip file, and hence lose ALL the
	// marks for their code working. Don't let it be you.
	// The following videos show how to create the zip files - both of these videos
	// are for a slightly older coursework, so the names
	// and the output don't match exactly: BUT the key point - select the FILES you
	// want to compress NOT the folder they are in - is still the same.
}