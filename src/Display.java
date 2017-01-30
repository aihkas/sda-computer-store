
public class Display extends Component {


	//private int cost;
	//private String brand;
	private String model;
	private int itmNum;
	private int size;






	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	
	public Display (String brand, int cost, int size) {
		this.brand= brand;
		this.cost=cost;
		this.size=size;
		
	}
	
public Display () {
		
		
	}
	

	public void getDescription() {

		System.out.println(" The display is a "+ brand + "   Cost: "+cost+" and the size is"+ size);

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






}







