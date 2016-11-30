package pack1;


//Bonuted type generics are used to help the compiler validate the type parameters.
// by the use of the extend keyword
public class BonundedType<T extends Number> {

// assuming we are creating a type representing an array of the Numbers
// and implement a method that prints the average of the numbers within the array.
	
T[]	numbers;

// create the constructor 

BonundedType(T[] numbArray){
	numbers = numbArray;
}
// the average calculator that assumed to return a double

double calculateAverage(){
	double sum = 0.0;
	
	for(int i = 0;i<numbers.length;i++){
		// the doubleValue() is defined in Number superclass then available for Double, Integer, Float...
		// If we hadn't extend T with numbers the compiler, the compiler wouldn't know the scope of T
		sum += numbers[i].doubleValue();
		// return the average
			}
	return sum /numbers.length;
}

public static void main(String...strings){
	
	// Instantiate array of Integer and Double 
	 Integer[] intNumbs = {1,2,2,4,5};
	 Double[] dbNumbs = {1.3,2.4,2.1,4.3};
	 
	 // the string array is for test
	 String[] strNumbs = {"1","2","2","4","5"};
	
	//instantiate the generic objects
	BonundedType<Integer> intArr  = new BonundedType<Integer>(intNumbs);
	BonundedType<Double> dbArr   = new BonundedType <Double> (dbNumbs);
	
	//BonundedType<String> strArr   = new BonundedType <String> (strNumbs); does not compile because 
	// String does not extend Number 
	
	
	// We can now print them
	System.out.println(intArr.calculateAverage());
	System.out.println();
	System.out.println(dbArr.calculateAverage());
	System.out.println();
	System.out.println("Conclusion: The BonudedType defines the scope of the parameters in the generic");
}
}
