
import java.lang.Math;      //needed for generating random integers while testing


/**
* Computer class is a simple representation of the components included in a computer.
* it stores the the total price of the device.
* It also has the main method that is used to test the whole structure.
* @author  Aiham Alkaseer
* @version 1.0
* @since   2017-01-27 
*/





public class Computer {

private Processor theProcessor;
private HardDisk theHardDisk;
private Display theDisplay;
private int total;          //the total price of all components of the computer
	





/**
 *constructor for Computer.
 *It takes no parameters, and it calls the constructor of each of the fields.
 *for testing purposes it will give a random integer between 1-100 for each one of the components
 */

public Computer() {
	
	
	theProcessor = new Processor();
    theHardDisk = new HardDisk();
    theDisplay = new Display();
 
    theProcessor.setCost((int) Math.floor(Math.random() * 101));
    theHardDisk.setCost((int) Math.floor(Math.random() * 101));
    theDisplay.setCost((int) Math.floor(Math.random() * 101));
 
    total=getPrice();
 

}

public static void main (String args[]){
	
	
	Computer test= new Computer();
	Computer test1= new Computer();
	Computer test2= new Computer();
	Computer test3= new Computer();   //creating 4 objects to be then added for testing ComputerStore methods
	
	

	ComputerStore storeTest = new ComputerStore();
	
	storeTest.addComputer(test);
	storeTest.addComputer(test1);
	storeTest.addComputer(test2);
	storeTest.addComputer(test3);
	
	storeTest.printAllComputers();
	storeTest.printTotalValue();
	System.out.println("\nV1 Most expensive is "+storeTest.findMostExpensiveComputerV1().getPrice());
	System.out.println("V2 Most expensive is "+storeTest.findMostExpensiveComputerV2().getPrice());
	System.out.println("V3 Most expensive is "+storeTest.findMostExpensiveComputerV3().getPrice());
	System.out.println("V4 Most expensive is "+storeTest.findMostExpensiveComputerV4().getPrice());
	
	
	
}



/**
 * This method is used to get the total price of the computer
 * by calling the cost getters for each component
 * @return int This returns the total.
 */
public int getPrice () {
	total= theProcessor.getCost() +  theHardDisk.getCost() +  theDisplay.getCost();
	return total;
	
}


/**
 * print a summary of the Computer components and calculate a total cost.
 * it calls the local print methods for each object of the components
 * 
 */


public void printComputerSummary() {
	System.out.println("This Computer has the following components : ");
	theProcessor.printInfo();
	theHardDisk.printInfo();
	theDisplay.printInfo();
 	System.out.println("The total cost of this Computer is : " + this.getPrice()+"\n");
}


public void setTotal (int t) {
	total=t;
	
}


}