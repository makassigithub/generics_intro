package pack1;

public class GenericsIntro <T> {

	// A generic ia a parameterized type were the compiler replace the parameter with the argument 
	//during code compilation.
	
	
	//Declare an object of type T undefined
	T ob;
	
	//create a parameterized constructor that takes a parameter  'o' and create an object  ob of type T
		
	GenericsIntro(T o){		
		ob = o;
	}
	
	// Let's create a getter for the Type object
	
	T getT(){
		return ob;
	}
	
	//Let's create a method that return the Type of T for confirmation
	void getTypeOfT(){
		System.out.print(ob.getClass().getName());
	}
	
	public static void main(String[] args) {
	//Let's create an Integer object.
    //Declare the Integer with a Generic Syntax		
	
		GenericsIntro<Integer> iobj ;
		
		// here we are using auto-boxing to implicitly wrapp the int into the Integer object.
		iobj = new GenericsIntro <Integer>(100);
		
		// The following line will not compile because iobj is not decalred as a Float
		 System.out.println("Generics ensure type safety");
		//iobj = new GenericsIntro <Float>(100);
		
		//Now let's call the value of iobj back.
		//We will be using the auto-unboxing to intValue from the wrapper class
		
        System.out.println("The value of iobj is "+iobj.getT());
        
        //Let's verify the type of of iobj
        System.out.print("The type of iobj is: "); 
        iobj.getTypeOfT();
        
        // The generics make a portable, then take off a bunch of Hard-coding.
        //For exemple i can still use my GenericsIntro to process another type of object
        System.out.println();
        System.out.println("\nLet's process a String class with GenericsIntro");
        
        GenericsIntro<String> strObj ;
        strObj= new GenericsIntro <String>("I am happy");
        System.out.println("The value of strObj is "+strObj.getT());
        System.out.print("The type of strObj is: ");   
        iobj.getTypeOfT();
        System.out.println("\n");
        System.out.println("Summary: With generic, the same code is reusable for various type of object");
        System.out.println("Including java built-in object and our custom made objects");
        System.out.println("this could be Achieved with the Object class (the SuperClass of all object, but");
        System.out.println("doing so would not ensure type safety, e.g. the line 39 would compile and then create a bug"); 
	}

}
