/*
 * IT2045C Spring 2020 Midterm Exam Basis
 * Bill Nicholson
 * nicholdw@ucmail.uc.edu
 */
package spacecraft;

/**
 * Model a spacecraft in the Star Trek canon
 * 
 * @author nicomp
 *
 */
public abstract class Spacecraft implements Launch {
	private String name;

	/**
	 * constructor for the spacecraft
	 * 
	 * @param name the name of the spacecraft
	 */
	public Spacecraft(String name) {
		setName(name);
	}

	/**
	 * gets the name of the spacecraft
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * sets the name of the spacecraft
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * returns all of the properties of the spacecraft
	 */
	public String toString() {
		return name;
	}
}
