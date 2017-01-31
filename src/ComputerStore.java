
import java.util.ArrayList;
import java.util.Iterator;


/**
 * ComputerStore class aims to store a collection of Computer objects in an array list to perform
 * some basic operation on a group of those objects.
 * @author  Aiham Alkaseer
 * @version 1.0
 * @since   2017-01-27 
 */


public class ComputerStore {


	private ArrayList<Computer> computers;
	private ArrayList<Component>  components;


	public ComputerStore () {

		computers = new ArrayList<Computer>();
		components = new ArrayList<Component>();

	}




	/**
	 * A method to add a new computer into the array list 
	 * @param newComputer a Computer object
	 * @return true boolean value that indicates a successful adding.
	 */
	public boolean addComputer(Computer newComputer) { 

		if (computers.add(newComputer))
			return true;
		else return false;
	}




	/**
	 * A method to remove an element from the store.
	 * It removes the Computer class object with the given index at the array list.
	 * 
	 * @param index the index of desired object to be removed.
	 * @return a true boolean value on successful removal, a false value if the object is unavailable.
	 */

	public boolean removeComputer(int index) {
		if (index>0 && index<computers.size()){
			computers.remove(index);
			return true;
		}
		else return false;

	}




	/**
	 * This method prints out all the details of each computer in store.
	 * it calls the local print method in each element in the array list.
	 * 
	 */

	public void printAllComputers( ) {           
		int i=1;
		for (Computer temp : computers ) {

			System.out.println("Computer number : "+i);
			temp.printComputerSummary();
			i++;

		}
	}



	/**
	 * This method prints the total cost for all computers
	 * it calls getPrice method for each Computer element.
	 */

	public void printTotalValue( ) {
		System.out.println("This method prints the total cost for all computers");
		int i=1;
		for (Computer temp : computers ) {

			System.out.println("Computer number : "+i+" has the total cost of "+temp.getPrice());
			i++;
		}
	}



	/**
	 * Finding the most expensive element, iterating using a traditional for loop
	 * @return Computer object called highest that temporarily stores the object with the highest total cost.
	 */

	public Computer findMostExpensiveComputerV1( ) { 
		Computer highest= computers.get(0);
		for (int index=1; index<computers.size();index++){
			if (highest.getPrice()<computers.get(index).getPrice()) {
				highest= computers.get(index);

			}
		}
		return highest;
	}



	/**
	 * Finding the most expensive element, iterating using a traditional while loop
	 * @return Computer object called highest that temporarily stores the object with the highest total cost.
	 */



	public Computer findMostExpensiveComputerV2( ) {  
		Computer highest= computers.get(0);
		int index=1;                            
		while (index<computers.size()){
			if (highest.getPrice()<computers.get(index).getPrice()) {
				highest= computers.get(index);

			}
			index ++;
		}
		return highest;

	}



	/**
	 * Finding the most expensive element, iterating using a traditional for each loop
	 * @return Computer object called highest that temporarily stores the object with the highest total cost.
	 */


	public Computer findMostExpensiveComputerV3( ) {

		Computer highest= computers.get(0);

		for (Computer c : computers)
			if (highest.getPrice()<c.getPrice()) {
				highest=c;

			}


		return highest;
	}



	/**
	 * Finding the most expensive element, iterating using an iterator object.
	 * @return Computer object called highest that temporarily stores the object with the highest total cost.
	 */

	public Computer findMostExpensiveComputerV4( ) { 

		Computer highest= computers.get(0);
		Iterator<Computer> it= computers.iterator();
		Computer current=null;          // a temporary copy of has.next() to perform multiple actions on it inside the loop
		while(it.hasNext()) {
			current=it.next();
			if (highest.getPrice()<current.getPrice()) 
				highest=current;


		}

		return highest;

	}




	/**
	 * this method simply calls getCost methods for each of components array list
	 * to calculate the sum of costs.	 *
	 * @return int Cost of all components
	 */
	public int totalCostOfComponents( ){
		int total=0;
		for (Component temp : components){
			total+=temp.getCost();
		}
		return total;
	}


	/**
	 * this method goes through all elements in the components array list then it compares the
	 * required type string with class name of the current element, and it adds its cost if 
	 * it matches the condition.
	 * and to achieve that the method tries to call toString method of the object then removes
	 * the object id (which comes after the class name followed by "@" char, using that char 
	 * as a point to get the the class name in a string.
	 * @param component_type is String that should represent the name of one the parts classes
	 * @return int the sum of all parts of that type of components
	 */

	public int totalCostOfComponents(String component_type) {
		int total=0;
		int indexofat=0;
		String toClassName;

		for (Component temp : components){

			/*
			 * getting the index of @ char: calling toString method on an object usually
			 *  returns something similar to this: ClassName@13123133 where numbers
			 *  after @ refer to the object id.
			 */

			indexofat = temp.toString().indexOf("@");       
			toClassName=temp.toString().substring(0, indexofat);                    //getting rid of the rest of the string
			//there was a simpler method using getClass
			//String toClassName = temp.getClass().getSimpleName(); //getName() or getTypeName() worked too
			if (toClassName.contentEquals(component_type) ) total+=temp.getCost();  //comparing the if the required class should be added to the sum
		}
		return total;


	}



	/**
	 * This is a different approach to solve the previous problem
	 * it uses forName method to get the type of required class using the string parameter
	 * then it goes through the array list and checks if each object is an instance of required type
	 * using the isInstance method.
	 * @param component_type is String that should represent the name of one the parts classes
	 * @return int the sum of all parts of that type of components
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */

	public int totalCostOfComponentsv2(String component_type) throws InstantiationException, IllegalAccessException {
		int total=0;
	
		try{
			
			Class<?> type = Class.forName(component_type); 
			Object o= type.newInstance();
			
			   //creating an object of the required class type to use it in our comparison
			for (Component temp : components){				  
				if  (temp.getClass().isInstance(o)) {	  //getClass returns the the class type of temp then isinstance compares it with the object type
					total+=temp.getCost();

				}
				System.out.println(type.toString() +type.getClass().getTypeName()+" "+temp.getClass().getTypeName());
				
			}


		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();


		}
		
		return total;
	}

	
	
	
		
	

	/**
	 * used to add components to the components array list in the store
	 * @param newComponent the object to be added
	 * @return boolean on success
	 */
	public boolean addComponent(Component newComponent) { 

		if (components.add(newComponent))
			return true;
		else return false;
	}


}




