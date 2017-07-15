package pack1;

//A generic class can have multiple parameter type
public class MultipleTypeGen <T1,T2> {

// Let's declare object of each type
T1 obj1;
T2 obj2;

// A constructor for this generic class
MultipleTypeGen(T1 o1, T2 o2){
	obj1 = o1;
	obj2 = o2;
}

// create a getter for each type
T1 getTypeOneObj(){return obj1;}
T2 getTypeTwoObj(){return obj2;}

// define a type printer method
void showTypes(){ System.out.println(obj1.getClass().getName());
                  System.out.println(obj2.getClass().getName());}

public static void main(String...args){
	
	//Create an instance of the generic class
	MultipleTypeGen <Integer,String> myGenObj = new MultipleTypeGen<Integer, String>(100,"I ma happy");
	// This also works: MultipleTypeGen <Integer,String> myGenObj = new MultipleTypeGen(100,"I ma happy");
	
	// get the values in the object
	// See that the return value is base on the method invoked on the generic instance
	System.out.println(myGenObj.getTypeOneObj());
	System.out.println(myGenObj.getTypeTwoObj());
	
	System.out.println();
   // now, let's print the types
	myGenObj.showTypes();
}

}
