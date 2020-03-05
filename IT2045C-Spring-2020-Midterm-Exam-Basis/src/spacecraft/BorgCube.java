package spacecraft;

public class BorgCube extends Spacecraft {
	/**
	 * constructor for the borg cube
	 * 
	 * @param name the name of the cube
	 */
	public BorgCube(String name) {
		super(name);
	}

	/**
	 * makes the borg cube launch
	 */
	public void Launch() {
		System.out.println("I am a Borg Cube and I am launching.");

	}

}
