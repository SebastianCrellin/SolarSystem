public class Planet {

	boolean isHabitable = false;
	private double luminosityFactor;
	private double mass;
	private double radius;
	private double luminosity;
	private double distance;
	private double orbitalPeriod;
	private double surfaceGravity;
	private String name;
	private final double MULTIPLIER = 0.75;
	private final double MULTIPLIER2 = 2.0;
	private final double LOWESTMASS = 0.6;
	private final double HIGHESTMASS = 7.0;
	private final double DPMULTI = 1000;
	private final double DPDIV = 1000.0;

	// A constructor is used to initialise objects.
	public Planet(String name, double mass, double radius, double distance,double luminosity) {
		this.name = name;
		this.mass = mass;
		this.radius = radius;
		this.distance = distance;
		this.luminosity = luminosity;

	}

	// Distance Getter
	public double getDistance() {
		return distance;

	}
	//Setter for OrbitalPeriod
	private void orbitalPeriod() {
		orbitalPeriod = Math.sqrt(distance * distance * distance);
	}
	//Getter for OrbitalPeriod
	public double getOrbitalPeriod() {
		orbitalPeriod();
		return orbitalPeriod;

	}
	//Setter for surfaceGravity
	private void surfaceGravity() {
		surfaceGravity = mass / (radius * radius);
	}
	//Getter for surface gravity
	public double getSurfaceGravity() {
		surfaceGravity();
		return surfaceGravity;
	}
	//A setter for habitability
	private void setHabitability() {
		luminosityFactor = Math.sqrt(luminosity);
		//Conditions for if the planet is to be habitable
		if ((MULTIPLIER * luminosityFactor) <= distance && distance <= (MULTIPLIER2 * luminosityFactor)
				&& (LOWESTMASS <= mass && mass <= HIGHESTMASS)) {
			isHabitable = true;
		} else {
			isHabitable = false;
		}
	}

	// A getter for habitability
	public boolean getHabitability() {
		setHabitability();
		return isHabitable;
	}

	// Override is needed to override the toString preexisting method
	@Override
	public String toString() {
		String habitabilityString;
		if (getHabitability() == true) {
			habitabilityString = "yes";
		} else {
			habitabilityString = "no";
		}
		//Return string to output the values
		return name + " has a mass of " + Math.round(mass * DPMULTI) / DPDIV + " Earths with a surface gravity of "
				+ Math.round(getSurfaceGravity() * DPMULTI) / DPDIV + "g, is "
				+ Math.round(getDistance() * DPMULTI) / DPDIV + "AU from its star, and orbits in "
				+ Math.round(getOrbitalPeriod() * DPMULTI) / DPDIV + " years: could be habitable? " + habitabilityString
				+ "\n";

	}

}