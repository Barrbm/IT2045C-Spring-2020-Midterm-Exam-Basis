/*
 * IT2045C Spring 2020 Midterm Exam Basis
 * Bill Nicholson
 * nicholdw@ucmail.uc.edu
 */
package spacecraft;
/**
 * Model a Klingon Warbird-class spacecraft in the Star Trek canon
 * @author nicomp
 *
 */
public class KlingonWarbird extends Spacecraft {
	/**
	 * constructor for the Klingon Warbird
	 * @param name the name of the Warbird
	 */
	public KlingonWarbird(String name) {
		super(name);
	}
	
	/**
	 * makes the Warbird launch
	 */
	public void Launch() {
		System.out.println("I am a Klingon Warrbird and I am launching.");
	}


}
