
public class Processor {


	private int cost;
	private String brand;
	private String model;
	private int itmNum;
	private int clock;


	public int getClock() {
		return clock;
	}

	public void setClock(int clock) {
		this.clock = clock;
	}

	public Processor ()

	{


	}

	public void printInfo() {

		System.out.println(" The processor is a "+ brand + " "+ model + "   Item number: "+ itmNum+"   Cost: "+cost);

	}


	public String getBrand() {
		return brand;
	}



	public void setBrand(String brand) {
		this.brand = brand;
	}



	public String getModel() {
		return model;
	}



	public void setModel(String model) {
		this.model = model;
	}



	public int getItmNum() {
		return itmNum;
	}



	public void setItmNum(int itmNum) {
		this.itmNum = itmNum;
	}







	public int getCost () {

		return cost;

	}

	public void setCost (int cost) {

		this.cost= cost;

	}
}
