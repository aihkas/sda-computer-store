
import java.util.ArrayList;
import java.util.Iterator;


public class ComputerStore {

	
	private ArrayList<Computer> computers;
	
	
	
	
public ComputerStore () {
	
	computers = new ArrayList<Computer>();
	
}
	



public boolean addComputer(Computer newComputer) { 
	
	computers.add(newComputer);
	return true;
	
}

public boolean removeComputer(int index) {
	if (index>0 && index<computers.size()){
	computers.remove(index);
	return true;
	}
	else return false;
	
}

public void printAllComputers( ) {           // prints out all the details of each computer in store
   int i=1;
	for (Computer temp : computers ) {
		
		System.out.println("Computer number : "+i);
		temp.printComputerSummary();
		i++;
		
}
}

public void printTotalValue( ) {
    // prints the total cost for all computers
	System.out.println("This method prints the total cost for all computers");
	int i=1;
for (Computer temp : computers ) {
	    
		System.out.println("Computer number : "+i+" has the total cost of "+temp.getPrice());
		i++;
}
}

public Computer findMostExpensiveComputerV1( ) { 
	Computer highest= computers.get(0);
	for (int index=1; index<computers.size();index++){
	if (highest.getPrice()<computers.get(index).getPrice()) {
		highest= computers.get(index);

		}
	}
	return highest;
}
//This version will use a traditional for loop


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
//This version will use a traditional while loop
public Computer findMostExpensiveComputerV3( ) {
	
	Computer highest= computers.get(0);
	
	for (Computer c : computers)
	if (highest.getPrice()<c.getPrice()) {
		highest=c;

		}
	
	
	return highest;
}
//This version will use a for-each loop
public Computer findMostExpensiveComputerV4( ) { 
	
Computer highest= computers.get(0);
Iterator<Computer> it= computers.iterator();
Computer current=null;
while(it.hasNext()) {
     	current=it.next();
       	if (highest.getPrice()<current.getPrice()) 
		highest=current;

	
		}

	return highest;
	
}
}
//This version will use an Iterator object with a while loop



