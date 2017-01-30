
public class HardDisk extends Component {


	//private int cost;
	//private String brand;
	//private String model;
	//private int itmNum;
	private int size;


	public HardDisk (String brand, int cost, int size) {
		this.brand= brand;
		this.cost=cost;
		this.size=size;

	}


	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public HardDisk (){


	}

	public void getDescription() {

		System.out.println(" The Hard Disk is a "+ brand +", Cost: "+cost+" and the size is (tb) "+ size);

	}





}
