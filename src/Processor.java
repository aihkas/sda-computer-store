
public class Processor extends Component {


	//private int cost;
	//private String brand;
	//private String model;
	//private int itmNum;
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

	public String getDescription() {
String s="";
		s=s.concat(" The processor is an "+ brand +", Cost: "+cost+" and the clock speed is "+ clock);
return s;
	}





}
