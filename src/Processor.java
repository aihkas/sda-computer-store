
public class Processor extends Component {


	//private int cost;
	//private String brand;
	private String model;
	private int itmNum;
	private int clock;


	public int getClock() {
		return clock;
	}

	public void setClock(int clock) {
		this.clock = clock;
	}

	

	public Processor (String brand, int cost, int clock) {
		this.brand= brand;
		this.cost=cost;
		this.clock=clock;
		
	}
	
	public Processor () {
		
		
	}

	public void getDescription() {

		System.out.println(" The processor is a "+ brand +"  Cost: "+cost+" and the clock speed is"+ clock);

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
