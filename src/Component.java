import java.util.ArrayList;
public class Component {

	protected String brand;
	protected int cost;
	private ArrayList<Component>  components;

	
	
	
	public void getDescription() {

		System.out.println("Compenent's brand: "+ brand +" and its cost is "+cost);
		
	}
	
	
	public int totalCostOfComponents( ){
		int total=0;
		for (Component temp : components){
			total+=temp.getCost();
		}
		return total;
	}
	
	
	public int totalCostOfComponentsV1(String component_type) {
		int total=0;
		int indexofat=0;
		String toClassName;
		
		for (Component temp : components){
			 indexofat = temp.toString().indexOf("@");
			 toClassName=temp.toString().substring(0, indexofat);
			if (toClassName.contentEquals(component_type) ) total+=temp.getCost();
		}
		return total;
	
	
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
