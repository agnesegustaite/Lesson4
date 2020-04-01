package lesson4;
/**
Person.java demonstrates
 -- how to declare an instantiable class
 -- how to declare multiple constructors
 --- constructor: during a program's execution, a constructor is used to initialize the object's instance variables when that object is created
 -- how to implement a class's attributes by declaring instance variables
 -- how to implement a class's behaviour by implementing a method (i.e. displayMe())
 */

// declare the instantiable class Person
public class Person {
	
	//declare instance variables
    private String name; //to store the name
    private int age; //to store the age
    private boolean enjoysReading; //to store whether that Person enjoys reading or not
    
    // constructors: during a program's execution,
    // a constructor is used to initialize the object's instance variables when that object is created
    
    
    // declare multiple constructors -- in OOP, when we declare multiple constructors 
    //in the same class we *overload constructors*
    // the signature of the overloaded constructors must be different
    // i.e. we cannot have 2 constructors with the same signature and parameters
    
    
    //declare a constructor with 3 parameters(String aName, boolean reads, int myAge)
    public Person(String aName, boolean reads, int myAge){
        // initialize the instance variables with the values provided by the user of this class
        // (the user of this class is another class -- i.e. the class where we create the objects of type Person)
        // initialize the instance variable name with the value of the parameter aName
    	name = aName;
        // initialize the instance variable enjoysReading with the value of the parameter reads
    	enjoysReading = reads;
        // initialize the instance variable age with the value of the parameter myAge
    	age = myAge;
    }
    
    //declare a constructor with 3 parameters(boolean reads, String n, int myAge)
	/*
	note that this constructor does the same initializations as the above constructor (i.e. initializes the name, age and enjoysReading instance variables )
	therefore, either this or the above constructor is needed in this class but not both as they perform the same operations
	this constructor has a different signature namely, Person(boolean reads, String n, int myage) whereas the above is Person(String aName, boolean reads, int myAge) -- note the different order of the parameters data types
	when we declare multiple constructors in a class the constructors must have different signatures otherwise the compiler will generate a compilation error (i.e. constructor is already defined error)
	in general, when we overload constructors the signature must differ i.e. the parameters list must have
	different number of parameters, or if the parameter lists are of the same size, then across two constructors the parameters must have different data types and different order of the parameters data types
	*/
    public Person(boolean reads, String n, int myAge) {
    	enjoysReading = reads;// initialize the instance variable enjoysReading with the value of the parameter reads
        name = n; // initialize the instance variable name with the value of the parameter n
        age = myAge;// initialize the instance variable age with the value of the parameter myAge
    }
    
        /*declare the constructor without parameters
     this constructor is known as the default constructor or the no-arguments constructor
     if we do not declare ANY constructor in our class, the java compiler generates and inserts in the .class file the default constructor  (i.e. the constructor without parameters)
     */
    public Person() {
 // the default constructor initializes all the instance variables  with their default values
    // in our example, the default values are null for name, 0 for age and false for enjoysReading
	}

        
    //declare a constructor with 1 parameter(String name)
    public Person(String name) {
        this.name = name; // initialize the instance variable name (i.e. this.name) with the value of the parameter name
    }
    
        //declare a display method -- 
    // added just to display the content of the instance variables immediately after
    //an object creation using one of the available constructors
    public void displayMe() {
    	System.out.println("instance variable: " + name);
    	System.out.println("instance variable: " + age);
    	System.out.println("instance variable: " + enjoysReading);
    	System.out.println("==============================");
    }
    
    	//declare a setter method to be able to modify the age, age to this.age
    public void setAge(int age) {
    	this.age = age;
    }
    
    //declare a getter method to be able to retrieve whether a certain person enjoys reading or not and return it
    public boolean getEnjoysReading() {
    	return enjoysReading;
    }
    
    //declare a constructor with 2 parameters(String name, int age)
    public Person(String name, int age) {
        this.name = name;// initialize the instance variable name (i.e. this.name) with the value of the parameter name
        this.age = age;// initialize the instance variable age (i.e. this.age) with the value of the parameter age

    }
    
}
    