package pack1;

// Bounded type are not even enough to solve some type safety issues issues
// In those cases we can use wildcard argument '?'. 
//Assuming we are creating a method to compare MultipleTypeGen class
public class WildCardGen<T extends Number> {

// declare an array with elements of T type	
T [] nums ;

// Constructor that create an object of WildCardGen containing an array of type T

WildCardGen (T[] arr){ 
	nums = arr;}
	
// Create a method that return the average of T's in the array

double calculateAverage(){
	double sum = 0.0;
	
	for(int i = 0;i<nums.length;i++){
		sum += nums[i].doubleValue();
	}
	return sum/nums.length;
} 

// implement sameAverage1 that checks if two WildCardGen instances have the same average.

boolean sameAverage1(WildCardGen<T> wcg1){
	if(calculateAverage()==wcg1.calculateAverage()){
		return true;}
	 return false;
	
}

boolean sameAverage2(WildCardGen <?> wcg2){
	// We are using this to remind that calculate ins invoked on the instance of the caller.
	//It's optional
	if(calculateAverage()==wcg2.calculateAverage()){
		return true;}
	 return false;
	
}

public static void main (String[]args){
	
	// Here we have three different array of made of sublclasses of Number
	// Visually, these arrays have the average
	Integer [] intArray1 = {1,2,3,4};
	Integer [] intArray2 = {4,3,2,1};
	Double [] dbArray = {1.0,2.0,4.0,3.0};
	
	
	// We create WildCardGen instance with arrays
	WildCardGen<Integer> intObj1 = new WildCardGen <Integer> (intArray1);
	WildCardGen<Integer> intObj2 = new WildCardGen <Integer> (intArray2);
	WildCardGen<Double> dbObj = new WildCardGen <Double> (dbArray);
	
	
	//Compare the average there objects
	
	System.out.println("The 2 integer arrays have the same average: "+ intObj1.sameAverage1(intObj2));
	
	
	// the following line will not compile sameAverage1 only applied to Integer Typed arrays
	//System.out.println("The 2 integer arrays have the same average: "+intObj1.sameAverage1(dbArray));
	
	// To solve this problem we must use the sameAverage2 because the wildcard accepts every Type that extends Number

	System.out.println("The  integer arrays1 and the double array have the same average: "+intObj1.sameAverage2(dbObj));
	System.out.println();
	System.out.println("Here We have 2 leveltype safety check: The top One with the Bounded type using the 'extends keyword'\n "
			+ "And the second one with the wildcard that ensure the sameAverage2 is applied to every Object that exents 'Number' ");
	
	
}

}
