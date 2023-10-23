/*
 * Circle.java
 * Author:  Rishi Kumar 
 * Submission Date:  23 October 2023
 *
 * Purpose: A class that outlines methods that apply to Circles
 * ranging from simple calculations to basic information about the circle
 *
 * Statement of Academic Honesty:
 *
 * The following code represents my own work. I have neither 
 * received nor given inappropriate assistance. I have not copied 
 * or modified code from any source other than the course webpage 
 * or the course textbook. I recognize that any unauthorized 
 * assistance or plagiarism will be handled in accordance with 
 * the University of Georgia's Academic Honesty Policy and the 
 * policies of this course. I recognize that my work is based 
 * on an assignment created by the School of Computing 
 * at the University of Georgia. Any publishing or
 * posting of source code for this assignment is strictly 
 * prohibited unless you have written consent from the 
 * School of Computing at the University of Georgia.  
 */
//*******************************************************
// Circle.java
//
// 
//*******************************************************
public class Circle {
	
	private String name;       // declare the private String instance  name
	private double radius;       // declare the private double instance  radius
	private double x;       // declare the private double instance  x
	private double y;       // declare the private double instance  y

	//Used to compare doubles.  Remember, don't compare doubles directly using ==
	public static final double THRESHOLD = 0.000000001;

	//----------------------------------------------
	// getName - returns the value of name
	//----------------------------------------------
	public String getName() {
		
		return name;	
	}
	
	//----------------------------------------------
	// getX - returns the value of x
	//----------------------------------------------
	public double getX() {
		
		return x;	
	}
	

	//----------------------------------------------
	// getY - returns the value of y
	//----------------------------------------------
	public double getY() {
		
		return y;	
	}
	
	//----------------------------------------------
	// getRadius - returns the value of radius
	//----------------------------------------------
	public double getRadius() {
		
		return radius;
	}
	
	//----------------------------------------------
	// setName - assigns a new value to name
	//----------------------------------------------
	public void setName(String name) {
		
		this.name = name;	
	}

	//----------------------------------------------
	// setX - assigns a new value to x
	//----------------------------------------------
	public void setX(double x) {
		
		this.x = x;
	}
	
	//----------------------------------------------
	// setY - assigns a new value to y
	//----------------------------------------------
	public void setY(double y) {
		
		this.y = y;
	}
	
	
	//----------------------------------------------
	// setRadius - assigns a new value to radius
	//----------------------------------------------
	public void setRadius(double radius) {
		
		if (!(radius < 0)) {
			this.radius = radius;
		}
			
	}
	
	//--------------------------------------------------------
	// area - returns the area of the circle
	//--------------------------------------------------------
	public double area() {
		
		return Math.PI * radius * radius;	
	}
	
	//--------------------------------------------------------
	// perimeter - returns the perimeter of the circle
	//--------------------------------------------------------
	public double perimeter() {
		
		return 2 * Math.PI * radius;	
	}
	
	//--------------------------------------------------------
	// diameter - calculates the diameter of the circle
	//--------------------------------------------------------
	public double diameter() {
		
		return radius * 2;	
	}

	
	//--------------------------------------------------------
	// isUnitCircle - return true if the radius of this circle
	//                is 1 and its center is (0,0) and false
	//      	      otherwise.
	//--------------------------------------------------------
	public boolean isUnitCircle() {
		
		return ((radius - 1.0 <= THRESHOLD) && (x - 0.0 <= THRESHOLD) && (y <= THRESHOLD));	
	}
	
	
	//--------------------------------------------------------
	// toString - return a String representation of
	//            this circle in the following format:
	//			  name: name
	//            center:(x,y)
	//            radius: r
	//--------------------------------------------------------
	public String toString() {
		
		return "name: " + this.name + "\n" + "center: (" + this.x + ", " + this.y + ")" + "\n"	+ "radius: " + this.radius;
	}

	//--------------------------------------------------------
		// equals - returns true if the radius and center are 
		// within the threshold, false otherwise.
		//--------------------------------------------------------
	public boolean equals(Circle anotherCircle) {
		return (this.radius - anotherCircle.radius <= THRESHOLD) && (this.x - anotherCircle.x <= THRESHOLD) && (this.y - anotherCircle.y <= THRESHOLD);
	}
	
	//--------------------------------------------------------
		// distance - returns distance between two circle's centers
		//--------------------------------------------------------
	public double distance(Circle anotherCircle) {
		return Math.sqrt(Math.pow(this.x - anotherCircle.x, 2) + Math.pow(this.y - anotherCircle.y, 2));
	}
	
	//--------------------------------------------------------
		// isSmaller - returns true if calling circle is smaller 
		// than the parameter circle, false otherwise
		//--------------------------------------------------------
	public boolean isSmaller(Circle anotherCircle) {
		return this.diameter() < anotherCircle.diameter();
	}
	
	//--------------------------------------------------------
		// compareTo- returns 1 if calling circle is larger, -1 if
		// smaller, and 0 if equal
		//--------------------------------------------------------
	public int compareTo(Circle anotherCircle) {
		int result = 0;
		if (Math.abs(this.diameter() - anotherCircle.diameter()) < THRESHOLD){
			result = 0;
		}
		else if (this.isSmaller(anotherCircle)) {
			result = -1;
		}
		else if (this.isSmaller(anotherCircle) == false) {
			result = 1;
		}
		return result;
		}
	//--------------------------------------------------------
		// intersects - returns true if the distance is less than
		// the sum of the radii of both circles
		//--------------------------------------------------------
	public boolean intersects(Circle anotherCircle) {
		return (this.distance(anotherCircle) < this.radius + anotherCircle.getRadius());
	}

}

