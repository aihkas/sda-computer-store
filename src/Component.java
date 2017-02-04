
/**
 * Component is the father class of computer parts sub-classes
 * it stores the common data of all parts and defines a general method to get the
 * description of each.
 * @author Ayham
 *
 */


public class Component {

	protected String brand;
	protected int cost;





	/**
	 * This method prints the description of the component in case that the sub class
	 * doesn't have its own.
	 */
	public String getDescription() {
String s="";
		s=s.concat("Compenent's brand: "+ brand +" and its cost is "+cost);
return s;
	}








	public int getCost () {

		return cost;

	}

	public void setCost (int cost) {

		this.cost= cost;

	}


	public String getBrand() {
		return brand;
	}



	public void setBrand(String brand) {
		this.brand = brand;
	}




}
