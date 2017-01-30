
public class HardDisk {


	private int cost;
	private String brand;
	private String model;
	private int itmNum;
	private int size;



	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public HardDisk (){


	}

	public void printInfo() {

		System.out.println(" The Hard Disk is a "+ brand + " "+ model + "   Item number: "+ itmNum+"   Cost: "+cost);

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
