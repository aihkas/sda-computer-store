
public class Display extends Component {


	//private int cost;
	//private String brand;
    //private String model;
    //private int itmNum;
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


	public String getDescription() {
String s="";
		s=s.concat(" The display is a "+ brand + " Cost: "+cost+" and the size is (inches) "+ size);
return s;
	}







}







