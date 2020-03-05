/*
 * IT2045C Spring 2020 Midterm Exam Basis
 * Bill Nicholson
 * nicholdw@ucmail.uc.edu
 */

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
package main;

import spacecraft.BorgCube;
import spacecraft.IntergalacticCamaro;
import spacecraft.KlingonWarbird;
import spacecraft.StarshipEnterprise; // import the class to the main

public class Main {

	public static void main(String[] args) {
		StarshipEnterprise NCC1701 = new StarshipEnterprise("NCC 1701");
		KlingonWarbird destroyer = new KlingonWarbird("porgh");
		BorgCube borgCube = new BorgCube("101100100111000111100011");
		IntergalacticCamaro roboCar = new IntergalacticCamaro("RoboCar 35216", "Deep Blue"); // declare and consruct the intergalacticCamaro object
		
		System.out.println(NCC1701.toString());
		System.out.println(destroyer.toString());
		System.out.println(borgCube.toString());
		System.out.println(roboCar.toString()); // use the toString to print the properties
		

		
		
	}

}
