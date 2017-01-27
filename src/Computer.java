
import java.lang.Math;

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
 
 theProcessor.setCost((int) Math.floor(Math.random() * 101));
 theHardDisk.setCost((int) Math.floor(Math.random() * 101));
 theDisplay.setCost((int) Math.floor(Math.random() * 101));
 
// total=getPrice();
 
 
}

public void setTotal (int t) {
	total=t;
	
}

public static void main (String args[]){
	
	
	Computer test= new Computer();
	//test.setTotal(216);
	Computer test1= new Computer();
	//test1.setTotal(53);
	Computer test2= new Computer();
	//test2.setTotal(248);
	Computer test3= new Computer();
	//test3.setTotal(166);
	

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


public int getPrice () {
	total= theProcessor.getCost() +  theHardDisk.getCost() +  theDisplay.getCost();
	return total;
	
}


//print a summary of the Computer components and calculate a total cost
//you will need method calls to get info about the other components
//e.g. theProcessor.getCost()
public void printComputerSummary() {
	System.out.println("This Computer has the following components : ");
 theProcessor.printInfo();
 theHardDisk.printInfo();
 theDisplay.printInfo();

 
 
 System.out.println("The total cost of this Computer is : " + this.getPrice()+"\n");
}
}