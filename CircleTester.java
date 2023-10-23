//*******************************************************
// CircleTester.java
//
//
//  A client to test the functionality of objects
//  of the class Circle. Use the default constructor
//  in the Circle class to create Circle objects. 
// 
//*******************************************************
public class CircleTester{
	public static final double THRESHOLD = 0.000000001;
	
	public static void main(String[] args) {
		
		Circle circle1 = new Circle();
		Circle circle2 = new Circle(); 
		circle1.setName("Circle 1");
		circle1.setX(0.0);
		circle1.setY(0.0);
		circle1.setRadius(2);
		circle2.setName("Circle 2");
		circle2.setX(2.0);
		circle2.setY(1.0);
		circle2.setRadius(1);
		System.out.println("circle1="+circle1);
		System.out.println("circle2="+circle2);
		
		// If the method setRadius is implemented correctly,
		// a call to setRadius with a negative number
		// will not change the value of the circle's radius.
		//
		circle1.setRadius(-2.0); 
		
		//This is a unit test.  It is best to have tests output pass or fail instead of just a bunch of values.
		//Notice how the double comparison is done
		if(Math.abs(2-circle1.getRadius()) < THRESHOLD)
			System.out.println("PASSED: Set Radius");
		else
			System.out.println("FAILED: Set Radius");
		
		//
		// Reset the center of circle1 (-3.0,4.0)
		//
		circle1.setX(-3.0);
		circle1.setY(4.0);
		
		
		// print circle1 characteristics (center and radius), use a statement similar 
		// to the previous println statements. Note that is not necessary to call
		//the method toString, why?
		System.out.println("circle1="+circle1);
		// set the circle2 radius to 5.3
		circle2.setRadius(5.3);
		// print circle2 characteristics (center and radius), use a statement similar to the first and
		// second println statements
		System.out.println("circle2="+circle2);
		// print circle1 diameter, area and perimeter
		System.out.print("Diameter: " + circle1.diameter() + "\t" + "Area: " + circle1.area() + "\t " + "Perimeter: " + circle1.perimeter() + "\n");
		// print circle2 diameter, area and perimeter
		System.out.print("Diameter: " + circle2.diameter() + "\t" + "Area: " + circle2.area() + "\t" + "Perimeter: " + circle2.perimeter() + "\n");		// display whether circle1 is a unit circle
		System.out.println("Is Circle 1 Unit Circle: " + circle1.isUnitCircle());
		// display whether circle2 is a unit circle
		System.out.println("Is Circle 2 Unit Circle: " + circle2.isUnitCircle());
		// your additional tests should be placed below here.  Make sure to include at least 3 test cases
		// for each method you write.  It is best to write proper unit tests which print pass, fail for each
		// test instead of just dumping values to the screen.
		
		double result = 0;
		
		
		//test case 1 for area method: checking with radius of 3
		circle1.setRadius(3);
		result = circle1.area();
		if (Math.abs((Math.PI * Math.pow(3,2)) - result) < THRESHOLD) {
			System.out.println("PASSED: Calculate area");
		}
		
		else {
			System.out.println("FAILED: Calculate area");
		}
		
		//test case 2 for area method: checking with radius of 2
		circle1.setRadius(2);
		result = circle1.area();
		if (Math.abs((Math.PI * Math.pow(2,2)) - result) < THRESHOLD) {
			System.out.println("PASSED: Calculate area");
		}
		else {
			System.out.println("FAILED: Calculate area");
		}
		
		
		
		//test case 3 for area method: checking with invalid radius, so should use existing radius, should pass
		circle1.setRadius(-4);
		result = circle1.area();
		if (Math.abs((Math.PI * Math.pow(2,2)) - result) < THRESHOLD) {
			System.out.println("PASSED: Calculate area");
		}
		else {
			System.out.println("FAILED: Calculate area");
		}
		
		
		
		
		//test case 1 for perimeter method: checking with radius of 3, should pass
		circle1.setRadius(3);
		result = circle1.perimeter();
		if (Math.abs((2 * 3 * Math.PI) - result) < THRESHOLD) {
			System.out.println("PASSED: Calculate perimeter");
		}
		else {
			System.out.println("FAILED: Calculate perimeter");
		}
				
		//test case 2 for perimeter method: checking with radius 2, should pass
		circle1.setRadius(2);
		result = circle1.perimeter();
		if (Math.abs((2 * 2 * Math.PI) - result) < THRESHOLD) {
			System.out.println("PASSED: Calculate perimeter");
		}
		else {
			System.out.println("FAILED: Calculate perimeter");
		}
		
		//test case 3 for perimeter method: checking with invalid radius, so should use existing radius, should pass
		circle1.setRadius(-4);
		result = circle1.perimeter();
		if (Math.abs((2 * Math.PI * 2) - result) < THRESHOLD) {
			System.out.println("PASSED: Calculate perimeter");
		}
		else {
			System.out.println("FAILED: Calculate perimeter");
		}
		
		
		
		//test case 1 for diameter method: checking with radius of 3, should pass
		circle1.setRadius(3);
		result = circle1.diameter();
		if (Math.abs((3 * 2) - result) < THRESHOLD) {
			System.out.println("PASSED: Calculate diameter");
		}
		else {
			System.out.println("FAILED: Calculate diameter");
		}
				
		//test case 2 for diameter method: checking with radius 2, should pass
		circle1.setRadius(2);
		result = circle1.diameter();
		if (Math.abs((2 * 2) - result) < THRESHOLD) {
			System.out.println("PASSED: Calculate diameter");
		}
		else {
			System.out.println("FAILED: Calculate diameter");
		}
		
		//test case 3 for diameter method: checking with invalid radius, so should use existing radius, should pass
		circle1.setRadius(-4);
		result = circle1.diameter();
		if (Math.abs((2 * 2) - result) < THRESHOLD) {
			System.out.println("PASSED: Calculate diameter");
		}
		else {
			System.out.println("FAILED: Calculate diameter");
		}
		
		boolean result2 = false;
		//test case 1 for isUnitCircle method: checking with radius of 1 and center of (0,0), should pass
		circle1.setRadius(1);
		circle1.setX(0);
		circle1.setY(0);
		result2 = circle1.isUnitCircle();
		if ((Math.abs(1 - circle1.getRadius())) < THRESHOLD) {
			if ((Math.abs(0 - circle1.getX())) < THRESHOLD) {
				if ((Math.abs(0 - circle1.getY())) < THRESHOLD) {
					if(circle1.isUnitCircle() == true) {
						System.out.println("PASSED: Decide if unit circle");
					}
				}
			}
		}
		else {
			System.out.println("FAILED: Decide if unit circle");
		}
				
		//test case 2 for isUnitCircle method: checking with radius of 1 and center of (1,0), should pass
		circle1.setRadius(1);
		circle1.setX(1);
		circle1.setY(0);
		result2 = circle1.isUnitCircle();
		if ((Math.abs(1 - circle1.getRadius())) < THRESHOLD) {
			if ((Math.abs(0 - circle1.getX())) < THRESHOLD) {
				if ((Math.abs(0 - circle1.getY())) < THRESHOLD) {
					if(result2 == true) {
						System.out.println("FAILED: Decide if unit circle");
					}
					else {
						System.out.println("PASSED: Decide if unit circle");
					}
				}
				else {
					System.out.println("PASSED: Decide if unit circle");
				}
			}
			else {
				System.out.println("PASSED: Decide if unit circle");
			}
		}
		else {
			System.out.println("PASSED: Decide if unit circle");
		}
		
		//test case 3 for isUnitCircle method: checking with radius of 2 and center of (0,0), should pass
		circle1.setRadius(2);
		circle1.setX(0);
		circle1.setY(0);
		result2 = circle1.isUnitCircle();
		if ((Math.abs(1 - circle1.getRadius())) < THRESHOLD) {
			if ((Math.abs(0 - circle1.getX())) < THRESHOLD) {
				if ((Math.abs(0 - circle1.getY())) < THRESHOLD) {
					if(result2 == true) {
						System.out.println("FAILED: Decide if unit circle");
					}
					else {
						System.out.println("PASSED: Decide if unit circle");
					}
				}
				else {
					System.out.println("PASSED: Decide if unit circle");
				}
			}
			else {
				System.out.println("PASSED: Decide if unit circle");
			}
		}
		else {
			System.out.println("PASSED: Decide if unit circle");
		}
		
		
		//test case 1 for equals method: checking with radius of 1 and center of (0,0) for both circles, should pass
		circle1.setRadius(1);
		circle1.setX(0);
		circle1.setY(0);
		circle2.setRadius(1);
		circle2.setX(0);
		circle2.setY(0);
		result2 = circle1.isUnitCircle();
		if ((Math.abs(1 - circle1.getRadius())) < THRESHOLD) {
			if ((Math.abs(0 - circle1.getX())) < THRESHOLD) {
				if ((Math.abs(0 - circle1.getY())) < THRESHOLD) {
					if(circle1.isUnitCircle() == true) {
						System.out.println("PASSED: Decide if equal");
					}
				}
			}
		}
		else {
			System.out.println("FAILED: Decide if equal");
		}
		
		// test case 2 for equals method: checking if circles 1 and 2 are equal with same radius and different centers
		circle1.setRadius(1);
		circle1.setX(3);
		circle1.setY(4);
		circle2.setRadius(1);
		circle2.setX(6);
		circle2.setY(8);
		result2 = circle1.equals(circle2);
		if ((Math.abs(circle1.getRadius() - circle2.getRadius())) < THRESHOLD) {
			if ((Math.abs(circle1.getX() - circle2.getX())) < THRESHOLD) {
				if ((Math.abs(circle1.getX() - circle2.getY())) < THRESHOLD) {
					if(result2 == true) {
						System.out.println("FAILED: Decide if equal");
					}
					else {
						System.out.println("PASSED: Decide if equal");
					}
				}
				else {
					System.out.println("PASSED: Decide if equal");
				}
			}
			else {
				System.out.println("PASSED: Decide if equal");
			}
		}
		else {
			System.out.println("PASSED: Decide if equal");
		}
		
		// test case 3 for equals method: checking if circles 1 and 2 are equal with different radius and same centers
		circle1.setRadius(2);
		circle1.setX(3);
		circle1.setY(3);
		circle2.setRadius(1);
		circle2.setX(3);
		circle2.setY(3);
		result2 = circle1.equals(circle2);
		if ((Math.abs(circle1.getRadius() - circle2.getRadius())) < THRESHOLD) {
			if ((Math.abs(circle1.getX() - circle2.getX())) < THRESHOLD) {
				if ((Math.abs(circle1.getX() - circle2.getY())) < THRESHOLD) {
					if(result2 == true) {
						System.out.println("FAILED: Decide if equal");
					}
					else {
						System.out.println("PASSED: Decide if equal");
					}
				}
				else {
					System.out.println("PASSED: Decide if equal");
				}
			}
			else {
				System.out.println("PASSED: Decide if equal");
			}
		}
		else {
			System.out.println("PASSED: Decide if equal");
		
		}
	
		
		//test case 1 for distance method: checking with (2,2) and (0,0)
		circle1.setX(2);
		circle1.setY(2);
		circle2.setX(0);
		circle2.setY(0);
		result = circle1.distance(circle2);
		if (Math.sqrt(Math.pow(circle1.getX() - circle2.getX(), 2) + Math.pow(circle1.getY() - circle2.getY(), 2)) - result < THRESHOLD) {
			System.out.println("PASSED: Calculate distance");
		}
		else {
			System.out.println("FAILED: Calculate distance");
		}
		
		//test case 2 for distance method: checking with (6,8) and (7,2)
		circle1.setX(6);
		circle1.setY(8);
		circle2.setX(7);
		circle2.setY(2);
		result = circle1.distance(circle2);
		if (Math.sqrt(Math.pow(circle1.getX() - circle2.getX(), 2) + Math.pow(circle1.getY() - circle2.getY(), 2)) - result < THRESHOLD) {
			System.out.println("PASSED: Calculate distance");
		}
		else {
			System.out.println("FAILED: Calculate distance");
		}
		
		//test case 3 for distance method: checking with (-12,5) and (4,-9)
		circle1.setX(-12);
		circle1.setY(5);
		circle2.setX(4);
		circle2.setY(-9);
		result = circle1.distance(circle2);
		if (Math.sqrt(Math.pow(circle1.getX() - circle2.getX(), 2) + Math.pow(circle1.getY() - circle2.getY(), 2)) - result < THRESHOLD) {
			System.out.println("PASSED: Calculate distance");
		}
		else {
			System.out.println("FAILED: Calculate distance");
		}
		
		
		
		//test case 1 for isSmaller method: if radius of circle 1 is smaller than circle 2 radius
		circle1.setRadius(3);
		circle2.setRadius(3);
		result2 = circle1.isSmaller(circle2);
		if (circle1.getRadius() * 2 < circle2.getRadius() * 2) {
			System.out.println("FAILED: Decide if smaller");
		}
		else {
			System.out.println("PASSED: Decide if smaller");

		}
				
		//test case 2 for isSmaller method: if radii are the same
		circle1.setRadius(2);
		circle2.setRadius(3);
		result2 = circle1.isSmaller(circle2);
		if (circle1.getRadius() * 2 < circle2.getRadius() * 2) {
			System.out.println("PASSED: Decide if smaller");
		}
		else {
			System.out.println("FAILED: Decide if smaller");

		}
		
		//test case 2 for isSmaller method: if radius of circle 1 is bigger than radius of circle 2
		circle1.setRadius(3);
		circle2.setRadius(1);
		result2 = circle1.isSmaller(circle2);
		if (circle1.getRadius() * 2 < circle2.getRadius() * 2) {
			System.out.println("FAILED: Decide if smaller");
		}
		else {
			System.out.println("PASSED: Decide if smaller");

		}
		
		
		int result3 = 0;
		//test case 1 for compareTo method: if calling object is larger
		circle1.setRadius(8);
		circle2.setRadius(4);
		result3 = circle1.compareTo(circle2);
		if (result3 == 1) {
			System.out.println("PASSED: Compare the circles");
		}
		else {
			System.out.println("FAILED: Compare the circles");
		}
		
			
		
		
		//test case 2 for compareTo method: if parameter object is larger
		circle1.setRadius(3);
		circle2.setRadius(5);
		result3 = circle1.compareTo(circle2);
		if (result3 == -1) {
			System.out.println("PASSED: Compare the circles");
		}
		else {
			System.out.println("FAILED: Compare the circles");
		}
		
		//test case 3 for compareTo method: if calling object and parameter object are equal
		circle1.setRadius(1);
		circle2.setRadius(1);
		result3 = circle1.compareTo(circle2);
		if (result3 == -1) {
			System.out.println("FAILED: Compare the circles");
		}
		else if (result3 == 1){
			System.out.println("FAILED: Compare the circles");
		}
		else if (result3 == 0) {
			System.out.println("PASSED: Compare the circles");
		}
		
		
		
		
		// test case 1 for intersects method: intersects
		circle1.setX(1);
		circle1.setY(1);
		circle1.setRadius(5);
		circle1.setX(1);
		circle1.setY(1);
		circle1.setRadius(10);
		result2 = circle1.intersects(circle2);
		if (result2 == true) {
			System.out.println("PASSED: Decide if intersects");
		}
		else {
			System.out.println("FAILED: Decide if intersects");
		}
		
		
		//test case 2 for intersects method: does not intersect
		circle1.setX(9);
		circle1.setY(2);
		circle1.setRadius(2);
		circle1.setX(1);
		circle1.setY(10);
		circle1.setRadius(4);
		result2 = circle1.intersects(circle2);
		if (result2 == false) {
			System.out.println("PASSED: Decide if intersects");
		}
		else {
			System.out.println("FAILED: Decide if intersects");
		}
		
		//test case 3 for intersects method: tangential, but does not intersect
		circle1.setX(1);
		circle1.setY(1);
		circle1.setRadius(0);
		circle1.setX(1);
		circle1.setY(1);
		circle1.setRadius(0);
		result2 = circle1.intersects(circle2);
		if (result2 == false) {
			System.out.println("PASSED: Decide if intersects");
		}
		else {
			System.out.println("FAILED: Decide if intersects");
		}
		
	}
}


	

