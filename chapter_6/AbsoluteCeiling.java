// a program to check the functions of the method
//ceiling and absolute

public class AbsoluteCeiling {
	public static void main(String[] args) {
		double absoluteValuePositive = Math.abs(7.5);
		double absoluteValueNegative = Math.abs(-7.5);
		double mathFloorPositive = Math.floor(7.5);
		double mathFloorNegative = Math.floor(-7.5);
		double mathCeilingPositive = Math.ceil(7.7);
		double mathCeilingNegative = Math.ceil(-7.7);
		double x = Math.ceil(-Math.abs(-8 + Math.floor(-5.5)));
		double z = 2;
		double y = Math.floor(z + 0.5);
		System.out.println("the absolute value of 7.5 is:   "        + absoluteValuePositive);
		System.out.println("the absolute value of -7.5 is:   "       + absoluteValueNegative);
		System.out.println("The floor value of 7.5 is: "           + mathFloorPositive);
		System.out.println("The floor value of -7.5 is: "          + mathFloorNegative);
		System.out.println("The ceiling value of 7.7 is: "         + mathCeilingPositive);
		System.out.println("The ceiling value of -7.7 is: "        + mathCeilingNegative);
		System.out.println("x is :    " + x);
		System.out.println("y is :    " + y);



	}
}