
import java.lang.Math;      //needed for generating random integers while testing
import java.util.Iterator;
import java.util.HashMap;



/** * Computer class is a simple representation of the components included in a computer.
 * it stores the the total price of the device.
 * @author  Aiham Alkaseer
 * @version 1.0
 * @since   2017-01-27 
 */





public class Computer {

	private Processor theProcessor;
	private HardDisk theHardDisk;
	private Display theDisplay;
	private int total;    //the total price of all components of the computer

	HashMap<String, Component>  configuration=new HashMap<>();



	/**
	 *constructor for Computer.
	 *It takes no parameters, and it calls the constructor of each of the fields.
	 *for testing purposes it will give a random integer between 1-100 for each one of the components
	 */

	public  Computer() {

		configuration=new HashMap<String, Component>();
		theProcessor = new Processor();
		theHardDisk = new HardDisk();
		theDisplay = new Display();
                theProcessor.setBrand("intel");
                theHardDisk.setBrand("WD");
                theDisplay.setBrand("sony");
		theProcessor.setCost((int) Math.floor(Math.random() * 101));
		theHardDisk.setCost((int) Math.floor(Math.random() * 101));
		theDisplay.setCost((int) Math.floor(Math.random() * 101));
                theProcessor.setClock((int) Math.floor(Math.random() * 101));
		theHardDisk.setSize((int) Math.floor(Math.random() * 101));
		theDisplay.setSize((int) Math.floor(Math.random() * 101));

		total=getPrice();


	}
        
        public Computer (HardDisk h,Display d,Processor p){
            
            theHardDisk=h;
            theDisplay=d;
            theProcessor=p;
           
          
            
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
	 * it calls the local print methods for each object of the components.
	 * the method was updated to check if the computer has its custom set of components, and if
	 * it does it will use an iterator object to go through each key of the hash map then prints
	 * the key and its value, to show at the end of execution a list of all components of the
	 * computer.
	 *
	 */




	public String printComputerSummary() {
		String s="";			//Checking if this computer has a list of custom components
			s=s.concat("Main components of the computer: ");
			s=s.concat(theProcessor.getDescription());
			s=s.concat(theHardDisk.getDescription());
			s=s.concat(theDisplay.getDescription());
			//s=s.concat("The total cost of this Computer is : " + this.getPrice()+"\n");
		

		if (!configuration.isEmpty()){
			s=s.concat("This computer has a customized configuration that includes: ") ;
			Iterator it = configuration.entrySet().iterator();
			while (it.hasNext()) {
				HashMap.Entry temp = (HashMap.Entry)it.next();  // temp is temporary reference to a map pair (key and value)
				Component value = (Component)temp.getValue();   // setting the value to a temporary Component object
				s=s.concat(temp.getKey() + " : ") ;             // print the key which is a String by definition
				s=s.concat(value.getDescription());             // calling the getDescription method on the component object that prints on screen the details of the component
				it.remove();                                    // avoids a ConcurrentModificationException
			}
		}
                return s;
	}


	/**
	 * @return the theProcessor
	 */
	public Processor getTheProcessor() {
		return theProcessor;
	}




	/**
	 * @return the theHardDisk
	 */
	public HardDisk getTheHardDisk() {
		return theHardDisk;
	}




	/**
	 * @return the theDisplay
	 */
	public Display getTheDisplay() {
		return theDisplay;
	}




	public void setTotal (int t) {
		total=t;

	}


	/**
	 * adding a component to the hash map of a custom built pc
	 * @param s the string is the key in the hash map and it should describe the component
	 * @param c the object of component or its sub-calsees to be added
	 */
	public void addComponent (String s, Component c){
          
        configuration.put(s, c);

	}



	/**
	 * deletes a <k,v> pair of the hash map
	 * @param name the key of component to be deleted
	 * 
	 */
	public void removeComponent(String name){

		configuration.remove(name);			
	}
}




