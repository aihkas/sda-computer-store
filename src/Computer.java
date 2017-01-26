
public class Computer {

	private Processor theProcessor;
	private HardDisk theHardDisk;
	private Display theDisplay;
	private int total;
	



//constructor for Computer
//takes no parameters
//it call the constructor of each of the fields
public Computer() {
	
	
 theProcessor = new Processor();
 theHardDisk = new HardDisk();
 theDisplay = new Display();

 
}

public static void main (String args[]){
	
	
	Computer test= new Computer();
	test.theDisplay.setBrand("Sony");
	test.printComputerSummary();
	
	
}




//print a summary of the Computer components and calculate a total cost
//you will need method calls to get info about the other components
//e.g. theProcessor.getCost()
public void printComputerSummary() {
	System.out.println("This Computer has the following components : ");
 theProcessor.printInfo();
 theHardDisk.printInfo();
 theDisplay.printInfo();

 total= theProcessor.getCost() +  theHardDisk.getCost() +  theDisplay.getCost();
 
 System.out.println("The total cost of this Computer is : " + total);
}
}