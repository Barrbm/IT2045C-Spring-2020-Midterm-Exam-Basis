/*  

* Name: Blake Barr  

* Email: barrbm@mail.uc.edu  

* Course: IT2045C  

* Assignment #: Midterm

* Due Date:  3/05

* Description: On this exam, I create a new class that inherits from a superclass, then create an object from that class and print its properites

* Citations: My other in class work

* Comments: none

*/
package spacecraft;

/**
 * this class models an intergalactic camaro.
 * 
 * @author barrbm
 *
 */
public class IntergalacticCamaro extends Spacecraft {
	private String color;

	/**
	 * constructor for the intergalactic camaro
	 * 
	 * @param name  the name of the camaro
	 * @param color the camaro's color
	 */
	public IntergalacticCamaro(String name, String color) {
		super(name);
		this.color = color;

	}

	/**
	 * this makes the camaro launch
	 */
	public void Launch() {

	}

	/**
	 * gets the color of the camaro
	 * 
	 * @return
	 */
	public String getColor() {
		return color;
	}

	/**
	 * sets the color of the camaro
	 * 
	 * @param color
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * returns all of the properties of the camaro
	 */
	public String toString() {
		return ("Name = " + getName() + ", Color = " + color);

	}

}
