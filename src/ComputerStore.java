
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


	public ComputerStore () {

		computers = new ArrayList<Computer>();

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
}




