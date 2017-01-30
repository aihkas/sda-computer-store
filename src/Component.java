
public class Component {

	protected String brand;
	protected int cost;


	
	
	
	public void getDescription() {

		System.out.println("Compenent's brand: "+ brand +" and its cost is "+cost);
		
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
