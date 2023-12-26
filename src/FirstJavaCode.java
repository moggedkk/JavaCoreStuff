
public class FirstJavaCode {

	public static void main(String[] args) {
		//Hello World
		System.out.println("Hello World");
		System.out.print("This does not produce a new line");
		System.out.println(3*3);
		/* Multi lines 
		Comment */
		//Variables
		String var1 = "this is a string";
		System.out.println(var1);
		final String var2 = "This string cant be changed";
		int y = 2, x = 1, z = 0;
		//Widening Casting: Converting a smaller data type to a larger type
		int myInt = 9;
		double myDouble = myInt;
		//Narrowing Casting: Converting a bigger data type into a smaller
		double mySecondDouble = 9.78d;
		int mySecondInt = (int)mySecondDouble;
		if( y > x) {
			System.out.println("y is bigger than x");
		}else
			System.out.println("x is bigger than y");
		//Loops:
		//While:
		int i = 0;
		while (i<5) {
			i++;
			System.out.println(i);
		}
		//For
		for(int o = 0; o<10; o++) {
			System.out.println(o);
		}
		
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		for(int j= 0; j<cars.length; j++) {
			System.out.println(cars[j]);
		}
		//Foreach
		for(String k : cars) {
			System.out.println(k);
		}
		//Multidemensional Array
		int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
		System.out.println(myNumbers[1][1]); // Outputs 7
		
	}

}
