
/**
 *This class has a main method that is used to test the whole structure.
 * @author  Aiham Alkaseer
 * @version 1.0
 * @since   2017-01-27 
 */



 


public class Main {

	
	
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

		// create a default basic configuration
		Computer myPC = new Computer( );

		// Add a hard disk
		Component hdd1 = new HardDisk(“Seagate”, 150, 2);
		myPC.addComponent(“hard disk 1”, hdd1);

		// Add a second hard disk
		Component hdd2 = new HardDisk(“Seagate”, 150, 2);
		myPC.addComponent(“hard disk 2”, hdd2);



	}

	
}
