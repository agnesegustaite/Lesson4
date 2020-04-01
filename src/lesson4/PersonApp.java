package lesson4;
/**
 PersonApp.java demonstrates
 -- how to reuse the instantiable class Person
 -- how to create several objects/instances of class Person and
 -- how to use the constructors to initialize an object's attributes/ properties/state
 -- how to call/invoke an object's method (i.e. displayMe()) to perform its tasks
 */
// declare the class named PersonApp
public class PersonApp {
	
	//declare the main method
    public static void main(String args[]){
    	
        //declare a variable of type Person
    	Person p1;
        // create an object/instance of type Person using the constructor without any parameters
          
    	
    	/* if we use the no-arguments constructor, during the program execution Java will
          create and save in memory an object with all its instance variables initialized to their default values, for the Person object they are:
               -- name is initialized with null
               -- enjoysReading is initialized with false
               -- age is initialized with 0
          */
    	p1 = new Person();
        //call/invoke a method on the object created above -- 
    	//the method will display the object's instance variables
    	p1.displayMe();
    	
        //declare and create an object of type Person
        // create an object of type Person using the constructor with 3 parameters
          /*
               in this case, during the program execution Java will create and save in memory an object with its instance
               variables initialized as follows:
                    -- name is initialized with "emma"
                    -- enjoysReading is initialized with true
                    -- age is initialized with 20
          */
    	Person p2 = new Person(aName: "emma", reads: true, myAge: 20);
        //call/invoke the method displayMe() on the object created above to display its details
    	p2.displayMe();
    	
    	
        //declare and create an object of type Person
        // create an object of type Person using the constructor with 3 parameters
          /*
               in this case, during the program execution Java will create and save in memory an object with its instance
               variables initialized as follows:
                    -- enjoysReading is initialized with false
                    -- name is initialized with "paul"
                    -- age is initialized with 20
          */
    	Person p3 = new Person (reads: false, n: "paul", myAge: 20);
        //call/invoke the method displayMe() on the object created above to display its details
    	p3.displayMe();
    	
        //create an object of type Person using the constructor with 1 parameter
          /* in this case, during the program execution Java will create and save in memory an object with its instance
          variables initialized as follows:
               -- name is initialized with "john"
               -- age is initialized with 0
               -- enjoysReading is initialized with false*/
    	Person p4 = new Person (name: "john");
        //call/invoke the method displayMe() on the object created above to display its details
    	p4.displayMe();
    	
        // we cannot access the instance variables of an object if the instance variables have been declared private
        //p4.age = 40; // this would lead to a compilation error as age has been declared private; 
    	//only if the age is declared public this statement is correct
    	
        p4.setAge(40);//use the setter method to change the age to 40
        //call/invoke the method displayMe() on the object created above to display its details
        // note that john's age is not 0 any more, now it is 40
        p4.displayMe();
        
        boolean reads = p4.getEnjoysReading();//use the getter method to retrieve whether the p4 Person 
        //object enjoys reading
       System.out.println(reads); //TODO display whether john's enjoys reading
    }
}