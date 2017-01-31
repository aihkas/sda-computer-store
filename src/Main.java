
/**
 *This class has a main method that is used to test the whole structure.
 * @author  Aiham Alkaseer
 * @version 1.0
 * @since   2017-01-27 
 */






public class Main {



	public static void main (String args[]) throws InstantiationException, IllegalAccessException{


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
		Component hdd1 = new HardDisk("Seagate", 150, 2);
		myPC.addComponent("hard disk 1", hdd1);

		// Add a second hard disk
		Component hdd2 = new HardDisk("Seagate", 150, 2);
		myPC.addComponent("hard disk 2", hdd2);

		
		
		/*
		 * at the following block we'll be testing the components array list at the store
		 * we will add the parts from our test computers, then call the methods that 
		 * do operations from part 3 to test how it works
		 * 
		 */
		
		storeTest.addComponent(test.getTheProcessor());
		System.out.println("processor 1 was added with the price of: "+test.getTheProcessor().cost);
		storeTest.addComponent(test1.getTheProcessor());
		System.out.println("processor 2 was added with the price of: "+test1.getTheProcessor().cost);
		//	storeTest.addComponent(test2.getTheProcessor());
		storeTest.addComponent(test.getTheHardDisk());
		System.out.println("Hard Disk 1 was added with the price of: "+test.getTheHardDisk().cost);
		storeTest.addComponent(test1.getTheHardDisk());
		System.out.println("Hard Disk 2 was added with the price of: "+test1.getTheHardDisk().cost);
		storeTest.addComponent(test2.getTheHardDisk());
		System.out.println("Hard Disk 3 was added with the price of: "+test2.getTheHardDisk().cost);
	

		System.out.println("Total cost of components is: "+storeTest.totalCostOfComponents());
		System.out.println("Total cost of Hard Disks is : "+storeTest.totalCostOfComponents("HardDisk"));
		System.out.println("Total cost of Processors is : "+storeTest.totalCostOfComponents("Processor"));
		
		System.out.println("V2Total cost of Hard Disks is : "+storeTest.totalCostOfComponentsv2("HardDisk"));
		System.out.println("V2Total cost of Processors is : "+storeTest.totalCostOfComponentsv2("Processor"));
		
		/*
		 * printing  summary for a computer that 
		 * was created by adding parts to its configuration array list
		 */
		
		myPC.printComputerSummary(); 
		
	
		
		 
		}


}
